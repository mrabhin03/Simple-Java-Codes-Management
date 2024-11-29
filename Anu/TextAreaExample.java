import javax.swing.*;

public class TextAreaExample {
	TextAreaExample() {
		JFrame f = new JFrame("Text Area");
		JTextArea area = new JTextArea("new words");
		area.setBounds(50, 50, 50, 50);
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new TextAreaExample();
	}
}
