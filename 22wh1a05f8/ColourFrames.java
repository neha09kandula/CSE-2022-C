package java225f8;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;

public  class ColourFrames extends WindowAdapter implements ActionListener{
	public Frame f;
	public Button b1,b2,b3;
	
	public ColourFrames() {
		f=new Frame("Colours");
		f.addWindowListener(this);
		f.setSize(900, 900);
		f.setBounds(600, 100, 800, 800);
		f.setLayout(null);
		f.setVisible(true);
		
		//setting labels
	    b1= new Button("pink");
	    b1.setBounds(200, 100, 100, 50);
	    b1.setVisible(true);
		
	    b2= new Button("green");
	    b2.setBounds(200, 200, 100, 50);
	    b2.setVisible(true);
		
	    b3= new Button("yellow");
	    b3.setBounds(200, 300, 100, 50);
	    b3.setVisible(true);
	    
	    f.add(b3);
	    f.add(b1);
	    f.add(b2);
	    
	    //adding actions
	    b1.addActionListener(this);
	    b2.addActionListener(this);
	    b3.addActionListener(this);
	    
	    
	}
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == b1)
		{
			changeBackgroundColor(Color.YELLOW);
		}
		else if(ae.getSource() ==b2)
		{
			changeBackgroundColor(Color.GREEN);
		}
		else if(ae.getSource()== b3)
		{
			changeBackgroundColor(Color.YELLOW);
		}
			
	}
	private void changeBackgroundColor(Color color)
	{
		f.setBackground(color);
		f.repaint();
	}
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	public static void main(String[] args)
	{
		new ColourFrames();

		}
}
