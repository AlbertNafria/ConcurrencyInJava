/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac1.b2;



import java.util.Random;

/**
 *
 * @author Usuari
 */

// Fil Runnable
 public class ExecutaFil implements Runnable {
    
    private String[] frases = {"Ajudem a creixer el Tenis","Felicitats Rafa!", "SuperCampió!", "21 titols de Grand Slam", "Nadal campió 12 cops del Compte de Godó","Vamos Rafa!", "Sort per Roland Garros!"};
        
        @Override
        
        public void run() {
        Random r = new Random();
        int valor = r.nextInt(frases.length);
        System.out.println("Frase del panell: "+ frases[valor]);
    }
}
 