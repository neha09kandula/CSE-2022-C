package frames;
import java.awt.*;
import java.awt.event.*;

	public class submitandnext extends Frame {
	    submitandnext() {
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
	    }

	    public static void main(String[] args) {
	        new submitandnext(); 
	    }
	}
