import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class BgColorUsingCheckBox extends JFrame implements ActionListener {
	JCheckBox cb1, cb2, cb3;
	JLabel l1;

	BgColorUsingCheckBox() {
		setSize(400, 400);
		l1 = new JLabel();
		l1.setBounds(150, 100, 160, 30);

		cb1 = new JCheckBox("RED");
		cb1.setBounds(50, 100, 80, 30);

		cb2 = new JCheckBox("BLACK");
		cb2.setBounds(50, 150, 80, 30);

		cb3 = new JCheckBox("WHITE");
		cb3.setBounds(50, 200, 80, 30);

		add(cb1);
		add(cb2);
		add(cb3);
		add(l1);

		cb1.addActionListener(this);
		cb2.addActionListener(this);
		cb3.addActionListener(this);
		setLayout(null);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == cb1) {
			System.out.println("Clicked" + cb1.getText());
			l1.setText("Clicked" + cb1.getText());
			getContentPane().setBackground(Color.RED);
		}

		else if (ae.getSource() == cb2) {
			System.out.println("Clicked" + cb2.getText());
			l1.setText("Clicked" + cb2.getText());
			getContentPane().setBackground(Color.BLACK);
		}

		else if (ae.getSource() == cb3) {
			System.out.println("Clicked" + cb3.getText());
			l1.setText("Clicked " + cb3.getText());
			getContentPane().setBackground(Color.WHITE);
		}
	}

	public static void main(String args[]) {
		new BgColorUsingCheckBox();
	}
}
