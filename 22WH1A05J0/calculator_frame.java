package priyanka5j0;
import java.awt.*;
import java.awt.event.*;

public class calculator_frame {

    calculator_frame() {
        Frame f = new Frame();
        f.setSize(400, 500);
        f.setVisible(true);
        f.setLayout(null);

        Label l = new Label("NUM 1");
        f.add(l);
        TextField t1=new TextField();
        f.add(t1);
        t1.setBounds(50,50,70,20);
        l.setBounds(30, 50, 50, 20);

        Label l1 = new Label("NUM 2");
        f.add(l1);
        l1.setBounds(30, 80, 100, 30);
        TextField t2=new TextField();
        f.add(t2);
        t2.setBounds(100,80,70,30);

        Button b = new Button("+");
        Button b1 = new Button("-");
        Button b2 = new Button("*");
        Button b3 = new Button("/");
        Button b4 = new Button("=");

        b.setBounds(25, 150, 50, 30);
        b1.setBounds(80, 150, 50, 30);
        b2.setBounds(130, 150, 50, 30);
        b3.setBounds(200, 150, 50, 30);
        b4.setBounds(270, 200, 50, 100);

        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        Button a = new Button("1");
        Button b5 = new Button("2");
        Button c = new Button("3");
        Button d = new Button("4");
        Button e1 = new Button("5");
        Button f1 = new Button("6");
        Button g = new Button("7");
        Button h = new Button("8");
        Button i = new Button("9");
        Button j = new Button("0");

        a.setBounds(30, 200, 50, 30);
        b5.setBounds(90, 200, 50, 30);
        c.setBounds(150, 200, 50, 30);
        d.setBounds(30, 250, 50, 30);
        e1.setBounds(90, 250, 50, 30);
        f1.setBounds(150, 250, 50, 30);
        g.setBounds(30, 300, 50, 30);
        h.setBounds(90, 300, 50, 30);
        i.setBounds(150, 300, 50, 30);
        j.setBounds(90, 350, 50, 30);

        f.add(a);
        f.add(b5);
        f.add(c);
        f.add(d);
        f.add(e1);
        f.add(f1);
        f.add(g);
        f.add(h);
        f.add(i);
        f.add(j);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new calculator_frame();
    }
}
