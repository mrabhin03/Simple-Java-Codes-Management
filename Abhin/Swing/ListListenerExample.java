import javax.swing.*;
import javax.swing.event.*;
public class ListListenerExample extends JFrame implements ListSelectionListener {
    JLabel l1; 
    JList<String> list;
    ListListenerExample(){
        setLayout(null);
        setSize(400,400);
        String listdata[]={"Apple","Mango","Orange"};
        list= new JList<>(listdata);
        list.setBounds(20,20,100,200);
        list.addListSelectionListener(this);
        add(list);
        l1=new JLabel("");
        l1.setBounds(20,230,300,50);
        add(l1);
        setVisible(true);
    }
    public void valueChanged(ListSelectionEvent e){
        l1.setText("Selected Item: "+list.getSelectedValue());
    }
    public static void main(String ar[]){
        new ListListenerExample();
    }
}
