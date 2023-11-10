package cse225f2;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
public class window extends frame {
	window()
	{
		addWindowListener(new WindowAdapter()
		{
			public void WindowClosing(Window e)
			{
				dispose();
			}

		}
	);
	setSize(400,400);
	setBounds(30,60,80,120);
	setLayout(null);
	setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawRect(200,110,120,30);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new window();
	}
}
