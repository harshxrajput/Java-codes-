public class pro14 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread state: " + Thread.currentThread().getState());
        });
        thread.start();
        
    }
}
