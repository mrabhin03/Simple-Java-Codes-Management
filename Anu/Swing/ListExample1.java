import javax.swing.*;

public class ListExample1 {
	ListExample1() {
		JFrame f = new JFrame("radio button");
		DefaultListModel<String> ll = new DefaultListModel<>();
		ll.addElement("item1");
		ll.addElement("item2");
		ll.addElement("item3");
		JList<String> list = new JList<>(ll);
		list.setBounds(100, 100, 50, 50);
		f.add(list);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		new ListExample1();
	}
}