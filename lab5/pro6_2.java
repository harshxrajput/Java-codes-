import java.util.Scanner;

class ThreeDObject {
    double length, breadth, height;
    ThreeDObject(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    double wholeSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
 
    double volume() {
        return length * breadth * height;
    }
}
class Box extends ThreeDObject {
    Box(double length, double breadth, double height) {
        super(length, breadth, height);
    }
 
    double wholeSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
 
    double volume() {
        return length * breadth * height;
    }
}
class Cube extends ThreeDObject {
    Cube(double length) {
        super(length, length, length);
    }
 
    double wholeSurfaceArea() {
        return 6 * length * length;
    }
 
    double volume() {
        return length * length * length;
    }
}
class Cylinder extends ThreeDObject {
    Cylinder(double radius, double height) {
        super(radius, radius, height);
    }
 
    double wholeSurfaceArea() {
        return 2 * Math.PI * length * (length + height);
    }
 
    double volume() {
        return Math.PI * length * length * height;
    }
}
class Cone extends ThreeDObject {
    Cone(double radius, double height) {
        super(radius, radius, height);
    }
 
    double wholeSurfaceArea() {
        return Math.PI * length * (length + Math.sqrt(length * length + height * height));
    }
 
    double volume() {
        return Math.PI * length * length * height / 3;
    }
}
public class pro6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                MENU:
                1. Box
                2. Cube
                3. Cylinder
                4. Cone
                Enter your choice:\s""");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter length, breadth and height of the box:");
                Box box = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                System.out.println("Whole Surface Area: " + box.wholeSurfaceArea());
                System.out.println("Volume: " + box.volume());
            }
            case 2 -> {
                System.out.println("Enter length of the cube:");
                Cube cube = new Cube(sc.nextDouble());
                System.out.println("Whole Surface Area: " + cube.wholeSurfaceArea());
                System.out.println("Volume: " + cube.volume());
            }
            case 3 -> {
                System.out.println("Enter radius and height of the cylinder:");
                Cylinder cylinder = new Cylinder(sc.nextDouble(), sc.nextDouble());
                System.out.println("Whole Surface Area: " + cylinder.wholeSurfaceArea());
                System.out.println("Volume: " + cylinder.volume());
            }
            case 4 -> {
                System.out.println("Enter radius and height of the cone:");
                Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
                System.out.println("Whole Surface Area: " + cone.wholeSurfaceArea());
                System.out.println("Volume: " + cone.volume());
            }
            default -> System.out.println("Invalid choice!");
        }
    }
}