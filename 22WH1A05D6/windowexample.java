package frames;
import java.awt.*;
import java.awt.event.*;
// importing necessary awt libraries       
  
// class which inherits the Frame class  
public class windowexample extends Frame {    
// class constructor  
    windowexample() {    
// adding WindowListener to the Frame  
// and using the windowClosing() method of WindowAdapter class  
        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });    
// setting the size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }  
    public void paint(Graphics g)
    {
    	g.drawRect(200, 110, 120, 30);
    }
// main method  
public static void main (String[] args) {    
    new windowexample();    
}  
}