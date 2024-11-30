import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class BgColorUsingPopup extends JFrame implements ActionListener {

	JComboBox<String> cb1;
	JLabel l1;

	BgColorUsingPopup() {
		String pop[] = { "Red", "Blue", "Green", "Yellow", "Orange", "Black", "White", "Pink", "Violet", "Purple",
				"Grey", "Brown", "Violet" };
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
			String selclr = (String) cb1.getSelectedItem();
			if (selclr != null) {
				switch (selclr) {
					case "Red":
						getContentPane().setBackground(Color.RED);
						break;
					case "Blue":
						getContentPane().setBackground(Color.BLUE);
						break;
					case "Green":
						getContentPane().setBackground(Color.GREEN);
						break;
					case "Yellow":
						getContentPane().setBackground(Color.YELLOW);
						break;
					case "Orange":
						getContentPane().setBackground(Color.ORANGE);
						break;
					case "Black":
						getContentPane().setBackground(Color.BLACK);
						break;
					case "White":
						getContentPane().setBackground(Color.WHITE);
						break;
					case "Pink":
						getContentPane().setBackground(Color.PINK);
						break;
					case "Purple":
						getContentPane().setBackground(new Color(128, 0, 128));
						break;
					case "Grey":
						getContentPane().setBackground(Color.GRAY);
						break;
					case "Brown":
						getContentPane().setBackground(new Color(139, 69, 19));
						break;
					case "Violet":
						getContentPane().setBackground(new Color(238, 130, 238));
						break;
				}

			}

		}
	}

	public static void main(String args[]) {
		new BgColorUsingPopup();
	}
}
