package priyanka5j0;
import java.awt.*;
import java.awt.event.*;

class sample extends WindowAdapter implements ActionListener {

    Button b;
    Label l, l1, l2;
    TextField t1, t2;
    Frame f;

    sample() {
        f = new Frame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);

        b = new Button("SUM");
        f.add(b);
        b.setBounds(200, 400, 100, 50); 
        t1 = new TextField();
        t1.setBounds(300, 200, 100, 25); 
        f.add(t1);
        t2 = new TextField();
        t2.setBounds(300, 250, 100, 25); 
        f.add(t2);
        l = new Label("NUM 1");
        l.setBounds(200, 200, 50, 25); 
        f.add(l);
        l1 = new Label("NUM 2");
        l1.setBounds(200, 250, 50, 25);
        f.add(l1);
        l2 = new Label();
        l2.setBounds(250, 500, 100, 25); 
        f.add(l2);
        
        b.addActionListener(this);
        f.addWindowListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        l2.setText(String.valueOf(c));
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public static void main(String args[]) {
        new sample();
    }
}
