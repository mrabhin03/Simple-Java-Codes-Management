import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reverse extends JFrame implements ActionListener {
	JTextField t1, t3;
	JLabel l1, l3;
	JButton b1;

	Reverse() {
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
		String m = t1.getText(), Result = "";
		for (int i = m.length() - 1; i >= 0; i--) {
			Result += m.charAt(i);
		}
		t3.setText(Result);
	}

	public static void main(String args[]) {
		new Reverse();
	}
}
