package javaprogram;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

public class mouse extends Frame implements MouseListener 
{
	Label l;
	mouse()
	{
		addMouseListener(this);
		l=new Label();
		l.setBounds(20,40,50,70);
		add(l);
		setSize(50,50);
		setBounds(30,30,60,60);
		setVisible(true);
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
				});
	
	}
	public  void mouseClicked(MouseEvent e)
	{
		l.setText("MouseClicked");
	}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("MouseEntered");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("MouseExited");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("MousePressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("MouseRelease");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mouse m=new mouse();
		m.mouseEntered(null);
		m.mouseExited(null);

	}

}
