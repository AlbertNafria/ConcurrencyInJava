/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.albertnafria.eac1.b2;

/**
 *
 * @author tomas
 */
import java.util.Random;
import java.util.concurrent.*;


public class JugantExecutorSchedule {
 
 
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        //IMPLEMENTA

        // crea un pool únic
        final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        // Crear objecte Runnable.
        final Runnable r = new ExecutaFil();

        // Programa Fil, s'inicia immediatament 0 seg i després es va executant cada 5 segons
        executor.scheduleWithFixedDelay(r, 0, 5, TimeUnit.SECONDS);

        // Espera per acabar 60 segons
        executor.awaitTermination(60, TimeUnit.SECONDS);

        // shutdown .
        executor.shutdown();

        System.out.println("Completat");
    }



    

}