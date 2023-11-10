package Frames;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class buttons extends WindowAdapter {
	buttons(){
		Frame f=new Frame("Hello");
		f.setSize(400,400);
		f.setBounds(30,60,80,90);
		f.setLayout(null);
		f.setVisible(true);
		Button b= new Button("save");
		f.add(b);
		b.setBounds(30,60,50,50);
	}
	public void windowClosing(WindowEvent e) {
		f.close();
	}
	

	public static void main(String[] args) {
		new buttons();

	}

}
