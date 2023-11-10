package frames;
import java.awt.*;
import java.awt.event.*;

public class windowexample extends Frame {
    windowexample() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setLayout(null);
        setSize(400, 400);
        setBounds(30, 60, 80, 120);
        setVisible(true);
    }
    public void paint(Graphics g) {
        g.drawRect(200, 110, 120, 30);
    }
    public static void main(String[] args) {
        new windowexample();
    }
}

