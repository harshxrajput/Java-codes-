import java.util.Scanner;
 
class Plate {
    int length, width;
 
    Plate(int length, int width) {
        this.length = length;
        this.width = width;
    }
}
class Box extends Plate {
    int height;
 
    Box(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }
}
class WoodBox extends Box {
    int thick;
 
    WoodBox(int length, int width, int height, int thick) {
        super(length, width, height);
        this.thick = thick;
    }
}
public class pro16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length, width, height and thickness of wood box: ");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int height = sc.nextInt();
        int thick = sc.nextInt();
        WoodBox wb = new WoodBox(length, width, height, thick);
        System.out.println("Length: " + wb.length);
        System.out.println("Width: " + wb.width);
        System.out.println("Height: " + wb.height);
        System.out.println("Thickness: " + wb.thick);
    }
}