import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class ListExample2 extends JFrame implements ListSelectionListener {
	JLabel l2;
	DefaultListModel<String> ll;
	JList<String> list;

	ListExample2() {
		l2 = new JLabel("Select an option");
		l2.setBounds(100, 50, 200, 30);
		ll = new DefaultListModel<>();
		ll.addElement("yes");
		ll.addElement("no");
		ll.addElement("nuteral");

		list = new JList<>(ll);
		list.setBounds(100, 100, 50, 50);
		list.addListSelectionListener(this);
		add(l2);
		add(list);
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public void valueChanged(ListSelectionEvent ae) {
		if (!ae.getValueIsAdjusting()) {
			String selectedValue = list.getSelectedValue();
			l2.setText("Selected: " + selectedValue);

		}

	}

	public static void main(String args[]) {
		new ListExample2();
	}
}