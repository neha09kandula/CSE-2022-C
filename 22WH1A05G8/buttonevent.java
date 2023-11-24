package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;

public class buttonevent extends WindowAdapter {
	Frame f;
	buttonevent() {
		f= new Frame("Hello");
		f.addWindowListener(this);
		f.setSize(700,700);
		f.setVisible(true);
		f.setLayout(null);
		Button b1 = new Button("Green");
		f.add(b1);
		b1.setBounds(400,200,112,60);
		Button b2 = new Button("Yellow");
		f.add(b2);
		b2.setBounds(400,300,112,60);
		Button b3 = new Button("Blue");
		f.add(b3);
		b3.setBounds(400,400,112,60);

	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	public static void main(String[] args) {
		new buttonevent();

	}

}
