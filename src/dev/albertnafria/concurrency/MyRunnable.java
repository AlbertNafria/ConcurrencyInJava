package dev.albertnafria.concurrency;

import static dev.albertnafria.utils.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Runnable implementation of run");
    }
}
