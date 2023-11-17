package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class studentform extends WindowAdapter {
	Frame f;
	  studentform() {
		  f=new Frame("Hello.,");
		  f.setSize(1400,1400);
		  f.setBounds(20,30,900,900);
		  f.addWindowListener(this);
		  f.setLayout(null);
		  f.setVisible(true);
		  
	 	  Button b1=new Button("Save");
		  f.add(b1);
		  b1.setSize(90,70);
		  b1.setBounds(400, 500, 50, 40);
		  b1.setVisible(true);
		
		  Label l1= new Label("Enter Name:");
		  f.add(l1);	
		  l1.setSize(40,10);
		  l1.setBounds(40,90,120,30);
		  l1.setVisible(true);
		
		  Label l2= new Label("Enter ph no:");
		  f.add(l2);
		  l2.setSize(40,10);
		  l2.setBounds(40,130,120,30);
		  l2.setVisible(true);
		
		  Label l3= new Label("Enter RollNo:");
		  f.add(l3);
	      l3.setSize(40,10);
		  l3.setBounds(40,180,120,30);
		  l3.setVisible(true);	
	} 
	public void windowClosing (WindowEvent e)
	{
		f.dispose();
	}
	public static void main(String[] args) {
		new studentform();
	}
 
}
