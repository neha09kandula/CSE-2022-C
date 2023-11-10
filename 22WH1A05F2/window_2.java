package cse225f2;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
public class window_2 extends WindowAdapter
{
	window_2()
	{
		
	
		Frame f = new Frame("Hello Frame");
		f.setSize(500,500);
		f.setBounds(200,110,120,30);
		f.setLayout(null);
		f.setVisible(true);
		Button b = new Button("Submit");
		f.add(b);
		b.setSize(400,400);
	
		public WindowClosing(Window e)
		{
			f.dispose();
		}
		public static void main(String[] args)
		{
		// TODO Auto-generated method stub
		new window_2();
		}
	}
}