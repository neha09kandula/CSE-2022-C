package java_225f8;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;
import java.awt.Button;

public class Calculator extends WindowAdapter {
	Frame f=new Frame("calculator");
	 Calculator() 
	 {
	f.addWindowListener(this);
	f.setBounds(100,300,50,50);
	f.setSize(500,500);
	f.setVisible(true);
	f.setBounds(100,300,50,50);
	f.setLayout(null);
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	b0 = new Button("1");
	f.add(b0);
	b0.setBounds(100,300,60,60);
	b0.setSize(50,50);
	b0.setVisible(true);
	
    b1 = new Button("2");
    f.add(b1);
	b1.setBounds(150,300,60,60);
	b1.setSize(50,50);
	b1.setVisible(true);
	
	b2 = new Button("3");
	f.add(b2);
	b2.setBounds(200,300,60,60);
	b2.setSize(50,50);
	b2.setVisible(true);
	
	b3 = new Button("4");
	f.add(b3);
	b3.setBounds(100,350,60,60);
	b3.setSize(50,50);
	b3.setVisible(true);
	
	b4 = new Button("5");
	f.add(b4);
	b4.setBounds(150,350,60,60);
	b4.setSize(50,50);
	b4.setVisible(true);
	
	b5 = new Button("6");
	f.add(b5);
	b5.setBounds(200,350,60,60);
	b5.setSize(50,50);
	b5.setVisible(true);
	
	b6 = new Button("7");
	f.add(b6);
	b6.setBounds(100,400,60,60);
	b6.setSize(50,50);
	b6.setVisible(true);
	
	b7 = new Button("8");
	f.add(b7);
	b7.setBounds(150,400,60,60);
	b7.setSize(50,50);
	b7.setVisible(true);
	
	b8 = new Button("9");
	f.add(b8);
	b8.setBounds(200,400,60,60);
	b8.setSize(50,50);
	b8.setVisible(true);
	
	TextField t=new TextField();
	f.add(t);
	t.setBounds(100, 250, 150, 30);
	
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public static void main(String args[])
	{
		new Calculator();
	}
}
