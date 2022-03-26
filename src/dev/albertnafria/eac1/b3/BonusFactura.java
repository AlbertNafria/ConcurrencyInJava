package dev.albertnafria.eac1.b3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class BonusFactura {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //creo objecte ForkJoinPool
        ForkJoinPool pool = new ForkJoinPool();

        //creo array de clients
        CreaClients creaClients = new CreaClients();
        ArrayList<Client> clients = creaClients.obtenirLlistat();

        System.out.println("Introduïm codi del client a buscar");
        int codi = lector.nextInt();

        //busco client
        BuscaClient buscaClient = new BuscaClient(clients, 0, clients.size() - 1, codi);

        // crida el client buscat i espero que es completin i ho guardo en un objecte Client anomenat "a"
        Client a = pool.invoke(buscaClient);

        if (a == null) {
            System.out.println("El client intruduït NO existeix");
        } else {
            System.out.println("el codi del client és: " + a.codi + " el total de les seves factures son " + df.format(a.compres) + "€, per tant l'hi retornem el 10%, que és: " + df.format(a.compres / 10) + "€");

        }

    }

}
