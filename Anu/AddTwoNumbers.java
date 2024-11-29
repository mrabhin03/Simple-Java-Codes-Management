import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTwoNumbers extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b;

    AddTwoNumbers() {
        // Set up the labels and text fields
        l1 = new JLabel("First Number");
        l1.setBounds(10, 10, 100, 20);
        t1 = new JTextField(20);
        t1.setBounds(160, 10, 150, 20);

        l2 = new JLabel("Second Number");
        l2.setBounds(10, 60, 100, 20);
        t2 = new JTextField(20);
        t2.setBounds(160, 60, 150, 20);

        l3 = new JLabel("Result");
        l3.setBounds(10, 110, 100, 20);
        t3 = new JTextField(20);
        t3.setBounds(160, 110, 150, 20);
        t3.setEditable(false); // Make result field non-editable

        // Set up the button
        b = new JButton("Add");
        b.setBounds(10, 210, 70, 40);

        // Add components to the frame
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(b);

        // Set up the frame
        setSize(400, 400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close window properly

        // Add action listener to the button
        b.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            // Get values from text fields and perform addition
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result = num1 + num2;

            // Display the result in the result text field
            t3.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            // Handle invalid input (non-integer values)
            JOptionPane.showMessageDialog(this, "Please enter valid integers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new AddTwoNumbers(); // Create an instance of the GUI
    }
}
