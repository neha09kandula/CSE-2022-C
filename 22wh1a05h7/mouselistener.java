package programs;
import java.awt.Frame;
import java.awt.event.*;
import java.awt.*;
public class mouselistener extends Frame implements MouseListener{
	Label l;
	mouselistener()
	{
		setLayout(null);
		setSize(900,900);
		setVisible(true);
		l=new Label(" ");
		add(l);
		l.setBounds(250,350,90,90);
		addMouseListener(this);
		addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        }); 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mouselistener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse clicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse pressed"); 
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse entered");

		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse exited");
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	

}
