public class pattern5 {
    public static void triangle(int n, int i, boolean x) {
        for (int s = n; s >= 1; s--) {
            System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
            if (x && (i == 9 && j == 1)) {
                continue;
            }
            if (i == 1 || i == 9 || j == 1 || j == i) {
                System.out.print(" *");
            } else {
                System.out.print("  ");
            }
        }
    }

    public static void main(String[] args) {
        int i, nos = 0, nosp = -1, nbsp = -1;
        for (i = 9; i >= 1; i -= 2) {
            triangle(nos, i, false);
            triangle(nosp, i, true);
            triangle(nbsp, i, true);
            System.out.println();
            nos++;
            nosp += 2;
            nbsp += 2;
        }
        nos = 3;
        nosp = 5;
        nbsp = 5;
        for (i = 3; i <= 9; i += 2) {
            triangle(nos, i, false);
            triangle(nosp, i, true);
            triangle(nbsp, i, true);
            System.out.println();
            nos--;
            nosp -= 2;
            nbsp -= 2;
        }
    }
}