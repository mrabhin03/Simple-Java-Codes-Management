import javax.swing.*;

public class RadioButtonExample2 {
	RadioButtonExample2() {
		JFrame f = new JFrame("radio button");
		JRadioButton rb = new JRadioButton("Male");
		JRadioButton rb1 = new JRadioButton("Female");
		rb.setBounds(100, 100, 100, 50);
		rb1.setBounds(150, 150, 100, 50);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb);
		bg.add(rb1);
		f.add(rb);
		f.add(rb1);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new RadioButtonExample2();
	}
}
