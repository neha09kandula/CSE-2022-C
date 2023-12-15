package demo;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
public class windowexample extends Frame {
windowexample(){
	addWindowListener(new WindowAdapter()
	{
		public void WindowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		
	});
	setSize(900,900);
	setBounds(30,40,110,120);
	setLayout(null);
	setVisible(true);
	
	 Button b1 = new Button("1");
     add(b1);
     b1.setSize(10,20);
     b1.setBounds(30,40,20,40);
     b1.setLabel(null);
     b1.setVisible(true);
     
     Button b2 = new Button("2");
     add(b2);
     b2.setSize(50,60);
     b2.setBounds(40,30,50,60);
     b2.setLabel(null);
     b2.setVisible(true);
     
     Button b3 = new Button("3");
     add(b3);
     b3.setSize(80,90);
     b3.setBounds(40,30,100,110);
     b3.setLabel(null);
     b3.setVisible(true);
    		 
     Button b4 = new Button("4");
     add(b4);
     b4.setSize(70,80);
     b4.setBounds(40,30,100,110);
     b4.setLabel(null);
     b4.setVisible(true);
     
     Button b5 = new Button("5");
     add(b5);
     b5.setSize(90,100);
     b5.setBounds(30,40,20,40);
     b5.setLabel(null);
     b5.setVisible(true);
     
     
     Button b6 = new Button("6");
     add(b6);
     b6.setSize(70,80);
     b6.setBounds(40,30,100,110);
     b6.setLabel(null);
     b6.setVisible(true);
     
     Button b7 = new Button("7");
     add(b7);
     b7.setSize(70,80);
     b7.setBounds(30,40,20,40);
     b7.setLabel(null);
     b7.setVisible(true);
     
     Button b8 = new Button("8");
     add(b8);
     b8.setSize(70,80);
     b8.setBounds(30,40,20,40);
     b8.setLabel(null);
     b8.setVisible(true);
     
     Button b9 = new Button("9");
     add(b9);
     b9.setSize(70,80);
     b9.setBounds(30,40,20,40);
     b9.setLabel(null);
     b9.setVisible(true);
     
     Button b0 = new Button("0");
     add(b0);
     b0.setSize(70,80);
     b0.setBounds(30,40,20,40);
     b0.setLabel(null);
     b0.setVisible(true);
}
public static void main(String[] args)
{
	new windowexample();
}

}
