import java.util.Scanner;

class pro5 {
    static void area(int r) {
        System.out.println("Area of circle is: " + (3.14 * r * r));
    }

    static void area(int l, int b) {
        System.out.println("Area of rectangle is: " + (l * b));
    }

    static void area(int a, int b, int c) {
        int s = (a + b + c) / 2;
        System.out.println("Area of triangle is: " + (Math.sqrt(s * (s - a) * (s - b) * (s - c))));
    }

    public static void main(String[] args) {
        System.out.print("Enter dimensions: ");
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String[] arr = in.split(" ");
        if (arr.length == 1) {
            int r = Integer.parseInt(arr[0]);
            area(r);
        } else if (arr.length == 2) {
            int l = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            area(l, b);
        } else if (arr.length == 3) {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            area(a, b, c);
        } else {
            System.out.println("Invalid input");
        }
    }
}