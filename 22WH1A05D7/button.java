package cse225d7;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;


public class button extends Frame implements ActionListener{
	Button yellow, blue,pink;
	public button() {
		setTitle("page");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        yellow = new Button("yellow");
        yellow.setBounds(130, 130, 50,40);
        add(yellow);
        blue = new Button("blue");
        blue.setBounds(130, 180, 50,40);
        add(blue);
        pink = new Button("pink");
        pink.setBounds(130, 230, 50,40);
        add(pink);
        yellow.addActionListener(this);
        blue.addActionListener(this);
        pink.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	            System.exit(0);
	        }
	    });
	}
	    public void actionPerformed(ActionEvent ae) {
	        	String str=ae.getActionCommand();
	    		if(str.equals("blue"))
	    		 this.setBackground(Color.blue);
	    		if(str.equals("yellow"))
	    		  this.setBackground(Color.yellow);
	    		if(str.equals("pink"))
	    		setBackground(Color.pink);
	        }
	   
	
	public static void main(String[] args) {
		 new button();
		// TODO Auto,-generated method stub

	}


}






