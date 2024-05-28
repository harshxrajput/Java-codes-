import java.util.*;

public class pro11 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
        int left_sum = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (i == j)
                    left_sum += a[i][j];
        int right_sum = 0;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (i == 2 - j)
                    right_sum += a[i][j];
        System.out.println("Left Diagonal Sum: " + left_sum);
        System.out.println("Right Diagonal Sum: " + right_sum);
    }
}