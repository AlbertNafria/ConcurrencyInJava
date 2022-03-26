package dev.albertnafria.eac1.b3;

import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Albert Nafría
 */
public class BuscaClient extends RecursiveTask<Client> {

    private ArrayList<Client> llistat;
    private int primer;
    private int ultim;
    private int codi;
    private static boolean trobat = false;

    public BuscaClient(ArrayList<Client> llistat, int primer, int ultim, int codi) {
        //IMPLEMENTAR
        this.llistat = llistat;
        this.primer = primer;
        this.ultim = ultim;
        this.codi = codi;

    }

    protected Client compute() {
        if (!trobat) {
            if (ultim-primer<10) {
                for (int i = primer; i <= ultim; i++) {
                    if (llistat.get(i).codi == codi) {
                        trobat = true;
                        return llistat.get(i);
                    }
                }
            } else {
                BuscaClient fork1 = new BuscaClient(llistat, primer, (primer + ultim) / 2, codi);
                BuscaClient fork2 = new BuscaClient(llistat, ((primer + ultim) / 2) + 1, ultim, codi);
                fork1.fork();
                fork2.fork();
                if (fork1.join() != null) {
                    return fork1.join();
                } else if (fork2.join() != null) {
                    return fork2.join();
                }
            }
        }
        return null;
    }

}
