package CSE22h9;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseListenerExample extends Frame implements MouseListener{
	Label l;
	MouseListenerExample()
	{
		addMouseListener(this);
		l=new Label();
		l.setBounds(100,150,170,190);
		add(l);
		
		setSize(50,50);
		setBounds(130,160,180,200);
		setLayout(null);
		setVisible(true);
		
	}
	public void MouseClicked(MouseEvent e)
	{
		l.setText("MouseClicked");
	}
	
	public void mouseClicked(MouseEvent e) {
		l.setText("MouseClicked");
		
		
	}
	
	public void mousePressed(MouseEvent e) {
		l.setText("MousePressed");
		
	}

	public void mouseReleased(MouseEvent e) {
		l.setText("MouseEntered");
		
	}
	
	public void mouseEntered(MouseEvent e) {
		l.setText("MouseExited");
		
	}
	
	public void mouseExited(MouseEvent e) {
		l.setText("MouseReleased");
		
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
