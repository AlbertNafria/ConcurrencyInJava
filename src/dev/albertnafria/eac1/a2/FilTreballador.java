/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac1.a2;

/**
 *
 * @author tomas
 */
public class FilTreballador implements Runnable {
 
	@Override
	public void run() {
		System.out.println ("Hora actual:" + System.currentTimeMillis () + "Nom del thread:"
				 + Thread.currentThread().getName() + " --- Estat: Comença a treballar  ... ---");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println ("Hora actual:" + System.currentTimeMillis () + "Nom del thread::"
				 + Thread.currentThread().getName() + " --- Estat: Finalitza el treball  ... ---");
	}
 
}