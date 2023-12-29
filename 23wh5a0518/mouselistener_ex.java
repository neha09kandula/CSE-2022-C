package frames;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class mouselistener_ex extends Frame implements MouseListener {

                 
	Label l;

   mouselistener_ex() {
	   addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 70, 90);
        add(l);
        setSize(50, 60);
        setBounds(30, 40, 80, 100);
        setLayout(null);
        setVisible(true);
    }
    public void MouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse pressed");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		l.setText("Mouse entered");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse released");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse exited");
		
	}
    public static void main(String[] args) {
    	mouselistener_ex v=new mouselistener_ex();
    	v.addWindowListener(new WindowAdapter()
    			{
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);
    		}
    			});
	    }	
	}
		
	

