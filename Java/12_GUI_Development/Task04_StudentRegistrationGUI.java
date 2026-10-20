import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task04_StudentRegistrationGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(380, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel labelName = new JLabel("Student Name:");
        JTextField fieldName = new JTextField();

        JLabel labelId = new JLabel("Student ID:");
        JTextField fieldId = new JTextField();

        JLabel labelDept = new JLabel("Department:");
        String[] departments = {"CSE", "SWE", "EEE", "BBA", "Civil"};
        JComboBox<String> deptDropdown = new JComboBox<>(departments);

        JButton btnSubmit = new JButton("Register");
        JButton btnClear = new JButton("Clear");

        panel.add(labelName);
        panel.add(fieldName);
        panel.add(labelId);
        panel.add(fieldId);
        panel.add(labelDept);
        panel.add(deptDropdown);
        panel.add(btnSubmit);
        panel.add(btnClear);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = fieldName.getText().trim();
                String id = fieldId.getText().trim();
                String dept = (String) deptDropdown.getSelectedItem();

                if (name.isEmpty() || id.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    String message = "Student Registered Successfully!\nName: " + name + "\nID: " + id + "\nDepartment: " + dept;
                    JOptionPane.showMessageDialog(frame, message, "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldName.setText("");
                fieldId.setText("");
                deptDropdown.setSelectedIndex(0);
            }
        });

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}