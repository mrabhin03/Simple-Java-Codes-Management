import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculationCheckBox extends JFrame implements ActionListener {
	JTextField t1, t2, t3;
	JLabel l1, l2, l3;
	JCheckBox b1, b2, b3, b4, b5;
	String selectedOperation;

	CalculationCheckBox() {
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

		b1 = new JCheckBox("Add");
		b1.setBounds(10, 210, 70, 40);
		add(b1);
		b2 = new JCheckBox("Sub");
		b2.setBounds(100, 210, 70, 40);
		add(b2);
		b3 = new JCheckBox("Mul");
		b3.setBounds(180, 210, 70, 40);
		add(b3);
		b4 = new JCheckBox("Div");
		b4.setBounds(270, 210, 70, 40);
		add(b4);
		b5 = new JCheckBox("Submit");
		b5.setBounds(350, 210, 100, 40);
		add(b5);

		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		try {

			int a = Integer.parseInt(t1.getText());
			int b = Integer.parseInt(t2.getText());

			if (e.getSource() == b1) {
				selectedOperation = "Add";
			} else if (e.getSource() == b2) {
				selectedOperation = "Sub";
			} else if (e.getSource() == b3) {
				selectedOperation = "Mul";
			} else if (e.getSource() == b4) {
				selectedOperation = "Div";
			}

			if (e.getSource() == b5) {

				switch (selectedOperation) {
					case "Add":
						t3.setText(String.valueOf(a + b));
						break;
					case "Sub":
						t3.setText(String.valueOf(a - b));
						break;
					case "Mul":
						t3.setText(String.valueOf(a * b));
						break;
					case "Div":
						if (b != 0) {
							t3.setText(String.valueOf(a / b));
						} else {
							t3.setText("Error: Div by 0");
						}
						break;
					default:
						t3.setText("Select an operation");
				}
			}
		} catch (Exception re) {
			t3.setText("Invalid Input");
		}

	}

	public static void main(String args[]) {
		new CalculationCheckBox();
	}
}