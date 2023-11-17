package Frames;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class student extends WindowAdapter {
	Frame f;
	  student() {
		  f = new Frame("student registration form");
		  f.setSize(1000,1000);
		  f.setBounds(30,60,800,600);
		  f.addWindowListener(this);
		  f.setLayout(null);
		  f.setVisible(true);
		
		  Label l1 = new Label("NAME:");
		  f.add(l1);
		  l1.setSize(150,50);
		  l1.setBounds(40,60,150,30);
		  l1.setVisible(true);
		
		  Label l2 = new Label("DOB:");
		  f.add(l2);
		  l2.setSize(50,50);
		  l2.setBounds(40,100,150,30);
		  l2.setVisible(true);
		
		  Label l3 = new Label("GENDER:");
		  f.add(l3);
		  l3.setSize(50,50);
		  l3.setBounds(40,140,150,30);
		  l3.setVisible(true);
		
		  Label l4 = new Label("EMAIL:");
		  f.add(l4);
		  l4.setSize(50,50);
		  l4.setBounds(40,180,150,30);
		  l4.setVisible(true);
		
	      Label l5 = new Label("PHONE NUMBER:");
		  f.add(l5);
		  l5.setSize(50,50);
		  l5.setBounds(40,220,150,30);
		  l5.setVisible(true);
		
		  Label l6 = new Label("FATHER'S NAME:");
		  f.add(l6);
		  l6.setSize(50,50);
		  l6.setBounds(40,260,150,30);
		  l6.setVisible(true);
		
		  Label l7 = new Label("MOTHER'S NAME");
		  f.add(l7);
		  l7.setSize(50,50);
	      l7.setBounds(40,300,150,30);
		  l7.setVisible(true);
		
		  Label l8 = new Label("ADDRESS:");
		  f.add(l8);
		  l8.setSize(50,50);
		  l8.setBounds(40,340,150,30);
		  l8.setVisible(true);
		
		  Label l9 = new Label("COURSE:");
		  f.add(l9);
		  l9.setSize(50,50);
		  l9.setBounds(40,380,150,30);
		  l9.setVisible(true);
		 
		  Button b1 = new Button("SUBMIT");
		  f.add(b1);
		  b1.setSize(100,100);
	      b1.setBounds(280,500,100,30);
		  b1.setVisible(true);
		
		  Button b2 = new Button("NEXT");
		  f.add(b2);
		  b2.setSize(100,100);
	      b2.setBounds(400,500,100,30);
		  b2.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new student();
	}

}
