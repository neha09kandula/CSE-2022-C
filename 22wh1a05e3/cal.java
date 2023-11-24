package cse5e3;
import java.awt.*;
import java.awt.event.*;

public class cal extends Frame {
    TextField enterField ;
    Button add,mul,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,equals;

    public cal() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);
        Label enterLabel = new Label("Enter");
        
        enterField = new TextField();
        add = new Button(" + ");
        mul = new Button(" * ");
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
        equals = new Button("=");
        
        
        enterLabel.setBounds(50,30,80,20);
        
        enterField.setBounds(50, 50, 150, 30);
        
        b1.setBounds(50, 100, 30, 30);
        b2.setBounds(90, 100, 30, 30);
        b3.setBounds(130, 100, 30, 30);
        b4.setBounds(170, 100, 30, 30);
        b5.setBounds(50, 130, 30, 30);
        b6.setBounds(90, 130, 30, 30);
        b7.setBounds(130, 130, 30, 30);
        b8.setBounds(170, 130, 30, 30);
        b9.setBounds(50, 160, 30, 30);
        b10.setBounds(90, 160, 30, 30);
        equals.setBounds(130, 160, 70, 30);
        
        add.setBounds(50, 220, 80, 30);
        mul.setBounds(130, 220, 80, 30);
        
        
        add(enterLabel);	
        add(enterField);
        add(add);
        add(mul);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(equals);
        
        
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new cal();
    }
}
