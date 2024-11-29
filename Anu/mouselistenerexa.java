import java.awt.*;
import java.awt.event.*;
public class mouselistenerexa extends Frame implements MouseListener
{
	Label l;
	mouselistenerexa ()
	{
		addMouseListener(this);
		l=new Label();
		l.setBounds(10,10,100,100);
		setSize(600,400);
		add(l);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("Mouse Clicked");
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Mouse Entered");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("Mouse Released");
	}
	public static void main(String args[])
	{
		new mouselistenerexa();
	}
}