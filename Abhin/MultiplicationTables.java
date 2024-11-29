import javax.swing.*;
import java.awt.event.*;

class MultiplicationTables implements ActionListener{
    JTextArea t1;
    JScrollPane scrollBox;
    JFrame frame;
    MultiplicationTables(){
        frame=new JFrame();
        t1=new JTextArea();
        t1.setBounds(10,10,200,30);
        JButton button =new JButton("Submit");
        button.setBounds(210,10,100,30);
        button.addActionListener(this);
        frame.setSize(500,500);
        frame.setLayout(null);
        scrollBox=new JScrollPane();
        scrollBox.setBounds(10,100,300,300);
        frame.add(scrollBox);
        frame.add(t1);
        frame.add(button);
        
        frame.setVisible(true);
    
    }
    public void actionPerformed(ActionEvent e){
        change();
    }
    public void change(){
        int num;
        try{
            num=Integer.parseInt(t1.getText());
        }catch(Exception er){
            t1.setText("Error");
            return;
        }
        String[] Head={"Value1","Value2","Answer"};
        String[][] Data= new String[30][3];
        for(int i=0;i<30;i++){
            Data[i][0]=""+(i+1);
            Data[i][1]=""+num;
            Data[i][2]=""+(num*(i+1));
        }
        JTable table=new JTable(Data,Head);
        scrollBox.setViewportView(table);
    }
    public static void main(String ar[]){
        new MultiplicationTables();
    }
}