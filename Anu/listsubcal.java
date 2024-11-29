import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public  class listsubcal extends JFrame implements ActionListener
{
					JTextField t1,t2,t3;
					JLabel l1,l2,l3;
					DefaultListModel<String> ll;
					JList<String> list;
					 JButton b5;
					String selectedOperation;
					listsubcal()
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
					  b5 = new JButton("Submit");
                      b5.setBounds(10,150, 100, 40);
					  add(b5);
			  
           			  ll=new DefaultListModel<>();
					   ll.addElement("Add");
						ll.addElement("Sub");
						ll.addElement("Mul");
						ll.addElement("Div");
						
						list=new JList<>(ll);
						list.setBounds(170,180,150,100);
						
						add(l2);
						add(list);
						setSize(500,500);
						setLayout(null);
						setVisible(true);
						//list.addListSelectionListener(this);
						b5.addActionListener(this);
				}
				public void actionPerformed(ActionEvent e)
				{
				try 
				{
            
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
                selectedOperation = list.getSelectedValue();

            
				if (selectedOperation != null) 
				{
                switch (selectedOperation)
				{
                    case "Add":
                        t3.setText(String.valueOf(a + b));
                        break;
                    case "Sub":
                        t3.setText(String.valueOf(a - b));
                        break;
                    case "Mul":
                        t3.setText(String.valueOf(a * b));
                        break;
                    case "Div":
                        if (b != 0) 
						{
                            t3.setText(String.valueOf(a / b));
                        } 
						else 
						{
                            t3.setText("Error: Div by 0");
                        }
                        break;
                    default:
                        t3.setText("Select an operation");
                }
            } 
			else 
			{
                t3.setText("No operation selected");
            }


        } 
		catch (NumberFormatException ex) 
		{
            t3.setText("Invalid input!");
        }
    }
    

			public static void main(String args[])
					{
					new listsubcal();	
				}
				}