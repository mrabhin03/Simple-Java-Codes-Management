import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculationExampl5 extends JFrame implements ActionListener {
	JTextField t1, t2, t3;
	JLabel l1, l2, l3;
	JRadioButton b1, b2, b3, b4;

	CalculationExampl5() {
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
		ButtonGroup bg = new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);

		b1 = new JRadioButton("Add");
		b1.setBounds(10, 210, 70, 40);
		add(b1);
		b2 = new JRadioButton("Sub");
		b2.setBounds(80, 210, 70, 40);
		add(b2);
		b3 = new JRadioButton("Mul");
		b3.setBounds(150, 210, 70, 40);
		add(b3);
		b4 = new JRadioButton("Div");
		b4.setBounds(220, 210, 70, 40);
		add(b4);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
		if (e.getSource() == b1) {
			t3.setText(String.valueOf(a + b));
		} else if (e.getSource() == b2) {
			t3.setText(String.valueOf(a - b));
		} else if (e.getSource() == b3) {
			t3.setText(String.valueOf(a * b));
		} else if (e.getSource() == b4) {
			if (b != 0) {
				t3.setText(String.valueOf(a / b));
			} else {
				t3.setText("Error: Div by 0");
			}
		}
	}

	public static void main(String args[]) {
		new CalculationExampl5();
	}
}