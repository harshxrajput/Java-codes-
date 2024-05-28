import java.util.Scanner;

class Box {
    int height;
    int depth;
    int width;

    Box(int w, int h, int d) {
        height = h;
        depth = d;
        width = w;
    }

    int volume() {
        return width * height * depth;
    }
}

public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width : ");
        int width = sc.nextInt();
        System.out.print("Enter height : ");
        int height = sc.nextInt();
        System.out.print("Enter depth : ");
        int depth = sc.nextInt();

        Box b = new Box(width, height, depth);
        System.out.println("Volume of box: " + b.volume());
    }
}
