package priyanka5j0;
import java.util.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.*;
import java.awt.TextField;


public class calculator extends WindowAdapter {
   
	Frame f= new Frame("calculator");
	calculator()
	{
		 f.addWindowListener(this);
	    
		f.setSize(1000,1000);
		f.setLayout(null);
		f.setVisible(true);
		
		
		Button b = new Button("+");
		f.add(b);
		b.setSize(100, 100);
		b.setBounds(500, 800, 50, 50);
		
		
		
		
		Button b1 = new Button("-");
		f.add(b1);
		b1.setSize(100, 100);
		b1.setBounds(600, 800, 50, 50);
		
		
		
		Button b3 = new Button("*");
		f.add(b3);
		b3.setSize(100, 100);
		b3.setBounds(700, 800, 50, 50);
		
		
		Button b4 = new Button("/");
		f.add(b4);
		b4.setSize(100, 100);
		b4.setBounds(800, 800, 50, 50);
		
		
		Button b5 = new Button("=");
		f.add(b5);
		b5.setSize(100, 50);
		b5.setBounds(900, 800, 50, 50);
		
		Label l=new Label("number 1");
		f.add(l);
		l.setVisible(true);
		l.setSize(500, 500);
		l.setBounds(400, 300, 75, 75);
		
		
		TextField t=new TextField();
		f.add(t);
		t.setBounds(600, 300, 150, 50);
		t.setVisible(true);
		
		Label l1=new Label("number 2");
		f.add(l1);
		l1.setVisible(true);
		l1.setSize(500, 500);
		l1.setBounds(400, 500, 75, 75);
		
		TextField t1=new TextField();
		f.add(t1);
		t1.setBounds(600, 500, 150, 50);
		t1.setVisible(true);
		
		
	}		
				
      public void windowClosing(WindowEvent we )
     {
		System.exit(0);
     }
     public static void  main(String[] args)
      {
			new calculator();
	  }
	
	
	
}
