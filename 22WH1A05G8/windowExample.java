package Frames;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class windowExample extends Frame {
	windowExample() {
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
				
		});
	setSize(400,400);
	setBounds(30,60,80,90);
	setLayout(null);
	setVisible(true);
	}
	public void paint(Graphics g)
	{
		g.drawRect(200, 110, 120, 300);
	}

	public static void main(String[] args) {
		new windowExample();
	}

}
