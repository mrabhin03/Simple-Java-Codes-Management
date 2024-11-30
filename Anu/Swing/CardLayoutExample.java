import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample extends JFrame implements ActionListener {
	JButton b1, b2, b3;
	CardLayout card;
	Container cpane;

	CardLayoutExample() {

		cpane = getContentPane();
		card = new CardLayout();

		cpane.setLayout(card);// new CardLayout());

		b1 = new JButton("Apple");
		b2 = new JButton("Orange");
		b3 = new JButton("Grapes");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		cpane.add("a", b1);
		cpane.add("b", b2);
		cpane.add("c", b3);

	}

	public void actionPerformed(ActionEvent e) {

		card.next(cpane);

	}

	public static void main(String args[]) {
		CardLayoutExample cdl = new CardLayoutExample();
		cdl.setSize(500, 500);
		cdl.setVisible(true);
		// new cardlayout();
	}
}
