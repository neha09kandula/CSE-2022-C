package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class window extends Frame{
	window(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
				});
		setSize(400,400);
		setBounds(30,60,80,120);
		setLayout(null);
		setVisible(true);
	}
	public void Paint(Graphics g)
	{
		g.drawRect(300,210,120,20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new window();
	}

}
