package javaprogram;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Student extends Frame {
	Student(){
		addWindowListener(new WindowAdapter()
				{    public void WindowClosing(WindowEvent e)
		{
			dispose();
		}
	});
		setSize(400,400);
		setBounds(30, 60, 80, 120);
		setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawRect(200, 110, 120, 30);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student();

	}

}
