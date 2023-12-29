package cse225f7;
import java.awt.*;
import java.awt.event.*;
public class MouseEx extends Frame implements MouseListener {
	Label l;
	MouseEx(){
		addMouseListener(this);
		l = new Label();
		l.setBounds(20,50,100,20);
		add(l);
		setSize(300,300);
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			dispose();
		}
		});
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		l.setText("Mouse Clicked");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Pressed");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Released");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Enetered");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Exited");
	}
	public static void main(String[] args) {
		new MouseEx();
	}
}
