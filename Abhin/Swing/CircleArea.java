import javax.swing.*;
import java.awt.event.*;

class CircleArea{
    public static void main(String ar[]){
        new circleData();
    }
}
class circleData extends JFrame implements ActionListener{
    JTextArea Q1,A1;
    JButton B1;
    circleData(){
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
    public void actionPerformed(ActionEvent ae){
        try{
            int r=Integer.parseInt(Q1.getText());
            double Area=3.14*(r*r);
            A1.setText("Area: "+Area);
        }catch(Exception e){
            A1.setText("Error");
        }
    }
}