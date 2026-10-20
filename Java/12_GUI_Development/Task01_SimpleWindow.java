import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Task01_SimpleWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Window");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Welcome to Java GUI Programming!");
        JButton button = new JButton("Click Me");

        frame.add(label);
        frame.add(button);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}