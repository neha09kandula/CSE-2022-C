package frames;
import java.awt.*;
import java.awt.event.*;

	public class button extends Frame {
	    button() {
	        Frame f = new Frame("HelloFrame"); 
	        f.setSize(400, 400);
	        f.setBounds(30, 60, 80, 120);
	        f.setLayout(null); 
	        f.setVisible(true);

	        Button b = new Button("submit"); 
	        f.add(b);
	        b.setBounds(50, 50, 80, 30); 

	        b.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) {
	                
	            }
	        });

	        f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                f.dispose();
	            }
	        });
	    }

	    public static void main(String[] args) {
	        new button(); 
	    }
	}
