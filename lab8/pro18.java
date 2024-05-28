public class pro18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Thread evenThread = new Thread(() -> {
            System.out.println("Even numbers:");
            for (int num : arr) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        });

        Thread oddThread = new Thread(() -> {
            System.out.println("Odd numbers:");
            for (int num : arr) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
