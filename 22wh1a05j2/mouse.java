package cse_5j2;
import java.awt.*;
import java.awt.event.*;


public class mouse extends Frame implements MouseListener{
	Label l;
	public mouse() {
		addMouseListener(this);
		l=new Label();
		l.setBounds(100, 200,80,90 );
		add(l);
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		setTitle("mouse Listener");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
		
	}

	public void mouseClicked(MouseEvent e) {
		l.setText("mouse clicked");
		
	}

	public void mousePressed(MouseEvent e) {

		l.setText("mouse pressed");
		
		
	}

	public void mouseReleased(MouseEvent e) {
	
		l.setText("mouse released");
		
		
	}
	
	public void mouseEntered(MouseEvent e) {
	
		l.setText("mouse entered");
		
		
	}
	
	public static void main(String args[]) {
		new mouse();
	}

	
	public void mouseExited(MouseEvent e) {
	
		l.setText("mouse exited");
		
	}

	

}
