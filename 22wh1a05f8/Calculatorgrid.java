package java_225f8;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class Calculatorgrid extends WindowAdapter{
	Frame f=new Frame();
	public Calculatorgrid() {
		f.addWindowListener(this);
		f.setBounds(100,300,50,50);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(new GridLayout(4,3));
		Button b0 = new Button("1");
		Button b1 = new Button("2");
		Button b2 = new Button("3");
		Button b3 = new Button("4");
		Button b4 = new Button("5");
		Button b5 = new Button("6");
		Button b6 = new Button("7");
		Button b7 = new Button("8");
		Button b8 = new Button("9");
		Button b9 = new Button("+");
		Button b10 = new Button("-");
		Button b11 = new Button("*");
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		TextField t=new TextField();
				f.add(t,BorderLayout.NORTH);
				t.setVisible(true);
		
	}
	

	public static void main(String[] args) {
		 new Calculatorgrid();

	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}

}
