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
public class Sortidor {

	private String nom;

	// Constructor, getter y setter
	public Sortidor(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void processarCompra(Client client, long timeStamp) {
		System.out.println("El sortidor " + this.nom + " COMENÇA A DISPENSAR CARBURANT AL CLIENT: " + client.getNom() +
				" en el temps: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");

		for(int i=1; i<=client.getNumLitres(); i++) {
			System.out.println("Processat " + i + " litres ->Temps: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
			this.esperarXsegons(10);
		}

		System.out.println("El sortidor " + this.nom + " HA ACABAT DE PROCESSAR " + client.getNom() +
				" en el temps: " + (System.currentTimeMillis() - timeStamp) / 1000 + "seg");
	}


	private void esperarXsegons(int segons) {
		try {
			Thread.sleep((segons * 1000)/(segons*2));
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}