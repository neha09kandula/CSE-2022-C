package Priya5j0;
import java.awt.*;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class Sample extends WindowAdapter {
   Sample(){
	   Frame f=new Frame();
	   f.setVisible(true);
	   f.setBounds(100,100,50,50);
	   
	   
	   Label l=new Label("name");
	   f.add(l);
	   l.setSize(100,100);
	   l.setBounds(100,100,50,50);
	   TextField tx=new TextField();
	   f.add(tx);
	   tx.setSize(100,100);
	   tx.setBounds(200,100,100,50);
	   f.add(tx,BorderLayout.CENTER);
	   
	   
	   
	   Label l1=new Label("roll number");
	   f.add(l1);
	   l1.setSize(100,100);
	   l1.setBounds(100,600,50,50);
	   TextField tx1=new TextField();
	   f.add(tx1);
	   tx1.setSize(100,100);
	   tx1.setBounds(200,600,100,50);
	   f.add(tx1,BorderLayout.CENTER);
	   
	   
	   Label l2=new Label("age");
	   f.add(l2);
	   l2.setSize(100,100);
	   l2.setBounds(100,300,50,50);
	   TextField tx2=new TextField();
	   f.add(tx2);
	   tx2.setSize(100,100);
	   tx2.setBounds(200,300,100,50);
	   f.add(tx2,BorderLayout.CENTER);
	   
	   
	   
	   
	   Label l3=new Label("Gender");
	   f.add(l3);
	   l3.setSize(100,100);
	   l3.setBounds(100,400,50,50);
	   TextField tx3=new TextField();
	   f.add(tx3);
	   tx3.setSize(100,100);
	   tx3.setBounds(200,400,100,50);
	   f.add(tx3,BorderLayout.CENTER);
	   
	   
	   
	   
	   
	   
	   
	   Button b=new Button("submit");
	   f.add(b);
	   b.setSize(20,20);
	   b.setBounds(20,20,10,10);
	   f.addWindowListener(new MyClass());
	   
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample();
	}
	class MyClass extends WindowAdapter{
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

}
