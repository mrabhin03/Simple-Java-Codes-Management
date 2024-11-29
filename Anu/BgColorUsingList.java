import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class BgColorUsingList extends JFrame implements ListSelectionListener {
	JLabel l2;
	DefaultListModel<String> ll;
	JList<String> list;

	BgColorUsingList() {
		l2 = new JLabel("Select an option");
		l2.setBounds(100, 50, 200, 30);
		ll = new DefaultListModel<>();
		ll.addElement("Red");
		ll.addElement("Purple");
		ll.addElement("Brown");

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
			String selclr = (String) list.getSelectedValue();
			if (selclr != null) {
				switch (selclr) {
					case "Red":
						getContentPane().setBackground(Color.RED);
						break;

					case "Purple":
						getContentPane().setBackground(new Color(128, 0, 128));
						break;

					case "Brown":
						getContentPane().setBackground(new Color(139, 69, 19));
						break;

				}

			}

		}
	}

	public static void main(String args[]) {
		new BgColorUsingList();
	}
}
