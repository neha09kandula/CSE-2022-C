package calci;
import java.awt.*;
import java.awt.event.*;

import calci.Buttons;
import calci.MyClass6;
class Buttons extends Frame implements ActionListener {
    Button b1, b2, b3, b4, b5, b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    TextArea t1;
    Panel p;
    Buttons() {
        this.setLayout(new BorderLayout());
        t1 = new TextArea();
        add(t1,BorderLayout.NORTH);
        p=new Panel(new GridLayout(4,4));
        this.add(p);
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11= new Button("+");
        b12= new Button("-");
        b13= new Button("*");
        b14 = new Button("/");
        b15 = new Button("=");
        b16 = new Button("C");
        
        

        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);
        p.add(b15);
        p.add(b16);
        //this.add(b5);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        //b6.addActionListener(this);
        //b6.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        //String str = ae.getActionCommand();
    	
        

    }

    
}


public class calculator {
	public static void main(String[] args) {
        Buttons f = new Buttons();
        f.setTitle("calci");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setBackground(Color.pink);
        f.addWindowListener(new MyClass6());
    }
	 

		}

class MyClass6 extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
