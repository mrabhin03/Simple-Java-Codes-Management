import javax.swing.*;

public class ComboBoxExample {
	ComboBoxExample() {
		JFrame f = new JFrame();
		String country[] = { "INDIA", "USA", "UA", "FINLAND", "SWITZERLAND" };
		JComboBox cb = new JComboBox(country);
		cb.setBounds(100, 100, 300, 300);
		f.add(cb);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new ComboBoxExample();
	}
}
