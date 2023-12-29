package javanew;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

public class Mice1 extends Frame implements MouseListener{
	Label l;
	Frame f;
	Mice1()                                                                                                                                   
	{
		addMouseListener(this);
		l=new Label();
		l.setBounds(10, 20, 30, 40);
		add(l);
		setSize(50,50);
		setBounds(90,90,90,90);
		setVisible(true);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
				
			}
			
		
		
	});
	}
	public void mouseClicked(MouseEvent e)
	{
		l.setText("mouse clicked");
	}
	public void mouseEntered(MouseEvent e)
	{
	
		l.setText("mouse entered");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("mouse pressed");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("mouse exited");
	}
	public void mouseReleased(MouseEvent e)
	{
		l.setText("mouse clicked");
	}
	public static void main(String[] args)
	{

		Mice1 m=new Mice1();
		m.mouseEntered(null);
	//	m.WindowClosing(null);
	}
	}
