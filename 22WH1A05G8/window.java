package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class window extends WindowAdapter {
	Frame f;
	window() {
		f= new Frame("Hello");
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		Button b=new Button("Submit");
		f.add(b,BorderLayout.CENTER);
		b.setSize(20,49);
		b.setBounds(220,190,100,50);
		
		PopUpMenu Frame f1= new Frame("Hello");
		b.add(f1);
	}
	public void windowClosing (WindowEvent e) {
		f.dispose();
	}

	public static void main(String[] args) {
		new window();
	}

}
