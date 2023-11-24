package cse225d4;

import java.awt.*;

import java.awt.event.*;
public class buttonevent extends Frame{
	
	buttonevent(String str){
		setSize(800,800);
		setLayout(null);
		
	
		
	   Button yellowbutton=new Button(" YELLOW ");
	   Button redbutton=new Button(" RED");
	   Button greenbutton=new Button(" Green ");
	   
	   yellowbutton.setBounds(100,350,60,40);
	   redbutton.setBounds(200,350,60,40);
	   greenbutton.setBounds(300,350,60,40);
	   
	   add(yellowbutton);
	   add(redbutton);
	   add(greenbutton);
	   
	   
	   if(str=="yellow") {
	    yellowbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 	
            		setBackground(Color.yellow);  		
     
            	
        	        	
            }
        });}
	   if(str=="red") {
	    redbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setBackground(Color.red);
        	        	
            }
        });}
	    
	   if(str=="green") {
	    greenbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	setBackground(Color.green);
        	        	
            }
        });}
	   	
	   addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
           	dispose();
           }
       });

       setVisible(true);
   }

   public static void main(String[] args) {
       new buttonevent("green");
   }
}    
	     
