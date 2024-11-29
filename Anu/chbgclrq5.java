import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

 class chbgclrq5 extends JFrame implements ActionListener
	{
		JLabel l1,l2,l3;
		JButton b1,b2,b3;
		  chbgclrq5()
				{
					setSize(500,500);
					l1= new JLabel();
					b1=new JButton("Yes");
					b1.setBounds(50,100,80,30); 
					l1.setBounds(150,100,160,30);
					
					
					b2=new JButton("No");
					b2.setBounds(50,150,80,30); 
					
					
					
					b3=new JButton("Nuteral");
					b3.setBounds(50,200,80,30); 
					
					add(b1);
					add(l1);
					add(b2);
					add(b3);
					

					b1.addActionListener(this); 
					b2.addActionListener(this); 
					b3.addActionListener(this); 
					setLayout(null);
					setVisible(true);
				}
					public void actionPerformed(ActionEvent ae)
						{
							if(ae.getSource()==b1)
						{
						System.out.println("Clicked"+b1.getText());
						l1.setText("Clicked"+b1.getText());
						getContentPane().setBackground(Color.RED);
						}
					
							else if(ae.getSource()==b2)
						{
						System.out.println("Clicked"+b2.getText());
						l1.setText("Clicked"+b2.getText());
						getContentPane().setBackground(Color.BLUE);
						}
						
							else if(ae.getSource()==b3)
						{
						System.out.println("Clicked"+b3.getText());
						l1.setText("Clicked "+b3.getText());
						getContentPane().setBackground(Color.GREEN);
						}
						}
		public static void main(String args[])
		{
			new chbgclrq5();
		}
	}
