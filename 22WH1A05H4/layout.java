package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class layout extends WindowAdapter{
 Frame f;
 layout(){
	 f=new Frame("Window");
	 f.setVisible(true);
	 f.setBounds(700, 800, 900, 1000);
	 f.setLayout(null);
	 f.addWindowListener(this);
	 Label l1=new Label("Enter the value 1:");
	 f.add(l1);
	 l1.setBounds(150, 70, 150, 50);
	 Label l2=new Label("Enter the value 2:");
	 f.add(l2);
	 l2.setBounds(150, 100, 150, 50);
	 TextField t1= new TextField();
	 f.add(t1);
	 t1.setBounds(300,80,170,30);
	 TextField t2= new TextField();
	 f.add(t2);
	 t2.setBounds(300,110,170,30);
	 Button b1= new Button("Click Me");
	 f.add(b1);
	 b1.setBounds(300, 150, 170, 40);
	 Label l3=new Label("Total:");
	 f.add(l3);
	 l3.setBounds(150, 200, 150, 50);
	 TextField t3= new TextField();
	 f.add(t3);
	 t3.setBounds(350,200,150,30);
 }
 public void windowClosing(WindowEvent e) {
	 f.dispose();
 }
 public static void main(String[]args) {
	 new layout();
 }
}
