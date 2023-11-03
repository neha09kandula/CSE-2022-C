package Frames5G0;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;
public class closing_Frame extends Frame{
	closing_Frame(){
		addWindowListener(new WindowAdapter() {
				
			public void windowclosing(WindowEvent we) {
				System.exit(0);
			}
		});	
	}
	public static void main(String[] args) {
		Frame f=new Frame("My First Frame");
		f.setSize(400, 300);
		f.setVisible(true);
		f.addWindowListener(new closing_Frame);
		}
}


	