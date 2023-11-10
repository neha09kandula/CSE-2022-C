package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Component;




public class closewindow extends Frame{
	
	closewindow(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
				});
		
	        setSize(400, 400);    
	        setLayout(null);    
	        setVisible(true);
	}
	public static void main(String[] args) {
		
	     new closewindow();
}
	
	
}

	

