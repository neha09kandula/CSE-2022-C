package frames;
import java.awt.*;
import java.awt.event.*;

public class windowexample extends WindowAdapter {
    private Frame f;

    public windowexample() {
        f = new Frame("Hello Frame");
        f.setSize(1000, 1000);
        f.setBounds(30, 60, 800, 600); // Corrected the size values
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(this);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String[] args) {
        new windowexample();
    }
}
