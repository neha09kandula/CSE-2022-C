package cse225d7;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class buttonevent extends Frame {
	Button yellow, blue,pink,button;
	public buttonevent() {
		setTitle("page");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        yellow = new Button("yellow");
        yellow.setBounds(130, 130, 50,40);
        add(yellow);
        blue = new Button("blue");
        blue.setBounds(130, 180, 50,40);
        add(blue);
        pink = new Button("pink");
        pink.setBounds(130, 230, 50,40);
        add(pink);
        
        yellow.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	setBackground(Color.yellow);
	        }
	    });
        blue.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	setBackground(Color.blue);
	        }
	    });
        pink.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	setBackground(Color.pink);
	        }
	    });
	 addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    });
}


	public static void main(String[] args) {
		new buttonevent();
		// TODO Auto-generated method stub

	}

}
