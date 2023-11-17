package Frame;

import java.awt.*;    
import java.awt.event.*;    
public class Example extends WindowAdapter {    
 Frame f;    
 Example() {    
     f = new Frame("my first frame");    
     f.addWindowListener (this);
     Button b=new Button("submit");
     f.add(b);
     b.setSize(300,200);
     b.setLabel(null);
     f.setSize (400, 400);    
     f.setLayout (null);    
     f.setVisible (true);    
 }    
public void windowClosing (WindowEvent e) {    
 f.dispose();    
}    
public static void main(String[] args) {    
 new Example();    
}    
}  

