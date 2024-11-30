
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class PopupExample extends JFrame implements ActionListener {

	JComboBox<String> cb1;
	JLabel l1;

	PopupExample() {
		String pop[] = { "Yes", "No", "Nutral", "Submit", "Error" };
		cb1 = new JComboBox<>(pop);
		cb1.setBounds(100, 100, 100, 100);
		setSize(400, 400);
		l1 = new JLabel();
		l1.setBounds(10, 100, 160, 30);

		add(l1);
		add(cb1);

		cb1.addActionListener(this);

		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == cb1) {
			System.out.println("Clicked" + cb1.getSelectedItem());
			l1.setText("Clicked" + cb1.getSelectedItem());
		}

	}

	public static void main(String args[]) {
		new PopupExample();
	}
}
