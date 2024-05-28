class Point {
    int x, y, z;
 
    Point() {
        x = 0;
        y = 0;
        z = 0;
    }
 
    Point(int x) {
        this.x = x;
        y = 0;
        z = 0;
    }
 
    Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
 
    float find_distance() {
        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z,
                2));
    } 
 
    float find_distance(int x1, int y1, int z1) {
        return (float) Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2) +
                Math.pow(z - z1, 2));
    }
 
    float find_distance(Point p) {
        return (float) Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2) +
                Math.pow(z - p.z, 2));
    }
 
    boolean is_Equal(Point p1) {
        return x == p1.x && y == p1.y && z == p1.z;
    }
 
    void show() {
        System.out.println("x = " + x + "\ny = " + y + "\nz = " + z);
    }
}
 
class pro10_3 {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(1, 2, 3);
        Point p3 = new Point(4, 7, 2);
        System.out.println("Distance between p1 and origin: " +
                p1.find_distance());
        System.out.println("Distance between p1 and p2: " +
                p1.find_distance(3, 4, 5));
        System.out.println("Distance between p1 and p3: " +
                p1.find_distance(p3));
        System.out.println("p1 and p2 are equal: " + p1.is_Equal(p2));
        System.out.println("p1 and p3 are equal: " + p1.is_Equal(p3));
        p1.show();
    }
}