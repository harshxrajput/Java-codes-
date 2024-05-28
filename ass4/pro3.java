import javax.swing.*;
import java.awt.*;

public class pro3 extends JFrame {

    public pro3() {
        super("Border Layout Window");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());  

        JLabel northLabel = new JLabel("This is North Border", SwingConstants.CENTER);
        JLabel southLabel = new JLabel("This is South Border", SwingConstants.CENTER);

        add(northLabel, BorderLayout.NORTH);
        add(southLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        pro3 frame = new pro3();
        frame.setVisible(true);
    }
}
