
package wh1a05d4;
import java.awt.*;
import java.awt.event.*;

public class nextframe  extends Frame{
	Button submitbutton ,nextbutton;
	
	public nextframe() {
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
	    
	    
	    nextbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	
            	//create Frame obj and display
            	Frame f2 = new Frame();
            	f2.setSize(600,600);
            	f2.setVisible(true);
            	f2.setTitle("Second Frame");
            	Button b3 = new Button("BUTTON");
            	f2.add(b3);
            	b3.setBounds(200, 100, 70, 40);
            	b3.setBackground(Color.ORANGE);
            	
            	
              	 b3.addActionListener(new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                     	f2.dispose();
                     	
                     }
                 });
             	
            	
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
        new nextframe();
    }
} 