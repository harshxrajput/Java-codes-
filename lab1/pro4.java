public class pro4 {
    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        boolean r = hcf(10, 13) == 1;
        System.out.println("10 and 13 are coprime?\n" + r);
    }
}
