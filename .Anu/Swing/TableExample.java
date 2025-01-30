import javax.swing.*;

public class TableExample {
	TableExample() {
		JFrame f = new JFrame();
		String data[][] = { { "101", "Anupriya", "150000" }, { "102", "Karthika", "100000" } };
		String column[] = { "ID", "NAME", "SALARY" };
		JTable tt = new JTable(data, column);
		JScrollPane sp = new JScrollPane(tt);
		sp.setBounds(100, 100, 300, 300);
		f.add(sp);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new TableExample();
	}
}
