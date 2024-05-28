import java.util.Arrays;

public class pro1 {
    public static void main(String[] args) {
        int[] A = { 1, 3, 5, 7, 9 };
        int[] B = { 2, 4, 6, 8, 10 };
        int[] C = new int[A.length + B.length];
        int i = 0, j = 0, k = 0;
        while (i < A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length) {
            C[k] = B[j];
            j++;
            k++;
        }
        System.out.println("Before:");
        System.out.println("Array 1: " + Arrays.toString(A));
        System.out.println("Array 2: " + Arrays.toString(B));
        System.out.println("After: \n" + Arrays.toString(C));
    }
}