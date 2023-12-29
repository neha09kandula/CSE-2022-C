package cse225g2;

import java.awt.*;
import java.awt.event.*;

public class mouseListenerExample extends Frame implements MouseListener {
    Label l;

    mouseListenerExample() {
        addMouseListener(this);
        l = new Label();
        l.setBounds(20, 50, 150, 30); 
        add(l);
        setSize(500, 500);
        setLocation(30, 60);
        setLayout(null); 
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public static void main(String args[]) {
        new mouseListenerExample();
    }
}
