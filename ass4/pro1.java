import javax.swing.*;

public class pro1 extends JFrame {

    public pro1() {
        super("My First Frame");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        pro1 frame = new pro1();
        frame.setVisible(true);
    }
}