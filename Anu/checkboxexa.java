import javax.swing.*;
public class checkboxexa
{
	checkboxexa()
	{
		JFrame f=new JFrame("Check Box");
	    JCheckBox cb1=new JCheckBox("php");
		cb1.setBounds(100,100,50,50);
		JCheckBox cb2=new JCheckBox("java");
		cb2.setBounds(150,150,50,50);
		f.add(cb1);
		f.add(cb2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new checkboxexa();
	}
}


