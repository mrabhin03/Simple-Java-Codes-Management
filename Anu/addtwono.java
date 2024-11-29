import java.awt.event.*;
import javax.swing.*;
public  class addtwono extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JLabel l1,l2,l3;
	JButton b;
	addtwono()
	{
	l1=new JLabel("First Number");
	l1.setBounds(10,10,100,20);
	t1=new JTextField(20); 
	t1.setBounds(160,10,150,20);
	
	l2=new JLabel("Second Number");
	l2.setBounds(10,60,100,20);
	t2=new JTextField(20); 
	t2.setBounds(160,60,150,20);
	
	l3=new JLabel("Result");
	l3.setBounds(10,110,100,20);
	t3=new JTextField(20); 
	t3.setBounds(160,110,150,20);
	
	add(l1);
	add(l2);
	add(l3);
    add(t1);
	add(t2);
	add(t3);
	
	b=new JButton("Add");
	b.setBounds(10,210,70,40);
	add(b);
	
	setSize(400,400);
	setLayout(null);
	setVisible(true);
	b.addActionListener(this);	
}
public void actionPerformed(ActionEvent e)
{
	
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
	t3.setText(String.valueOf(a+b));
	
}
	public static void main(String args[])
	{
	new addtwono();	
}
}