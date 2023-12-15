package cse225g2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class implementFrames extends Frame implements ActionListener {

    Button b1, b2, b3;
    
    public implementFrames() {
        super("Implementing Colored Frames");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        b1 = new Button("Black");
        b1.setBounds(50, 150, 100, 30);
        b1.addActionListener(this);

        b2 = new Button("Orange");
        b2.setBounds(150, 150, 100, 30);
        b2.addActionListener(this);

        b3 = new Button("Magenta");
        b3.setBounds(50, 200, 100, 30);
        b3.addActionListener(this);

        add(b1);
        add(b2);
        add(b3);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            changeBackgroundColor(Color.BLACK);
        } else if (e.getSource() == b2) {
            changeBackgroundColor(Color.ORANGE);
        } else if (e.getSource() == b3) {
            changeBackgroundColor(Color.MAGENTA);
        }
    }

    private void changeBackgroundColor(Color color) {
        setBackground(color);
    }

    public static void main(String[] args) {
        new implementFrames();
    }
}