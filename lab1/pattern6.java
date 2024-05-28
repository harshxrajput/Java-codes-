public class pattern6 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j <= i || j >= 2 * n - i) {
                    System.out.print(" ");
                } else {
                    if (i < n / 2) {
                        if (j > n - i && j < n + i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    } else System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}