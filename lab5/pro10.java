class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }

    void shownum() {
        System.out.println("Hexadecimal value: " + Integer.toHexString(number));
    }
}

public class pro10 {
    public static void main(String[] args) {
        Num num = new Num(10);
        num.shownum();
        HexNum hexNum = new HexNum(10);
        hexNum.shownum();
    }
}