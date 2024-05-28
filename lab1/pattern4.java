//Butterfly Pattern
public class pattern4{
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= 5; i++) {
            loop(i, n);
            for (int k = 1; k <= i; k++) {
                if (i == 5 && k == 1) {
                    continue;
                }
                if (k % 2 != 0) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            n -= 2;
        }
        n = 1;
        for (int p = 4; p >= 1; p--) {
            loop(p, n);
            for (int k = 1; k <= p; k++) {
                if (k % 2 != 0) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
            n += 2;
        }
    }
    private static void loop(int i, int nos) {
        for (int j = 1; j <= i; j++) {
            if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                System.out.print("  *");
            } else {
                System.out.print("   ");
            }
        }
        for (int s = nos; s >= 1; s--) {
            System.out.print("   ");
        }
    }
}