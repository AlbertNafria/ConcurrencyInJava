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
public class Client {

	private String nom;
	private int numLitres;

	// Constructor, getter y setter
	public Client(String nom, int numLitres) {
		this.nom = nom;
		this.numLitres = numLitres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumLitres() {
		return numLitres;
	}

	public void setNumLitres(int numLitres) {
		this.numLitres = numLitres;
	}
}
