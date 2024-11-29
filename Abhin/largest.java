import javax.swing.*;
import java.awt.event.*;

class largest{
    public static void main(String ar[]){
        new LargestCheckFrame();
    }
}

class LargestCheckFrame extends JFrame implements ActionListener{
    JTextArea A1,A2,A3;
    JButton B1;
    LargestCheckFrame(){
        setLayout(null);
        setSize(400,400);
        A1=new JTextArea();
        A1.setBounds(10,10,100,20);
        A2=new JTextArea();
        A2.setBounds(120,10,100,20);
        A3=new JTextArea();
        A3.setBounds(10,100,300,20);
        B1=new JButton("Check");
        B1.setBounds(10,50,100,30);
        B1.addActionListener(this);
        add(A1);
        add(A2);
        add(A3);
        add(B1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        try{
            int a= Integer.parseInt(A1.getText());
            int b= Integer.parseInt(A2.getText());
            if(a>b){
                A3.setText(a+" is larger than "+b);
            }else{
                A3.setText(b+" is larger than "+a);
            }
        }catch(Exception e){
            A3.setText("Error");
        }
    }
}