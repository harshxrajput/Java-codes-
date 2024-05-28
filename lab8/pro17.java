import java.util.LinkedList;
import java.util.Queue;

public class pro17 {
    static Queue<Integer> queue = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            while (true) {
                synchronized (queue) {
                    while (queue.size() >= MAX_SIZE) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = (int) (Math.random() * 100);
                    queue.add(value);
                    System.out.println("Produced: " + value);
                    queue.notify();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                synchronized (queue) {
                    while (queue.isEmpty()) {
                        try {
                            queue.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = queue.poll();
                    System.out.println("Consumed: " + value);
                    queue.notify();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
