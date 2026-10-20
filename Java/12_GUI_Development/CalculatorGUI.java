import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(300, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel labelNum1 = new JLabel("First Number: ");
        JTextField fieldNum1 = new JTextField(10);

        JLabel labelNum2 = new JLabel("Second Number:");
        JTextField fieldNum2 = new JTextField(10);

        JButton btnAdd = new JButton("+");
        JButton btnSub = new JButton("-");
        JButton btnMul = new JButton("*");
        JButton btnDiv = new JButton("/");

        JLabel labelResult = new JLabel("Result: ");

        ActionListener calculationListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(fieldNum1.getText());
                    double num2 = Double.parseDouble(fieldNum2.getText());
                    double result = 0;

                    if (e.getSource() == btnAdd) {
                        result = num1 + num2;
                    } else if (e.getSource() == btnSub) {
                        result = num1 - num2;
                    } else if (e.getSource() == btnMul) {
                        result = num1 * num2;
                    } else if (e.getSource() == btnDiv) {
                        if (num2 == 0) {
                            labelResult.setText("Result: Error (Division by 0)");
                            return;
                        }
                        result = num1 / num2;
                    }

                    labelResult.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    labelResult.setText("Result: Invalid Input");
                }
            }
        };

        btnAdd.addActionListener(calculationListener);
        btnSub.addActionListener(calculationListener);
        btnMul.addActionListener(calculationListener);
        btnDiv.addActionListener(calculationListener);

        frame.add(labelNum1);
        frame.add(fieldNum1);
        frame.add(labelNum2);
        frame.add(fieldNum2);
        frame.add(btnAdd);
        frame.add(btnSub);
        frame.add(btnMul);
        frame.add(btnDiv);
        frame.add(labelResult);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}