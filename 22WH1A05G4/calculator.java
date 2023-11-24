package Frames;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


public class calculator extends WindowAdapter{
	Frame f;
		calculator() {
			  f = new Frame("calculator");
			  f.setSize(1000,1000);
			  f.setBounds(30,60,800,600);
			  f.addWindowListener(this);
			  f.setLayout(new GridLayout(3,2,200,200));
			  f.setVisible(true);
			  
			  Button b1 = new Button("1");
			  f.add(b1);
			  
			  Button b2 = new Button("2");
			  f.add(b2);
			  
			  Button b3 = new Button("3");
			  f.add(b3);
			  
			  Button b4 = new Button("4");
			  f.add(b4);
			  
			  Button b5 = new Button("5");
			  f.add(b5);
			  
			  Button b6 = new Button("6");
			  f.add(b6);
			  
			  Button b7 = new Button("7");
			  f.add(b7);
			  
			  Button b8 = new Button("8");
			  f.add(b8);
			  
			  Button b9 = new Button("9");
			  f.add(b9);

		}
		
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new calculator();
	}

}
