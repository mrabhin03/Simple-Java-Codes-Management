import java.awt.*;
import java.awt.event.*;
public class keylistenerexa extends Frame implements KeyListener
{
	Label l;
	TextArea area;
	keylistenerexa()
	{
		
		l=new Label();
		area=new TextArea();
		area.addKeyListener(this);
		l.setBounds(10,10,100,100);
		area.setBounds(150,150,200,200);
		setSize(600,400);
		add(l);
		add(area);
		setLayout(null);
		setVisible(true);
	}
	public void keyPressed(KeyEvent ke)
	{
		l.setText("Key Pressed");
	}
	public void keyTyped(KeyEvent ke)
	{
		l.setText("Key Typed");
	}
	public void keyReleased(KeyEvent e)
	{
		l.setText("Key Released");
	}
	public static void main(String args[])
	{
		new keylistenerexa();
	}
}