class Num {
    int number;

    public Num(int number) {
        this.number = number;
    }

    public void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }

    public void shownum() {
        System.out.println("Hexadecimal value: " + Integer.toHexString(number));
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

public class pro12 {
    public static void main(String[] args) {
        Num num = new Num(10);
        HexNum hexNum = new HexNum(10);
        OctNum octNum = new OctNum(10);
        num.shownum();
        hexNum.shownum();
        octNum.shownum();
    }
}