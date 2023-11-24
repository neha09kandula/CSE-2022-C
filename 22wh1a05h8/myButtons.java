package cse_22515;
import java.awt.*;
import java.awt.event.*;
public class myButtons extends Frame implements ActionListener {
	 
	
	public myButtons() {
		setTitle("Hello");
		setSize(400,400);
		setBounds(30, 120, 400, 400);
		setLayout(null);
		setVisible(true);
		setBackground(Color.WHITE);
		
		Button bR = new Button("Red");
		add(bR);
		bR.setSize(80, 80);
		bR.setBounds(80, 80, 80, 80);
		bR.setVisible(true);
		
		
		
		Button bY = new Button("Yellow");
		add(bY);
		bY.setSize(80, 80);
		bY.setBounds(80, 180, 80, 80);
		bY.setVisible(true);
		
		
		Button bP = new Button("Pink");
		add(bP);
		bP.setSize(80, 80);
		bP.setBounds(80, 280, 80, 80);
		bP.setVisible(true);
		
		bR.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setBackground(Color.red);
				}
		});
		
		bY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.yellow);
			}
	    });
		
		bP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setBackground(Color.PINK);
			}
    	});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		setVisible(true);
	}
	


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myButtons();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}


