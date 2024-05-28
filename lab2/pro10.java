import java.util.*;

class pro10 {
    private static boolean checkIfExist(int k, int[] arr) {
        for (int element : arr) {
            if (element == k) {
                return true;
            }
        }
        return false;
    }
 
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            a[i] = in.nextInt();
        }
        int[] b = new int[5];
        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (!checkIfExist(a[i], b)) {
                System.out.println("Count of '" + a[i] + "' = " + count);
            }
            b[i] = a[i];
        }
    }
}