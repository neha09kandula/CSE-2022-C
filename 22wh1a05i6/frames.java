package cse225i6;
import java.awt.*;
import java.awt.event.*;

public class frames extends WindowAdapter
{
	Frame f;
	frames()
	{
		f = new Frame("My checkbox");
	    f.addWindowListener(this);
		f.setSize(500, 500);
		f.setBounds(120, 200, 500, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setBackground(Color.LIGHT_GRAY);
		
		Checkbox c1 = new Checkbox("Bold");
		f.add(c1);
		c1.setBounds(30, 30, 50, 50);
		
		Checkbox c2 = new Checkbox("Italic");
		f.add(c2);
		c2.setBounds(90, 30, 50, 50);
		
		Checkbox c3 = new Checkbox("Underline");
		f.add(c3);
		c3.setBounds(150, 30, 70, 50);
		
		//ChechboxGroup is used to create radio button
		Checkbox r1,r2;
		CheckboxGroup cbg;
		cbg = new CheckboxGroup();
		r1 = new Checkbox("Yes",cbg,false);
		r1.setBounds(240, 30, 50, 50);
		r2 = new Checkbox("No",cbg,false);
		r2.setBounds(290, 30, 50, 50);
		f.add(r1);
		f.add(r2);
		
		//drop down button
		Choice ch;
		ch = new Choice();
		ch.add("ENGLISH");
		ch.add("HINDI");
		ch.add("TELUGU");
		ch.add("FRENCH");
		ch.setBounds(350, 45,80, 70);
		f.add(ch);
	}
	public void windowClosing(WindowEvent e)
	   {
		  f.dispose(); 
	   }
	public static void main(String args[])
	{
		new frames();
	}
}
