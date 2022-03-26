/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac1.b1;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Comandes {
    
    
	public static void main(String[] args) {
		
		//crear la comanda
		String cmd = "/usr/bin/ps";
		String flag = "aux";

		try {
			//Creo Objecte ProcessBuilder
			ProcessBuilder pb = new ProcessBuilder(cmd, flag);

			// Rediccionarem el resultat de la tasca a un fitxer extern
			pb.redirectOutput(new File(System.getenv("HOME") + "/Desktop/ps_out.txt"));

			//executes la comanda
			Process process = pb.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			//Faig sleep(1000)
			Thread.sleep(1000);
                        
			// Crear ProcessBuilder.
			ProcessBuilder pb2 = new ProcessBuilder();

			// Treballo amb un sistema Manjaro amb escriptori Xfce, mousepad és l'editor gràfic per defecte
			pb2.command("/usr/bin/mousepad", System.getenv("HOME") + "/Desktop/ps_out.txt");
			pb2.start();
                       
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
    
    
    

        
        
    

        
       