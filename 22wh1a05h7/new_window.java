package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class new_window extends WindowAdapter{
	Frame f;
	new_window(){
		f=new Frame(" ");
		f.addWindowListener (this);
	    f.setSize(400,400);
	    f.setVisible(true);
	    f.setLayout(null);
	    Button b=new Button("Next");
	    b.setBounds(100,210,65,45);
	    f.add(b);
	    Button b1=new Button("Submit");
	    b1.setBounds(100,290,55,45);
	    f.add(b1);
	    //f.setBackground(Color.BLACK);
	    
	    PopupMenu f1=new PopupMenu("new");
	    f.add(f1);
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public static void main(String [] args) {
		new new_window();
	}
}
