import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample {
	GridLayoutExample() {
		JFrame f = new JFrame();
		f.setLayout(new GridLayout());
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(500, 500);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new GridLayoutExample();
	}
}
