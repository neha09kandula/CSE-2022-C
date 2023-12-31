package cse225i0;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mouselistener_example extends Frame implements MouseListener {
	Label l;
	mouselistener_example(){
		addMouseListener(this);
		l=new Label();
		l.setBounds(140,160,180,190);
		add(l);
		
		setSize(150,150);
		setBounds(300,460,480,500);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e) {
		l.setText("mouse Clicked");
		
	}
	public void mousePressed(MouseEvent e) {
		l.setText("mouse Pressed");
		
	} 
	public void mouseReleased(MouseEvent e) {
		l.setText("mouse released");
		
	}
	public void mouseEntered(MouseEvent e) {
		l.setText("mouse entered");
	}
	public void mouseExited(MouseEvent e) {
		l.setText("mouse exited");
		
	}
	public static void main(String[]args)
	{
		mouselistener_example d = new mouselistener_example();
		d.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
		}
		});
		}
	}