package Frames;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class cal2 extends Frame{
	cal2(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
				});
		setTitle("CALCULATOR");
		setSize(500,500);
		setLayout(new BorderLayout());
		TextField t = new TextField();
		add(t,BorderLayout.NORTH);
		Button b = new Button("1");
		b.setBounds(300, 300, 200, 100);
		add(b);
		Button b1 = new Button("2");
		b1.setBounds(300, 400, 200, 100);
		add(b1);
		Button b2 = new Button("3");
		b2.setBounds(300, 500, 200, 100);
		add(b2);
		Button b3 = new Button("4");
		b3.setBounds(600, 300, 200, 100);
		add(b3);
		Button b4 = new Button("5");
		b4.setBounds(600, 400, 200, 100);
		add(b4);
		Button b5 = new Button("6");
		b5.setBounds(600, 500, 200, 100);
		add(b5);
		Button b6 = new Button("7");
		b6.setBounds(900, 300, 200, 100);
		add(b6);
		Button b7 = new Button("8");
		b7.setBounds(900, 400, 200, 100);
		add(b7);
		Button b8 = new Button("9");
		b8.setBounds(900, 500, 200, 100);
		add(b8);
		Button b9 = new Button(" ");
		b9.setBounds(900, 500, 200, 100);
		add(b9);
		setVisible(true);
		
		
	}
	public static void main(String args[]) {
		new cal2();
	}
}