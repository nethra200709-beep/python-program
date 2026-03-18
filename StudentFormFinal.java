import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentFormFinal {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(450, 320);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setBackground(new Color(240, 248, 255));

        Font font = new Font("Arial", Font.PLAIN, 15);

        // Title
        JLabel title = new JLabel("Student Registration", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(new Color(0, 102, 204));

        // Fields
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(font);
        JTextField nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setFont(font);
        JTextField ageField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        courseLabel.setFont(font);

        String courses[] = {"Java", "Python", "C++", "Web Development"};
        JComboBox<String> courseBox = new JComboBox<>(courses);

        // Buttons
        JButton submitBtn = new JButton("Submit");
        JButton resetBtn = new JButton("Reset");

        submitBtn.setBackground(new Color(0, 153, 76));
        submitBtn.setForeground(Color.WHITE);

        resetBtn.setBackground(new Color(204, 0, 0));
        resetBtn.setForeground(Color.WHITE);

        // Add components
        panel.add(title);
        panel.add(new JLabel(""));

        panel.add(nameLabel);
        panel.add(nameField);

        panel.add(ageLabel);
        panel.add(ageField);

        panel.add(courseLabel);
        panel.add(courseBox);

        panel.add(submitBtn);
        panel.add(resetBtn);

        // Submit action with validation
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText();
                String age = ageField.getText();
                String course = (String) courseBox.getSelectedItem();

                // Validation
                if (name.isEmpty() || age.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all fields!");
                } else {
                    try {
                        Integer.parseInt(age); // check number

                        JOptionPane.showMessageDialog(frame,
                                "Name: " + name +
                                "\nAge: " + age +
                                "\nCourse: " + course);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Age must be a number!");
                    }
                }
            }
        });

        // Reset action
        resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                ageField.setText("");
                courseBox.setSelectedIndex(0);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}