package cse_22515;
import java.awt.*;
import java.awt.event.*;
public class buttonEvent extends WindowAdapter {
	private Frame f;
	
	public buttonEvent() {
		f = new Frame("Hello Frame");
		f.setSize(400,400);
		f.setBounds(30, 120, 400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(this);
		f.setBackground(Color.WHITE);
		
		Button bR = new Button("Red");
		f.add(bR);
		bR.setSize(80, 80);
		bR.setBounds(80, 80, 80, 80);
		bR.setVisible(true);
		bR.setBackground(Color.red);
		
		
		Button bY = new Button("Yellow");
		f.add(bY);
		bY.setSize(80, 80);
		bY.setBounds(80, 180, 80, 80);
		bY.setVisible(true);
		bY.setBackground(Color.yellow);
		
		Button bP = new Button("Pink");
		f.add(bP);
		bP.setSize(80, 80);
		bP.setBounds(80, 280, 80, 80);
		bP.setVisible(true);
		bP.setBackground(Color.pink);
		
		
		
	}
	
	public void windowClosing (WindowEvent e) {
		f.dispose();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new buttonEvent();
	}

}
