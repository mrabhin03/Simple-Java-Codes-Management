import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

 class listq3 extends JFrame implements ListSelectionListener
	{
		JLabel l2;
		DefaultListModel<String> ll;
		JList<String> list;
		  listq3 ()
				{
					l2 = new JLabel("Select an option");
					l2.setBounds(100, 50, 200, 30);
					 ll=new DefaultListModel<>();
                           ll.addElement("yes");
                            ll.addElement("no");
                            ll.addElement("nuteral");
							
                            list=new JList<>(ll);
							list.setBounds(100,100,50,50);
                            list.addListSelectionListener(this);
							add(l2);
							add(list);
							setSize(500,500);
							setLayout(null);
					        setVisible(true);
				}
				public void valueChanged(ListSelectionEvent ae)
						{
							if (!ae.getValueIsAdjusting()) 
							{
            String selectedValue = list.getSelectedValue();
            l2.setText("Selected: " + selectedValue);
       
            	   }
						
						}
							
							
							public static void main(String args[])
		{
			new listq3();
		}
	}
	
							
							
					/*setSize(400,400);
					l1= new JLabel();
					l1.setBounds(150,100,160,30);
					l2= new JLabel();
				    l2.setBounds(150,150,160,30);
					l3= new JLabel(); 
					l3.setBounds(150,200,190,30);
					/*l1= new JLabel();
					b1=new JButton("Yes");
					b1.setBounds(50,100,80,30); 
					l1.setBounds(150,100,160,30);
					
					l2= new JLabel();
					b2=new JButton("No");
					b2.setBounds(50,150,80,30); 
					l2.setBounds(150,150,160,30);
					
					l3= new JLabel();
					b3=new JButton("Nuteral");
					b3.setBounds(50,200,80,30); 
					l3.setBounds(150,200,190,30);
					add(b1);
					add(l1);
					add(b2);
					add(l2);
					add(b3);
					add(l3);
					add(l1);
					add(l2);
					add(l2);
                    list.addActionListener(this); 
					//b2.addActionListener(this); 
					//b3.addActionListener(this); 
					setLayout(null);
					setVisible(true);
				}
	
					/*public void actionPerformed(ActionEvent ae)
						{
							if(ae.getSource()==list)
						{
						System.out.println("Clicked"+list.getText());
						l1.setText("Clicked"+list.getText());
						}}
					
						/*	else if(ae.getSource()==b2)
						{
						System.out.println("Clicked"+b2.getText());
						l2.setText("Clicked"+b2.getText());
						}
						
							else if(ae.getSource()==b3)
						{
						System.out.println("Clicked"+b3.getText());
						l3.setText("Clicked "+b3.getText());
						}
						
		public static void main(String args[])
		{
			new listq3();
		}
	}*/


