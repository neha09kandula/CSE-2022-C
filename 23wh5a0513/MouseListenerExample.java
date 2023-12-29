package cse13;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerExample extends Frame implements MouseListener{
	Label l;
	MouseListenerExample()
	{
	    addMouseListener(this);
		l=new Label();
		l.setBounds(20,50,70,90);
		add(l);
		setSize(50,50);
		setBounds(20,60,80,100);
		setVisible(true);
		setLayout(null);
	}
public void MouseClicked(MouseEvent e)
 {
	 l.setText("mouseclicked");
 }
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("mousePressed");
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("mouseReleased");
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("mouseEntered");
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	l.setText("mouseExited");
}
public static void main(String[] args)
{
	new MouseListenerExample();
}
}
