package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class closewindow extends Frame {
	closewindow(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
		
			}
	        });
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Frame f = new Frame("My First Frame");
	f.setSize(400, 300);
	//f.add(new MyComponent());
	f.setVisible(true);
	}
            


}
