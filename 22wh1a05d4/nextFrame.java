package cse225d4;
import java.awt.*;
import java.awt.event.*;

public class nextFrame  extends Frame{
	Button submitbutton ,nextbutton;
	
	public nextFrame() {
		setTitle(" my Frame ");
		setSize(800,800);
		setLayout(null);
		
		submitbutton=new Button(" SUBMIT ");
		nextbutton=new Button(" NEXT ");
		
		submitbutton.setBounds(200, 220, 100, 30);
	    nextbutton.setBounds(400, 220, 100, 30);
	    
	    submitbutton.setBackground(Color.green);
	    nextbutton.setBackground(Color.MAGENTA);
	    
	    
	    
	    add(submitbutton);
	    add(nextbutton);
	    
	    submitbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            	
            }
        });
	    
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            	dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new nextFrame();
    }
}    
	     
	     
	        
		
		
