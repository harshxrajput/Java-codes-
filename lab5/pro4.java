class A {
    A() {
        System.out.println("First done");
    }

    A(int x) {
        System.out.println("Second done");
    }
}

public class pro4 {
    public static void main(String[] args) {
        new A();
        new A(77);
    }
}