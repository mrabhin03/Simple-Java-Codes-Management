import java.awt.event.*;
import javax.swing.*;

 class buttonclickexa extends JFrame implements ActionListener
	{
		JLabel l;
		JButton b1;
			buttonclickexa()
				{
					setSize(400,400);
					 l= new JLabel();
					 b1=new JButton("Yes");
					b1.setBounds(50,100,80,30); 
					l.setBounds(40,70,100,30);
					add(b1);
					add(l);
					b1.addActionListener(this);
					setLayout(null);
					setVisible(true);
				}
					public void actionPerformed(ActionEvent ae)
						{
							if(ae.getSource()==b1)
						{
						System.out.println("u have clicked"+b1.getText());
						l.setText("clicked button"+b1.getText());
						}
						}
		public static void main(String args[])
		{
			new buttonclickexa();
		}
	}

