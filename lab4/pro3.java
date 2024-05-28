class Box {
    double length, width, height;

    public void volume() {
        System.out.println("Volume of box: " + (length * width * height));
    }
}

public class pro3{
    public static void main(String[] args) {
        Box Box = new Box();
        Box.length = Double.parseDouble(args[0]);
        Box.width = Double.parseDouble(args[1]);
        Box.height = Double.parseDouble(args[2]);

        Box.volume();
    }
}
