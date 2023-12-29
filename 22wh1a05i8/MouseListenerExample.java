package cse225i8;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListenerExample extends Frame implements MouseListener 
{
	Label l;
	MouseListenerExample()
	{
		addMouseListener(this);
		l=new Label();
		l.setBounds(100,100,100,100);
		add(l);
	
		setSize(50,50);
		setBounds(200,200,200,200);
		setLayout(null);
		setVisible(true);
	}
public void MouseClicked(MouseEvent e)
{
	l.setText(" Mouse Clicked");
}

	

public void mouseClicked(MouseEvent e) {
	l.setText(" Mouse Clicked");
	
}

public void mousePressed(MouseEvent e) {
	l.setText(" Mouse pressed");
}

public void mouseReleased(MouseEvent e) {
	l.setText(" Mouse released");
}

public void mouseEntered(MouseEvent e) {
	l.setText(" Mouse entered");
}
public void mouseExited(MouseEvent e) {
	l.setText(" Mouse exited");
}
public static void main(String[] args) {

	MouseListenerExample d=new MouseListenerExample();



  d.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent we)

	{

	System.exit(0);

	}

	});

}

}
