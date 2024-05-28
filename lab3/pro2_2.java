import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    void area() {
        System.out.println("Area " + length * breadth);
    }
    void perimeter() {
        System.out.println("Perimeter is " + 2 * (length + breadth));
    }

}

class pro2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r1 = new Rectangle(l, b);
        r1.area();
        r1.perimeter();
    }
}