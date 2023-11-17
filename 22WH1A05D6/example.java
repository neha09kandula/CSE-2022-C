package frames;

//importing the necessary libraries  
import java.awt.*;    
import java.awt.event.*;    

//class which inherits the WindowAdapter class  
public class example extends WindowAdapter {    
//object of Frame  
 Frame f;    
//class constructor  
 example() {    
//creating the frame  
     f = new Frame("my first frame");    
//adding  WindowListener to the frame  
     f.addWindowListener (this);
     Button b=new Button("submit");
     f.add(b);
     b.setSize(300,200);
     b.setLabel(null);
     
//setting the size, layout and visibility of frame  
     f.setSize (400, 400);    
     f.setLayout (null);    
     f.setVisible (true);    
 }    

//overriding the windowClosing() method   
public void windowClosing (WindowEvent e) {    
 f.dispose();    
}    
//main method  
public static void main(String[] args) {    
 new example();    
}    
}  