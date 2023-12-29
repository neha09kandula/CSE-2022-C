package cse_225g0;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.event.MouseListener;
public class Mouse_listener_interface extends Frame implements MouseListener {
	Label l;
	public Mouse_listener_interface() {
		addMouseListener(this);
		l=new Label();
		l.setBounds(20, 50, 150, 30);
		add(l);
		addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
		setSize(700,700);
		setLayout(null);
		setVisible(true);
	}
	public void mouseEntered(MouseEvent e) {
		l.setText("Mouse Entered");
	}
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse clicked");
	}
	public void mousePressed(MouseEvent e) {
		l.setText("Mouse Pressed");
	}
	public void mouseExited(MouseEvent e) {
		l.setText("Mouse Exited");
	}
	public void mouseReleased(MouseEvent e) {
		l.setText("Mouse Released");
	}
	 
	public static void main(String args[]) {
		new Mouse_listener_interface();
	}
}

