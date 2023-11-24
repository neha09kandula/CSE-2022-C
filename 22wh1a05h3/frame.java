package calculator;

import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
public class frame extends WindowAdapter{

	Frame f;
	Frame f1;
	public frame() {
		f = new Frame("frame");
        f.setSize(1000, 1000);
        f.setBounds(30, 60, 800, 600); // Corrected the size values
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(this);
        Button b1 = new Button("YELLOW");
        b1.setSize(50,50);
        b1.setBounds(300, 150, 60, 60);
        b1.setBounds(300, 150, 60, 60);
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                f.setBackground(Color.YELLOW);

            }

        });
        b1.setVisible(true);
        f.add(b1);
        Button b2 = new Button("BLUE");
        f.add(b2);
        b2.setSize(50,50);
        b2.setBounds(300, 250, 50, 50);
        b2.setVisible(true);
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                f.setBackground(Color.BLUE);

            }

        });
        Button b3 = new Button("PINK");
        f.add(b3);
        b3.setSize(50,50);
        b3.setBounds(300, 350, 50, 50);
        b3.setVisible(true);
        b3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                f.setBackground(Color.PINK);

            }

        });
	}
	public void frame1()
	{
		f1 = new Frame("frame1");
		f.setSize(1000,1000);
		f1.setBounds(30,60,800,800);
		f.setLayout(null);
		f.setVisible(true);
		Label l1 = new Label("this is new frame");
		f1.add(l1);
		l1.setSize(100,100);
		l1.setBounds(250,250,50,50);
		l1.setVisible(true);
		
	}
	public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String[] args) {
        new frame();
    }
}


