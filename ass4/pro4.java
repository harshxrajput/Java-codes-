import javax.swing.*;
import java.awt.BorderLayout;
//import java.awt.*;
import java.awt.Font;

public class pro4 extends JFrame {

    public pro4() {
        super("Border Layout Window");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());  

        JLabel northLabel = new JLabel("This is North Border", SwingConstants.CENTER);
        JLabel southLabel = new JLabel("This is South Border", SwingConstants.CENTER);

       southLabel.setFont(new Font("",Font.BOLD,30));
       northLabel.setFont(new Font("",Font.BOLD,30));

        add(northLabel, BorderLayout.NORTH);
        add(southLabel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        pro4 frame = new pro4();
        frame.setVisible(true);
    }
}
