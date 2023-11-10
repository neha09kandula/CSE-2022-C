package frame;
import java.awt.*;
import java.awt.event.*;
class myframe extends Frame implements ActionListener{
	Button b1,b2,b3;
	TextField t1,t2;
	public void myframe() {
		b1=new Button("Save");
		b2=new Button("Update");
		b3=new Button("exit");
	
		t1=new TextField();
		t2=new TextField(30);
		b1.setBounds(100, 100, 100, 50);
		b2.setBounds(200, 100, 100, 50);
		b3.setBounds(400,100,100,50);
		t1.setBounds(200, 100, 100, 50);
		t2.setBounds(200, 100, 100, 50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(t1);
		this.add(t2);
		Checkbox c1=new Checkbox();
		Checkbox c2=new Checkbox("Telugu",true);
		Checkbox c3=new Checkbox("English",true);
		c2.setBounds(14, 150, 100, 50);
		c3.setBounds(140, 180, 100, 50);
		this.add(c2);
		this.add(c3); 
		}
}
public class studentregform {
	public static void main(String[] args) {
		myframe f=new myframe();
		f.myframe();
		f.setTitle("my second frame");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass1());
		
	}

}
class MyClass1 extends WindowAdapter
{
	public void WindowClosing(WindowEvent we) {
		System.exit(0);
	}
}
