import java.util.Scanner;

class Number {
    int value;

    Number(int value) {
        this.value = value;
    }
    boolean is_Even() {
        return value % 2 == 0;
    }
    boolean is_Prime() {
        if (value == 1)
            return false;
        for (int i = 2; i < value; i++)
            if (value % i == 0)
                return false;
        return true;
    }
    boolean is_Perfect() {
        int sum = 0;
        for (int i = 1; i < value; i++)
            if (value % i == 0)
                sum += i;
        return sum == value;
    }
    int find_Factorial(int n) {
        if (n == 0)
            return 1;
        return n * find_Factorial(n - 1);
    }
}

class pro10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = sc.nextInt();
        Number n = new Number(k);
        System.out.println("Is Even: " + n.is_Even());
        System.out.println("Is Prime: " + n.is_Prime());
        System.out.println("Is Perfect: " + n.is_Perfect());
        System.out.println("Factorial: " + n.find_Factorial(k));
    }
}