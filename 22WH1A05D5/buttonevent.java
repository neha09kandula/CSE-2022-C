package frames;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;


public class buttonevent extends Frame implements ActionListener{
	Button yellow, blue,pink;
	public buttonevent() {
		setTitle("page");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        
        yellow = new Button("yellow");
        blue = new Button("blue");
        pink = new Button("pink");
        
        yellow.setBounds(130, 130, 50,40);
        blue.setBounds(130, 180, 50,40);
        pink.setBounds(130, 230, 50,40);
        
        add(yellow);
        add(blue);
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
	    		if(str.equals("blue"))this.setBackground(Color.blue);
	    		if(str.equals("yellow"))this.setBackground(Color.yellow);
	    		if(str.equals("pink"))this.setBackground(Color.pink);
	        }
	   
	
	public static void main(String[] args) {
		 new buttonevent();
		// TODO Auto,-generated method stub

	}


}





