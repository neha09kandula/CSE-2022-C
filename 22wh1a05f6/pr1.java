package f5pack;
import java.awt.*;
import java.awt.event.*;
public class pr1 extends Frame implements ActionListener {
    Button b1, b2, b3;
    pr1() {
        setSize(800, 800);
        setVisible(true);
        setLayout(null);
        setTitle("F1");
        setBackground(Color.darkGray);
        b1 = new Button("NEXT");
        b1.setBackground(Color.YELLOW);
        b2 = new Button("CLICK");
        b2.setBackground(Color.YELLOW);
        b1.setBounds(250, 300, 100, 50);
        b2.setBounds(500, 300, 100, 50);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });}
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            Frame f = new Frame();
            f.setSize(800, 800);
            f.setVisible(true);
            f.setLayout(null);
            f.setTitle("F2");
            b3 = new Button("WELCOME");
            b3.setBounds(270, 300, 100, 50);
            f.add(b3);
            f.setBackground(Color.PINK);
            f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    f.dispose();
                }
            });           
        } else if (ae.getSource() == b2) {
            System.exit(0);
        }}
    public static void main(String[] args) {
        new pr1();        
    }}
