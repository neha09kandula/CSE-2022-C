package Frames;
import java.awt.*;
import java.awt.event.*;

	public class main extends Frame {
	    main() {
	        Frame f = new Frame("HelloFrame"); 
	        f.setSize(400, 400);
	        f.setLayout(null); 
	        f.setVisible(true);

	        Button a = new Button("submit");
	        Button b = new Button("next");
	        
	        f.add(a);
	        f.add(b);
	        a.setBounds(190, 200, 80, 50);
	        b.setBounds(80, 200, 80, 50); 
	        
	        

	        a.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) {
	                f.dispose();
	            }
	        });

	        f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                f.dispose();
	            }
	        });
	        
	        b.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) {
	                Frame f2 = new Frame("New Frame");
	                f2.setSize(400,400);
	                f2.setVisible(true);
	                Button c = new Button("Button");
	                f2.add(c);
            		c.setBounds(190, 200, 80, 50);
            		c.addActionListener(new ActionListener() { 
        	            public void actionPerformed(ActionEvent e) {
        	                f2.dispose(); 
        	            }
        	        });
	            }
	        });
	    }
	            		
	    public static void main(String[] args) {
	        new main(); 
	    }
	}