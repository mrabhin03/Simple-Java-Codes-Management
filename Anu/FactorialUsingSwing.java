import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialUsingSwing extends JFrame implements ActionListener {
	JTextField t1, t3;
	JLabel l1, l3;
	JButton b1;

	FactorialUsingSwing() {
		l1 = new JLabel("First Number");
		l1.setBounds(10, 10, 100, 20);
		t1 = new JTextField(20);
		t1.setBounds(160, 10, 150, 20);

		l3 = new JLabel("Result");
		l3.setBounds(10, 110, 100, 20);
		t3 = new JTextField(20);
		t3.setBounds(160, 110, 150, 20);

		add(l1);
		add(l3);
		add(t1);
		add(t3);

		b1 = new JButton("Find");
		b1.setBounds(10, 210, 70, 40);
		add(b1);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		b1.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(t1.getText());
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact *= i;
		}
		t3.setText("Factorial of " + a + " is " + fact);
	}

	public static void main(String args[]) {
		new FactorialUsingSwing();
	}
}
