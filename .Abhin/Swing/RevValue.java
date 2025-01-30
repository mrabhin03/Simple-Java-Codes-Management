import javax.swing.*;
import java.awt.event.*;

public class RevValue{
    public static void main(String ar[]){
        new ReverceValue();
    }
}

class ReverceValue extends JFrame implements ActionListener{
    JTextArea Q1,A1;
    JButton B1;
    ReverceValue(){
        setLayout(null);
        setSize(400,400);
        Q1=new JTextArea();
        A1=new JTextArea();
        B1=new JButton("Submit");
        Q1.setBounds(10,10,150,25);
        B1.setBounds(180,10,100,25);
        A1.setBounds(10,50,270,25);
        B1.addActionListener(this);
        add(Q1);
        add(B1);
        add(A1);
        setVisible(true);
    }
    public void  actionPerformed(ActionEvent ae){
        String ar=Q1.getText(), Result="";
        for(int i=ar.length()-1;i>=0;i--){
            Result+=ar.charAt(i);
        }
        A1.setText(Result);
    }
}