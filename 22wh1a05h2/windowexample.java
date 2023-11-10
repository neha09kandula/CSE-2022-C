package frames;
import java.awt.*;
import java.awt.event.*;
public class windowexample extends WindowAdapter {
	private Frame f;
	
	public windowexample()  {
		f = new Frame("hello frame");
		f.setSize(500,500);
		f.setBounds(30,70,60,110);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(this);
	}
	
		public void windowClosing(WindowEvent e) {
			f.dispose();
		}
		public static void main(String[] args)
		{
			new windowexample();
		}
}