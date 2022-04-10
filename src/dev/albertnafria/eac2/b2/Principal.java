/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac2.b2;


/*//*
 *
 * @author Usuari
 */
public class Principal {

	public static void main(String[] args) {
		long tempsInicial = System.currentTimeMillis();

		// Creació de les instàncies de Client
		Client client1 = new Client("Client 1", 20);
		Client client2 = new Client("Client 2", 15);

		// Creació de les instàncies de SortidorThread
		SortidorThread c1 = new SortidorThread("Client 1", client1, tempsInicial);
		SortidorThread c2 = new SortidorThread("Client 2", client2, tempsInicial);

		// Invocació métode start()
		c1.start();
		c2.start();

	}
}
