package Frame;

import java.awt.*;

import java.awt.event.*;

public class WindowExample extends Frame {    
    WindowExample() {    
        addWindowListener (new WindowAdapter() {    

            public void windowClosing (WindowEvent e) {    

                dispose();    
                }    
         });    
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }  
    public void paint(Graphics g)
    {
    	g.drawRect(200, 110, 120, 30);
    }
public static void main (String[] args) {    
    new WindowExample();    
}  
}

