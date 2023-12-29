package gui;
import java.awt.Frame;

import java.awt.event.*;

import java.awt.*;

public class MouseListenerExample extends Frame implements MouseListener{

	Label l;

	MouseListenerExample()

	{

		setLayout(null);

		setSize(900,900);

		setVisible(true);

		l=new Label(" ");

		add(l);

		l.setBounds(250,350,80,70);

		addMouseListener(this);

		addWindowListener (new WindowAdapter() {    

            public void windowClosing (WindowEvent e) {    

                dispose();    

            }    

        }); 

		

	}

	public static void main(String[] args) {



		new MouseListenerExample();

	}





	public void mouseClicked(MouseEvent e) {


		l.setText("Mouse clicked");

	}





	public void mousePressed(MouseEvent e) {

		l.setText("Mouse pressed");

		Graphics g=getGraphics();

		g.setColor(Color.RED);  

        g.fillOval(e.getX(),e.getY(),30,30); 

	}







	public void mouseEntered(MouseEvent e) {



		l.setText("Mouse entered");



		

	}



	@Override

	public void mouseExited(MouseEvent e) {



		l.setText("Mouse exited");

	}

	

	@Override

	public void mouseReleased(MouseEvent e) {



		

	}

	



}

