public class pattern9{
    public static void main(String[] args) {
        int k = 10;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= k; j++) {
                if (j > i * 2 && j < k - i * 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}