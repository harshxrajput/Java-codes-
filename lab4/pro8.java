class MyVolume {
    int vol;

    MyVolume(int side) { 
        vol = side * side * side;
    }
    MyVolume(int length, int breadth, int height) { 
        vol = length * breadth * height;
    }
    MyVolume(int radius, int height) { 
        vol = (int) 3.14 * radius * radius * height;
    }
    void display() {
        System.out.print("Volume = " + vol);
    }
}

public class pro8 {
    public static void main(String[] args) {
        MyVolume cube = new MyVolume(18);
        MyVolume cuboid = new MyVolume(8, 2, 5);
        MyVolume sphere = new MyVolume(5, 3);
        System.out.println("For Cube, ");
        cube.display();
        System.out.println("\nFor Cuboid, ");
        cuboid.display();
        System.out.println("\nFor Sphere, ");
        sphere.display();
    }
}