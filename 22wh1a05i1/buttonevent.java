package frames;

import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

public class buttonevent {
    Button yellowbutton, pinkbutton, bluebutton;
    Frame f;

    buttonevent() {
        f = new Frame("buttonevent");
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);

        yellowbutton = new Button("GRAY");
        pinkbutton = new Button("PINK");
        bluebutton = new Button("CYAN");

        yellowbutton.setBounds(50, 50, 100, 30);
        pinkbutton.setBounds(50, 90, 100, 30);
        bluebutton.setBounds(50, 130, 100, 30);

        f.add(yellowbutton);
        f.add(pinkbutton);
        f.add(bluebutton);
        f.setBackground(Color.LIGHT_GRAY);

        yellowbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  f.setBackground(Color.LIGHT_GRAY);
            }
        });

        pinkbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  f.setBackground(Color.PINK);
            }
        });

        bluebutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	  f.setBackground(Color.CYAN);
            }
        });

        f.addWindowListener(new MyWindowAdapter());
    }

    public static void main(String[] args) {
        new buttonevent();
    }
}

