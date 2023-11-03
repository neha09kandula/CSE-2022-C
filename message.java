package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Frames.firstframejava.MyComponent;
@SuppressWarnings("unused")
public class message extends Frame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int OPACITY = 0;
	message(){
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(ABORT);
			}
		});
	}
	public void paint(Graphics g) {
		this.setBackground(new Color(100,20,20));
		Font f=new Font("Arial", Font.BOLD + Font.ITALIC,OPACITY);
		g.setFont(f);
		
	}
	
public static void main(String args[])
{
	//auto-generated method

	Frame f= new Frame("My first frame");
	f.setSize(400,300);
	f.add(new MyComponent());
	f.setVisible(true);
	
}
}

