class Triangle {
    float a, b, c;
    float area, perimeter;

    void set_Dim(float d, float e, float f) {
        a = d;
        b = e;
        c = f;
    }

    boolean is_Triangle() {
        return a + b > c && b + c > a && c + a > b;
    }

    void find_area() {
        if (is_Triangle()) {
            float s = (a + b + c) / 2;
            area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            System.out.println("Not a Triangle");
        }
    }

    void find_perimeter() {
        if (is_Triangle())
            perimeter = a + b + c;
        else {
            System.out.println("Not a Triangle");
        }
    }
}

class pro10_1 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.set_Dim(5, 8, 5);
        t1.find_area();
        t1.find_perimeter();
        System.out.println("Area of Triangle is " + t1.area);
        System.out.println("Perimeter of Triangle is " + t1.perimeter);
    }
}