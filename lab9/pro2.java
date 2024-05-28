import java.util.concurrent.*;

public class pro2 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,
                () -> System.out.println("All parties have arrived at the barrier,let's continue execution."));
        Thread t1 = new Thread(new Task(barrier), "Thread 1");
        Thread t2 = new Thread(new Task(barrier), "Thread 2");
        Thread t3 = new Thread(new Task(barrier), "Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Task implements Runnable {
    private final CyclicBarrier barrier;

    public Task(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has arrived at the barrier.");
        try {
            barrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}