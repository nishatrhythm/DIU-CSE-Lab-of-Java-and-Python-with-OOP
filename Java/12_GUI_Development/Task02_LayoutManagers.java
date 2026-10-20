import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Task02_LayoutManagers {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Managers");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JButton("Flow 1"));
        topPanel.add(new JButton("Flow 2"));
        topPanel.add(new JButton("Flow 3"));

        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new JButton("Grid 1 (0,0)"));
        centerPanel.add(new JButton("Grid 2 (0,1)"));
        centerPanel.add(new JButton("Grid 3 (1,0)"));
        centerPanel.add(new JButton("Grid 4 (1,1)"));

        JPanel bottomPanel = new JPanel(new FlowLayout());
        bottomPanel.add(new JButton("Close"));

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}