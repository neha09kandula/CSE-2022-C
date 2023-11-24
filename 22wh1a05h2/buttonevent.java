package frame;
import java.awt.*;
import java.awt.event.*;
public class buttonevent extends WindowAdapter{
	Frame f = new Frame();
	buttonevent()


  {
	 f = new Frame("Hello Frame");
	 f.setSize(1000,1000);
	 f.setBounds(30,60,800,600);
	 f.setLayout(null);
	 f.setVisible(true);
	 f.addWindowListener(this);
	 Button b1 = new Button("YELLOW");
	 f.add(b1);
	 b1.setSize(40,40);
	 b1.setBounds(300,150,50,60);
	 b1.setVisible(true);
	 Button b2 = new Button("BLUE");
	 f.add(b2);
	 b2.setSize(40,40);
	 b2.setBounds(300,250,50,50);
	 b2.setVisible(true);
	 Button b3 = new Button("PINK");
	 f.add(b3);
	 b3.setSize(40,40);
	 b3.setBounds(300,350,50,50);
	 b3.setVisible(true);
}
	 public void windowClosing(WindowEvent e) {
         //f.dispose();
		 System.exit(0);
	 }
	 public static void main(String[]args)
	 {
		 new  buttonevent();
	 } 
} 
	 
	


