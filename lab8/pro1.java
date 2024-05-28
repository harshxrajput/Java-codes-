import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string:");
        String first = scanner.nextLine();
        System.out.print("Enter second string:");
        String second = scanner.nextLine();

        if (first.contains(second)) {
            System.out.println("First string contains second string.");
        } else {
            System.out.println("First string does not contain second string.");
        }
    }
}
