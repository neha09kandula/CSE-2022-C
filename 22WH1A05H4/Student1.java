package javaprogram;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Student1 extends WindowAdapter() 
{Student1(){
	Frame f= new Frame("Student Registration Form");
	f.setSize(400,400);
	f.setBounds(30, 60, 80, 120);
	f.setVisible(true);
	Button b1 = new Button("Student Name");
	Button b2 = new Button("Roll number");
	Button b3 = new Button("Class");
	Button b4 = new Button("Date of Birth");
	Button b5 = new Button("Phone number");
	f.add(b1);
	b1.setSize(40,50);
	b1.setVisible(true);
	f.add(b2);
	b2.setSize(40,50);
	b2.setVisible(true);
	f.add(b3);
	b3.setSize(40,50);
	b3.setVisible(true);
	f.add(b4);
	b4.setSize(40,50);
	b4.setVisible(true);
	f.add(b5);
	b5.setSize(40,50);
	b5.setVisible(true);
	Label l1 = new Label("Name");
    f.add(l1);
    l1.setVisible(true);
    Label l2 = new Label("Name");
    f.add(l2);
    l2.setVisible(true);
    Label l3 = new Label("Name");
    f.add(l3);
    l3.setVisible(true);
    Label l4 = new Label("Name");
    f.add(l4);
    l4.setVisible(true);
}
 public void WindowClosing(WindowEvent e)
 {
	 f.dispose();
 }
public static void main(String[] args) {
		// TODO Auto-generated method stub
	{
		new Student1();
	}

}
}
}


