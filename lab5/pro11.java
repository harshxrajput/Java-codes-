class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void shownum() {
        System.out.println("Number: " + number);
    }
}

class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }

    public void shownum() {
        System.out.println("Octal value: " + Integer.toOctalString(number));
    }
}

public class pro11 {
    public static void main(String[] args) {
        Num num = new Num(12);
        OctNum octNum = new OctNum(12);
        num.shownum();
        octNum.shownum();
    }
}