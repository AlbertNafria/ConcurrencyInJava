package dev.albertnafria.concurrency;


import static dev.albertnafria.utils.ThreadColor.*;

public class Concurrency {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "This is the main thread");

        final Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();
        //Creating anonymous class
        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "This is the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Anonymous class implementation of run");
                try {
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "Another thread terminated, so I'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all, I was interrupted");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();
        System.out.println(ANSI_PURPLE + "This is the main thread again");
    }
}