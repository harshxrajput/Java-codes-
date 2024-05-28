import java.util.*;

public class pro4 {
    public static void main(String[] args) {
        System.out.print("enter number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int reverse = 0;
        while (temp != 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }
        if (number == reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
