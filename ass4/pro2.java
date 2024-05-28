import java.awt.BorderLayout;
import javax.swing.*;

public class pro2 extends JFrame {

    public pro2() {
        super("Border Layout Window");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton northButton = new JButton("north");
        JButton southButton = new JButton("south");
        JButton eastButton = new JButton("east");
        JButton westButton = new JButton("west");
        JButton centerButton = new JButton("center");

        add(northButton,BorderLayout.NORTH);
        add(southButton,BorderLayout.SOUTH);
        add(eastButton,BorderLayout.EAST);
        add(westButton,BorderLayout.WEST);
        add(centerButton,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        pro2 frame = new pro2();
        frame.setVisible(true);
    }
}