package Frames5G0;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
import java.awt.*;
import java.awt.Frame;
import java.awt.Graphics;

public class text_label extends Frame{
	text_label(){
		addWindowListener(new WindowAdapter()
				{
			public void WindowClosing(Window e)
			{
				dispose();
			}
				});
		setSize(400,400);
		setBounds(30,60,80,120);
		setLayout(null);
		setVisible(true);
	}
	public void paint(Graphics g) {
		g.drawRect(50, 50, 50, 50);
	}
	public static void main(String args[]) {
		new text_label();
	}
}
