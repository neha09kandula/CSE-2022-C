package javaprograms;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class message {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("My First Frame");
		f.setSize(1000, 1000);
		f.setVisible(true);
	}
}
public class message extends Frame {
	message() {
		 addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e) {
		System.exit(0);
		}
		});
	    }

	    public void paint(Graphics g) {
	    this.setBackground(new Color(100,20,20));
	    Font f=new Font("Arial",Font.BOLD + Font.ITALIC);
	    f.getFont(f);
	    }