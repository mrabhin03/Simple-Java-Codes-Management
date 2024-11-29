import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class CalculationUsingPopup extends JFrame implements ActionListener {

	JComboBox<String> cb1;
	JTextField t1, t2, t3;
	JLabel l1, l2, l3;

	CalculationUsingPopup() {
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

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		String pop[] = { "Add", "Sub", "Mul", "Div" };
		cb1 = new JComboBox<>(pop);
		cb1.setBounds(170, 180, 150, 100);
		setSize(400, 400);
		l1 = new JLabel();
		l1.setBounds(10, 100, 160, 30);

		add(cb1);

		cb1.addActionListener(this);

		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		int a, b, c;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		if (ae.getSource() == cb1) {
			String selopt = (String) cb1.getSelectedItem();
			if (selopt != null) {
				switch (selopt) {
					case "Add":
						c = a + b;
						t3.setText(String.valueOf(c));
						break;

					case "Sub":
						c = a - b;
						t3.setText(String.valueOf(c));
						break;

					case "Mul":
						c = a * b;
						t3.setText(String.valueOf(c));
						break;
					case "Div":
						c = a / b;
						t3.setText(String.valueOf(c));
						break;
				}

			}

		}
	}

	public static void main(String args[]) {
		new CalculationUsingPopup();
	}
}
