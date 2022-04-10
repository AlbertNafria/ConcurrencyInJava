/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac2.b1;

/**
 *
 * @author Usuari
 */
public class Principal {

	public static void main(String[] args) {
		// Creem timestamp al arrancar el programa
		long tempsInicial = System.currentTimeMillis();
		// Instàncies de Client
		Client client1 = new Client("Client 1", 20);
		Client client2 = new Client("Client 2", 50);
		//Instàncies de Sortidor
		Sortidor sortidor1 = new Sortidor("Sortidor 1");
		Sortidor sortidor2 = new Sortidor("Sortidor 2");

		// Executem processarCompra() de manera sequencial
		sortidor1.processarCompra(client1, tempsInicial);
		sortidor2.processarCompra(client2, tempsInicial);

		
	}
}