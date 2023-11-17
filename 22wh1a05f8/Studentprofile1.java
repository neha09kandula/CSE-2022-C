package javaprograms225f8;
import java.awt.event.WindowAdapter;
import java.awt.Frame;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.WindowEvent;
import java.awt.Label;
import java.awt.TextField;

public class Studentprofile1 extends WindowAdapter
{
	Frame f=new Frame("Hi Frame");
	public Studentprofile1()
{
		f.addWindowListener(this);
		f.setBounds(500,500,30,60);
		f.setSize(800,700);
		f.setLayout(null);
		f.setVisible(true);
		Button b=new Button("submit");
		f.add(b,BorderLayout.SOUTH);
		b.setBounds(100,350,65,47);  //setBounds(int x,int y,int width,int height)
		b.setSize(80, 60);
		b.setVisible(true);
		Label l=new Label("name:");//Labels start here
		f.add(l);
		l.setSize(40, 50);
		l.setBounds(70,40,80,55);
		Label l1=new Label("Rollno:");
		f.add(l1);
		l1.setSize(40, 50);
		l1.setBounds(70,80,80,55);
		Label l2=new Label("email:");
		f.add(l2);
		l2.setSize(40, 50);
		l2.setBounds(70,120,80,55);
		Label l3=new Label("phone.no:");
		f.add(l3);
		l3.setSize(40, 50);
		l3.setBounds(70,160,80,55);
		TextField t=new TextField();
		f.add(t);
		t.setBounds(250,70,170,80);
		t.setSize(40,30);
		t.setVisible(true);
		
}
public static void main(String[] args)
{
		new Studentprofile1();
}
public  void windowClosing(WindowEvent we)
{
	System.exit(0);
}
}

