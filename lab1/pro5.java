public class pro5 {
    public static void main(String[] args) {
        int number = 12321;
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
