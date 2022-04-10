/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac2.b2;

/**
 *
 * @author Albert Nafría
 */
public class Client {

	private String nom;
	private int litres;

	// Constructor, getter y setter
	public Client(String nom, int litres) {
		this.nom = nom;
		this.litres = litres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getLitres() {
		return litres;
	}

	public void setLitres(int litres) {
		this.litres = litres;
	}
}

