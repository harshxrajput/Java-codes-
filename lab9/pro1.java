import java.util.concurrent.Semaphore;

class SharedResource {
    Semaphore semaphore = new Semaphore(1);

    public void use(String threadName) {
        try {
            System.out.println(threadName + " is waiting for a permit.");
            semaphore.acquire();
            System.out.println(threadName + " has got a permit.");
            // Simulate time consuming operation
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " is performing operation " +
                        i + ", available Semaphore permits : " + semaphore.availablePermits());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            System.out.println(threadName + " has released the permit.");
            semaphore.release();
        }
    }
}

class WorkerThread extends Thread {
    private final SharedResource sharedResource;

    public WorkerThread(SharedResource sharedResource, String threadName) {
        super(threadName);
        this.sharedResource = sharedResource;
    }

    public void run() {
        sharedResource.use(Thread.currentThread().getName());
    }
}

public class pro1 {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        new WorkerThread(sharedResource, "Thread-1").start();
        new WorkerThread(sharedResource, "Thread-2").start();
    }
}