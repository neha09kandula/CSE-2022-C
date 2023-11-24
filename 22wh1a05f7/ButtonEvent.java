package cse225f7;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Frame;

public class ButtonEvent extends WindowAdapter{
	Frame f= new Frame("Button");
	public ButtonEvent() {
		f.addWindowListener(this);
		f.setBounds(200,200,50,50);
	    f.setSize(40,40);
	    f.setVisible(true);
	    f.setLayout(null);
	    
	    Button b=new Button("blue");
	    f.add(b);
	    b.setBounds(400,200,50,50);
	    b.setVisible(true);
	    
	    Button b1=new Button("yellow");
	    f.add(b1);
	    b1.setBounds(400,300,50,50);
	    b1.setVisible(true);
	    
	    Button b2=new Button("green");
	    f.add(b2);
	    b2.setBounds(400,400,50,50);
	    b2.setVisible(true);
	    
	}
	public static void main(String[] args)
	{
		new ButtonEvent();
	}
	public void actionperformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str.equals("blue"))this.setBackground(Color.blue);
		if(str.equals("yellow"))this.setBackground(Color.yellow);
		if(str.equals("green"))this.setBackground(Color.green);
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
			
	
	

}
