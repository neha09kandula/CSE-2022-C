package Frames5G0;
import java.awt.event.*;
import java.awt.*;


public class window extends Frame{
	window(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
				});
		setSize(800,800);
		setBounds(30,60,80,120);
		setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawRect(50, 50, 50, 50);
	}
	public static void main(String args[]) {
		new window();
	}
}
