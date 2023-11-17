package frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class stuform extends WindowAdapter{   
	 Frame f;    
	   stuform() {    
	     f = new Frame("my first frame");    
	     f.addWindowListener (this);
	     Button b=new Button("submit");
	     f.add(b);
	     b.setBounds(650,650, 30, 40);
	     b.setSize(150,50);
	     b.setLabel("Submit");
	     f.setSize(1400,1400);    
	     f.setLayout(null);    
	     f.setVisible (true);
	     Label l1=new Label("Name : ");
	     f.add(l1);
	     l1.setBounds(400,150, 90, 140);
	     TextField t1=new TextField(30);
	     t1.setBounds(500,200, 170, 30);
	     f.add(t1);
	     Checkbox c1=new Checkbox("Male");
	     f.add(c1);
	     c1.setBounds(500, 500, 170, 20);
	     Checkbox c2=new Checkbox("Female");
	     f.add(c2);
	     c2.setBounds(500, 525, 170, 20);
	     Label l2=new Label("Gender : ");
	     f.add(l2);
	     l2.setBounds(400,450, 90, 140);
	     Label l3=new Label("Roll No : ");
	     f.add(l3);
	     l3.setBounds(400,250, 90, 140);
	     TextField t2=new TextField(30);
	     t2.setBounds(500,300, 170, 30);
	     f.add(t2);
	     Label l4=new Label("Phone no: ");
	     f.add(l4);
	     l4.setBounds(400,350, 90, 140);
	     TextField t3=new TextField(30);
	     t3.setBounds(500,400, 170, 30);
	     f.add(t3);
	 }    
	public void windowClosing (WindowEvent e) {    
	 f.dispose();    
	}    
	public static void main(String[] args) {    
	 new stuform();
	}    
	} 