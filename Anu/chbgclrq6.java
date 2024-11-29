import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

 class chbgclrq6 extends JFrame implements ActionListener
	{
		JLabel l1;
		JRadioButton b1,b2,b3;
		  chbgclrq6()
				{
					setSize(400,400);
					l1= new JLabel();
					b1=new JRadioButton("Yes");
					b1.setBounds(50,100,80,30); 
					l1.setBounds(150,100,160,30);
					
					
					b2=new JRadioButton("No");
					b2.setBounds(50,150,80,30); 
					
					
					b3=new JRadioButton("Nuteral");
					b3.setBounds(50,200,80,30); 
					
					add(b1);
					add(l1);
					add(b2);
					add(b3);
					
					
				ButtonGroup bg=new ButtonGroup();
                     bg.add(b1);
                     bg.add(b2);
					 bg.add(b3);

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
						getContentPane().setBackground(Color.PINK);
						}
					
							else if(ae.getSource()==b2)
						{
						System.out.println("Clicked"+b2.getText());
						l1.setText("Clicked"+b2.getText());
						getContentPane().setBackground(Color.BLACK);
						}
						
							else if(ae.getSource()==b3)
						{
						System.out.println("Clicked"+b3.getText());
						l1.setText("Clicked "+b3.getText());
						getContentPane().setBackground(Color.YELLOW);
						}
						}
		public static void main(String args[])
		{
			new chbgclrq6();
		}
	}
