/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac2.b3;

import java.util.Random;


/**
 * @author Albert Nafría
 */
class Client extends Thread {
    private static final int MAX_DELAY = 2000;
    private static final int MAX_COST = 100;
    private int id;
    private Sortidor sortidor;

    Client(int id, Sortidor sortidor) {
        this.id = id;
        this.sortidor = sortidor;
    }

    public void run() {

        Random random = new Random();
        Long tempsInicial = System.currentTimeMillis();
        try {
            System.out.println("Client " + this.id + " Intenta ficar benzina");
            Thread.sleep(random.nextInt(MAX_DELAY));
            sortidor.esperar(this.id);
            System.out.print("Client " + this.id + " en cua amb ");
            sortidor.imprimir();
            Thread.sleep(random.nextInt(MAX_DELAY));
            sortidor.atendre(random.nextInt(MAX_COST));
            Long retard = System.currentTimeMillis() - tempsInicial;
            Resultats.clients_atessos++;
            System.out.println("Client " + this.id + " atès");
            Resultats.temps_espera = Resultats.temps_espera + retard;

            System.out.println("Client " + this.id + " sortint després d'esperar " + retard + " milisegons");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}