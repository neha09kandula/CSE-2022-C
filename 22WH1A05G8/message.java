package Frames;
import java.awt.*;
import java.awt.MyComponent;

public class message extends Frame {
	message() {
		addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e) {
		System.exit(0);
		}
		});
	}
	public static void main(String[] args) {
		Frame f= new Frame("frame");
		f.setSize(400,400);
		f.add(new MyComponent());
		f.setVisible(true);
	
	}
}
