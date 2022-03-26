package dev.albertnafria.eac1.b3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author 
 */
public class CreaClients {
    
    ArrayList<Client>clients = new ArrayList();
    
    ArrayList<Client> obtenirLlistat(){
        Random r = new Random();
        for (int i = 1; i <= 15000; i++) {
            Client al= new Client(i,r.nextFloat()*2000);
            clients.add(al);
                     
        }
        Collections.shuffle(clients);
        return clients;
        
        
        
        
    }
    
    
}
