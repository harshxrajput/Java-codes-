import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.Font;

public class pro5 extends JFrame {

    public pro5() {
        super("Flow Layout Window");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton Button1 = new JButton("Button1");
        JButton Button2 = new JButton("This is Button");
        JButton Button3 = new JButton("Button2");
        JButton Button4 = new JButton("Execute");

        getContentPane().setLayout(new FlowLayout());

        add(Button1);
        add(Button2);
        add(Button3);
        add(Button4);
    }

    public static void main(String[] args) {
        pro5 frame = new pro5();
        frame.setVisible(true);
    }
}
