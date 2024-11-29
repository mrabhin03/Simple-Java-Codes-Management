import javax.swing.*;

public class TextFieldExample {
	TextFieldExample() {
		JFrame f = new JFrame("welcome");
		JTextArea area = new JTextArea("new area");
		area.setBounds(10, 10, 10, 10);
		f.add(area);
		f.setSize(100, 100);
		f.setVisible(true);
		f.setLayout(null);
	}

	public static void main(String args[]) {
		new TextFieldExample();
	}
}
