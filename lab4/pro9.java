import java.util.Scanner;

class sheet2d {
    int length, breadth;
    sheet2d(int l, int b) {
        length = l;
        breadth = b;
    }
    int cost() {
        return length * breadth * 40;
    }
}
class sheet3d extends sheet2d {
    int height;

    sheet3d(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    int cost() {
        return length * breadth * height * 60;
    }
}

class pro9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimensions of 2D-Sheet: ");
        sheet2d s1 = new sheet2d(sc.nextInt(), sc.nextInt());
        System.out.println("Cost of 2D-Sheet is Rs." + s1.cost());
        System.out.print("Enter the dimensions 3D-Sheet: ");
        sheet3d s2 = new sheet3d(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Cost of 3D-Sheet is Rs." + s2.cost());
    }
}