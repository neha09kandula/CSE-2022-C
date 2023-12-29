package cse_225f2;
import java.awt.*;
import java.awt.event.*;
public class mouse_handling extends Frame implements MouseListener
{
	public Frame f;
	public Label l;
	public mouse_handling()
	{
		f = new Frame("Mouse handling");
		f.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent e) 
		    {
		    	f.dispose();
		    }
		});
		f.addMouseListener(this);
		l=new Label();
		l.setBounds(650,300,200,200);
		f.add(l);
		f.setSize(1500,800);
		f.setLayout(null);
		f.setVisible(true);
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
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new mouse_handling();
	}
}
