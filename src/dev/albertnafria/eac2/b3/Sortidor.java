/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac2.b3;

/**
 * @author Albert Nafría
 */
public class Sortidor {

    private static final int MAX_TIME = 1000;

    class Node {
        int client;
        Node sig;
    }

    Node arrel, fons;

    public Sortidor() {
        arrel = null;
        fons = null;
    }

    private boolean buida() {
        if (arrel == null)
            return true;
        else
            return false;
    }

    synchronized public void esperar(int id_client) throws InterruptedException {
        Node node = new Node();
        node.client = id_client;
        node.sig = null;
        if (buida()) {
            arrel = node;
            fons = node;
        } else {
            fons.sig = node;
            fons = node;
        }
        while (arrel.client != id_client) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    synchronized public void atendre(int pagament) throws InterruptedException {
        if (!buida()) {
            if (arrel == fons) {
                arrel = null;
                fons = null;
            } else {
                arrel = arrel.sig;
            }
        }
        notify();
        Resultats.guanys = Resultats.guanys + pagament;

    }

    synchronized public void imprimir() {
        Node reco = arrel;
        while (reco != null) {
            System.out.print(reco.client + "-");
            reco = reco.sig;
        }
        System.out.println();
    }
}
  
