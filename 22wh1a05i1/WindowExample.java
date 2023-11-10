package cse_225i1;

import java.awt.*;
import java.awt.event.*;

public class WindowExample extends Frame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	WindowExample() {
       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(400, 400);
        setBounds(40, 60, 400, 400); 
        setLayout(null);
        setVisible(true);
    }

   
    public void paint(Graphics g) {
        super.paint(g);
        drawRectangle(g);
    }

    // Method to draw a rectangle
    public void drawRectangle(Graphics g) {
        g.drawRect(120, 120, 120, 120);
    }

    public static void main(String[] args) {
      
        new WindowExample();
    }
}



