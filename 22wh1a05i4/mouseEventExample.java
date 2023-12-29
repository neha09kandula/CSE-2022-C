package handlers;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class mouseEventExample extends Frame implements MouseListener 
{
	
		
	Label l;
	mouseEventExample()
	{
		addMouseListener(this);
		l = new Label();
		l.setBounds(20,50,70,90);
		add(l);
		
		setSize(150,150);
		setBounds(130,160,180,200);
		setVisible(true);
		setLayout(null);
		
		addWindowListener (new WindowAdapter() {    

            public void windowClosing (WindowEvent e) {    

                dispose();    

            }    

        });
		
	}
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse Clicked");
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Mouse Exited");
	}
	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse Released");
	}
	public void mousePressed(MouseEvent e)
	{
		l.setText("Mouse Pressed");
	} 
	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse Entered");
	}   
   // public void windowClosing (WindowEvent e) 
    //{    
       //     dispose(); 
    //}    
        

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mouseEventExample();
	}
	

}

