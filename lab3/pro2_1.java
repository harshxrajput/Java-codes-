import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    int area;
    int perimeter;
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    void read() {
        System.out.println("Length " + length);
        System.out.println("Breadth " + breadth);
    }
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }
    void display() {
        System.out.println("Area " + area);
        System.out.println("Perimeter " + perimeter);
    }

}
class pro2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length : ");
        int length=sc.nextInt();
        System.out.print("enter breadth : ");
        int breadth=sc.nextInt();
        System.out.println();
        Rectangle r1 = new Rectangle(length,breadth);
        r1.read();
        r1.calculate();
        r1.display();
    }
}