package Frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;

public class Eventhandling extends WindowAdapter {
	Eventhandling(){
		Frame f=new Frame("Student Profile");
		f.setSize(500,500);
		f.setBounds(200, 100, 50, 80);
		f.setLayout(null);
		f.setVisible(true);
		Button b=new Button("Submit");
		f.add(b);
		b.setSize(null);
	}

	public static void main(String[]args) {
		
	}
}