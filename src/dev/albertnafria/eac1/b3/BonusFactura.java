package dev.albertnafria.eac1.b3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class BonusFactura {
    
  private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        
        //IMPLEMENTA
        
        //creo objecte ForkJoinPool
        
        //creo array de clients
        
        System.out.println("Introduïm codi del client a buscar");
        int codi=lector.nextInt();
        
        
        //IMPLEMENTA
        
        //busco client
        
        // crida el client buscat i espero que es completin i ho guardo en un objecte Client anomenat "a"

/**
 *
 *       if (a == null) {
 *           System.out.println("El client intruduït NO existeix");
*
*        } else {
*            System.out.println("el codi del client és: " +a.codi + " el total de les seves factures son " + df.format(a.compres) + "€, per tant l'hi retornem el 10%, que és: " + df.format(a.compres/10) + "€" );
*
*        }
 */
    }

}
