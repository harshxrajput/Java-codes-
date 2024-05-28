
public class pro13 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

    }
}
