package dev.albertnafria.livelocks;
/**
 * We are going to create 2 worker threads that share a resource. When
 * they see that the other thread is active, they are goint to keep
 * the resource to the other thread and wait for it to finish using that resource
 */

public class PoliteWorker {
    public static void main(String[] args) {
        final Worker worker1 = new Worker("Worker 1", true);
        final Worker worker2 = new Worker("Worker 2", true);

        final SharedResource sharedResource = new SharedResource(worker1);

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker1.work(sharedResource, worker2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                worker2.work(sharedResource, worker1);
            }
        }).start();

    }
}
