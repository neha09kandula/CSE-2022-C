package cse_225i1;
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class calculator extends Frame {

	Button result, clear, add, sub, div, multiply,a,b,c,d,e,f,g,h,i,j;
    TextField numField;
    Label label;

    calculator() {
        setLayout(null);

        result = new Button("Result");
        clear = new Button("Clear");
        add = new Button("+");
        sub = new Button("-");
        multiply = new Button("*");
        div = new Button("/");
        a = new Button("1");
        b = new Button("2");
        c = new Button("3");
        d = new Button("4");
        e = new Button("5");
        f = new Button("6");
        g = new Button("7");
        h = new Button("8");
        i = new Button("9");
        j = new Button("0");
        numField = new TextField(); // Added num2Field
        label = new Label();
        
        result.setBounds(50, 210, 80, 30);
        clear.setBounds(150, 210, 80, 30);
        add.setBounds(50, 180, 80, 30);
        sub.setBounds(150, 180, 80, 30);
        multiply.setBounds(50, 150, 80, 30);
        div.setBounds(150, 150, 80, 30);
        a.setBounds(50, 80, 30, 20);
        b.setBounds(90, 80, 30, 20);
        c.setBounds(130, 80, 30, 20);
        d.setBounds(170, 80, 30, 20);
        e.setBounds(210, 80, 30, 20);
        f.setBounds(50, 120, 30, 20);
        g.setBounds(90, 120, 30, 20);
        h.setBounds(130, 120, 30, 20);
        i.setBounds(170, 120, 30, 20);
        j.setBounds(210, 120, 30, 20);
        
        numField.setBounds(50, 50, 180, 30);
        label.setBounds(50, 220, 180, 30);

        add(result);
        add(clear);
        add(add);
        add(sub);
        add(div);
        add(multiply);
        add(numField);
        add(label);
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        add(g);
        add(h);
        add(i);
        add(j);
       
    }

    public static void main(String[] args) {
        calculator f = new calculator();
        f.setTitle("Calculator");
        f.setSize(300, 200);
        f.setVisible(true);
        f.addWindowListener(new MyWindowAdapter());
    }
}
