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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
public class ThreadPoolTest {
 
	public static void main(String[] args) {
		System.out.println ("Activar grup de subprocessos ...");
		ExecutorService executorService = Executors.newFixedThreadPool(50);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new FilTreballador();
			executorService.execute(worker);
		}
		try {
			 Thread.sleep (5000); // El fil principal dorm durant 5 segons per una facilitar l'observació
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executorService.shutdown();
		 System.out.println ("Fin de la operación del grupo de subprocesos ...");
	}
 
}
