class Apple {
    void show() {
        System.out.println("Apple");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry");
    }
}

public class pro17 {
    public static void main(String[] args) {
        Apple a = new Apple();
        Banana b = new Banana();
        Cherry c = new Cherry();
        a.show();
        b.show();
        c.show();
    }
}