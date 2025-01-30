import javax.swing.*;
import java.awt.event.*;
public class ItemListenerExample extends JFrame implements ItemListener {
    JLabel l1;
    JCheckBox box;
    ItemListenerExample(){
        setLayout(null);
        setSize(400,400);
        box= new JCheckBox("Check Box");
        box.setBounds(100,100,200,30);
        box.addItemListener(this);
        add(box);
        l1=new JLabel("Not Checked");
        add(l1);
        l1.setBounds(110,130,100,100);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent i){
        if(box.isSelected()){
            l1.setText("Checked");
        }else{
            l1.setText("Not Checked");
        }
    }
    public static void main(String ar[]){
        new ItemListenerExample();
    }
}
