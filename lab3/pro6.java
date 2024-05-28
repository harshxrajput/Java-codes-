import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

public class pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(l, b);
        System.out.println("Area of rectangle with default constructor: " + r1.area());
        System.out.println("Area of rectangle with parameterized constructor: " + r2.area());
    }
}
