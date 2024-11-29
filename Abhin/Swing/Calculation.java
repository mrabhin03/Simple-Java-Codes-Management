import javax.swing.*;
import java.awt.event.*;
public class Calculation{
    public static void main(String ar[]){
        new CalculationFrame();
    }
}
class CalculationFrame extends JFrame implements ActionListener{
    int option=0;
    JLabel l1;
    JButton sum,multi,div,sub,submit;
    JTextArea T1,T2;
    CalculationFrame(){
        setLayout(null);
        setSize(400,400);
        T1=new JTextArea();
        T1.setBounds(10,10,130,20);
        T2=new JTextArea();
        T2.setBounds(10,100,130,20);
        add(T1);
        add(T2);

        l1=new JLabel("Submit To Check");
        l1.setBounds(10,200,130,20);
        add(l1);

        sum=new JButton("+");
        sum.setBounds(10,50,50,25);
        sum.addActionListener(this);
        add(sum);

        sub=new JButton("-");
        sub.setBounds(70,50,50,25);
        sub.addActionListener(this);
        add(sub);

        multi=new JButton("x");
        multi.setBounds(130,50,50,25);
        multi.addActionListener(this);
        add(multi);

        div=new JButton("/");
        div.setBounds(190,50,50,25);
        div.addActionListener(this);
        add(div);

        submit=new JButton("Submit");
        submit.setBounds(10,150,130,25);
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()!=submit){
            if(ae.getSource()==sum){
                option=0;
            }else if(ae.getSource()==sub){
                option=1;
            }else if(ae.getSource()==multi){
                option=2;
            }else{
                option=3;
            }
        }else{
            try{
                String msg="";
                int a= Integer.parseInt(T1.getText());
                int b= Integer.parseInt(T2.getText());
                switch(option){
                    case 0:
                        msg="Sum is : "+(a+b);
                        break;
                    case 1:
                        msg="Diff is : "+(a-b);
                        break;
                    case 2:
                        msg="Multi is : "+(a*b);
                        break;
                    case 3:
                        msg="Div is : "+(a/b);
                        break;
                    default:
                        msg="ERROR";
                }
                l1.setText(msg);

            }catch(Exception e){
                l1.setText("ERROR");
            }
            
        }
    }
}