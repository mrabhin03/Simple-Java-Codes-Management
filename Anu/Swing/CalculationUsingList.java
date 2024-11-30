import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class CalculationUsingList extends JFrame implements ListSelectionListener {

	JTextField t1, t2, t3;
	JLabel l1, l2, l3;
	DefaultListModel<String> ll;
	JList<String> list;

	CalculationUsingList() {
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

		ll = new DefaultListModel<>();
		ll.addElement("Add");
		ll.addElement("Sub");
		ll.addElement("Mul");
		ll.addElement("Div");

		list = new JList<>(ll);
		list.setBounds(170, 180, 150, 100);
		list.addListSelectionListener(this);
		add(l2);
		add(list);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public void valueChanged(ListSelectionEvent ae) {
		int a, b, c;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		if (!ae.getValueIsAdjusting()) {
			String selopt = (String) list.getSelectedValue();
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
		new CalculationUsingList();
	}
}
