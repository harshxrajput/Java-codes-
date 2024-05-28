import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
        System.out.println("Rectangle is created");
    }

    void read() {
        System.out.println("Length is " + length);
        System.out.println("Breadth is " + breadth);
    }

    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area is " + area);
        System.out.println("Perimeter is " + perimeter);
    }
}

class pro6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r1 = new Rectangle(l, b);
        r1.read();
        r1.calculate();
        r1.display();
    }
}