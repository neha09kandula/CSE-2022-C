package frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class window extends WindowAdapter implements ActionListener {
	Frame f,f1,f2;
	Button b1,b2,b3;
	window(){
		f = new Frame("Hello!!!");
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setVisible(true);;
		f.setLayout(null);
		b1=new Button("Next");
		f.add(b1);
		b1.addActionListener(this);
		b1.setBounds(100,40,50,30);
		b2=new Button("Submit");
		f.add(b2);
		b2.addActionListener(this);
		b2.setBounds(100,70,50,30);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			f1 = new Frame();
			f1.setBackground(Color.RED);
			f1.setLayout(null);
			f1.setSize(400,400);
			f1.setVisible(true);
			f1.addWindowListener(this);
			b3=new Button("End");
			f1.add(b3);
			b3.addActionListener(this);
			b3.setBounds(300,100,50,30);
			b3.setBackground(Color.ORANGE);
		}
		else if(ae.getSource()==b2)
		{
			f2 = new Frame();
			f2.setLayout(null);
			f2.setSize(400,400);
			f2.setVisible(true);
			f2.addWindowListener(this);
		}
		}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
		System.exit(0);
	}
	public static void main(String[] args) {
		new window();
	}
}









































/*public class window extends WindowAdapter implements ActionListener{
	Frame f1,f2;
	Button b1,b2;
	window(){
		setLayout(null);
		b1=new Button("Next");
		b1.setBounds(100, 100, 70, 40);
		add(b1);
		b2=new Button("End");
		b2.setBounds(100, 150, 70, 40);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);;
	}
	public void ActionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			Frame f2 = new Frame();
			f2.setSize(400,400);
			f2.setVisible(true);
			f2.setLayout(null);
			Button b3 = new Button("Empty Button");
			f2.add(b3);
			b3.setBounds(200, 100, 70, 40);
			b3.setBackground(Color.ORANGE);
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		window f1 = new window();
		f1.setSize(500,500);
		f1.setTitle("First Frame");
		f1.setVisible(true);
		f1.addWindowListener(null);
	}
	
}*/
