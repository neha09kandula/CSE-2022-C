package Frames;
import java.awt.*;
import java.awt.event.*;
class studentform extends Frame{
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;
	studentform(){
		this.setLayout(null);
		b1 = new Button("Save");
		b1.setVisible(true); 
		b2 = new Button("Update");
		b2.setVisible(true);
		Label l1= new Label("name");
		Label l2= new Label("Roll Number");
		l1.setVisible(true);
	    l2.setVisible(true);
		t1= new TextField(100);
		t1.setVisible(true); 
		t2 = new TextField(100);
		t2.setVisible(true);
		b1.setBounds(50,450,100,50);
		b2.setBounds(200,450,100,50);
		t1.setBounds(200,200,150,50);
		t2.setBounds(200,100,150,50);
		l1.setBounds(170,200,200,60);
		l2.setBounds(180,100,150,50);
		
		
				
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		this.add(l1);
		this.add(l2);
} 
	public class studentform {

		public static void main(String[] args) {
	     

		}
	}
	 class MyClass extends WindowAdapter{
		  public void windowClosing(WindowEvent we) {
		  System.exit(0);
	  }