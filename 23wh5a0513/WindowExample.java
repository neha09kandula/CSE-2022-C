package cse;
import java.util.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.Window;
public class WindowExample extends WindowAdapter(); 
WindowExample()
{
	Frame f = new Frame("Hello Frame");
	f.setSize(300,300);
    f.setBounds(40,20,70,80);
    f.setLayout(null);
    f.setVisible(true);
    Button b = new Button("Submit");
    f.add(b);
    b.setSize(10,10);
 }
    public void WindowClosing(Window Event e)
    {
    	f.dispose();
    }
    public static void main (String[] args)
    {
    	new WindowExample();
   }
}
    


