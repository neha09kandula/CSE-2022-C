package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class buttonExample extends WindowAdapter {
	buttonExample() {
		Frame f = new Frame("hello frame");
		f.setSize(400,400);
		f.setBounds(30,60,80,120);
		f.setLayout(null);
		f.setVisible(true);
		Button b = new Button("submit");
		f.add(b);
		b.setSize(50,50);
		b.setBounds(30,60,50,50);
	}
		
	public void WindowClosing(WindowEvent e) {
		f.dispose();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new buttonExample();
	}
}
