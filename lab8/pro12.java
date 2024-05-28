public class pro12 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("Good morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread thread2 = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(200); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Welcome");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
