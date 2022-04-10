/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac2.b2;

/**
 *
 * @author Usuari
 */
public class SortidorThread extends Thread {

	private String nom;

	private Client client;

	private long initialTime;

	// Constructor, getter & setter
	public SortidorThread(String nom, Client client, long initialTime) {
		this.nom = nom;
		this.client = client;
		this.initialTime = initialTime;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}

	@Override
	public void run() {
		System.out.println("El sortidor " + this.nom + " COMENÇA A DISPENSAR CARBURANT AL CLIENT: " + this.client.getNom() +
				" en el temps: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

		for (int i=1; i<=client.getLitres(); i++) {
			System.out.println("Processat " + i + " litres " + this.nom + "->TEMPS: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
			this.esperarXsegons(1);

		}
		System.out.println("El sortidor " + this.nom + " HA ACABAT DE PROCESSAR " + this.client.getNom() +
				" en el temps: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

	}

	void esperarXsegons(int segons) {
		try {
			Thread.sleep((segons * 1000)/(segons*2));
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}

}
}
