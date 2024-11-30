import javax.swing.*;
import java.awt.event.*;

class FactorialUsingSwing{
    public static void main(String ar[]){
        new factorialCalc();
    }
}

class factorialCalc extends JFrame implements ActionListener{
    JTextArea A1,A3;
    JButton B1;
    factorialCalc(){
        setLayout(null);
        setSize(400,400);
        A1=new JTextArea();
        A1.setBounds(10,10,100,20);
        A3=new JTextArea();
        A3.setBounds(10,100,300,20);
        B1=new JButton("Submit");
        B1.setBounds(10,50,100,30);
        B1.addActionListener(this);
        add(A1);
        add(A3);
        add(B1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            int a= Integer.parseInt(A1.getText());
            int fact=1;
            for(int i=1;i<=a;i++){
                fact*=i;
            }
            A3.setText("Factorial of "+a+" is "+fact);
        }catch(Exception e){
            A3.setText("Error");
        }
    }
}