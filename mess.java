package Frames;
import java.awt.*;
import java.awt.event.*;
class message extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		
		
		Font f1=new Font("Arial",Font.BOLD,30);
		g.setFont(f1);
		g.setColor(Color.RED);
		
	}
}
public class mess{

	public static void main(String[] args) {
		message f=new message();
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass());	
	}
}
class MyClass extends WindowAdapter{
	public void windowClosing(WindowEvent we) {
		System.exit(0);
	}
}
