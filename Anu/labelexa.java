import javax.swing.*;
class labelexa
{
	public static void main(String args[])
	{
	JFrame f=new JFrame("welcome");
	JLabel l1,l2;
	l1=new JLabel("First Label");
	l1.setBounds(20,50,100,300);
	l2=new JLabel("Second Label");
	l2.setBounds(20,50,100,300);
	f.add(l1);
	f.add(l2);
	f.setSize(500,600);
	f.setVisible(true);
	f.setLayout(null);
	}
}