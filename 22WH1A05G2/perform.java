package cse225g2;

import java.awt.*;
import java.awt.event.*;

public class perform extends Frame implements ActionListener {
    private TextField t1, t2;
    private Label resultLabel;

    public perform() {
        setTitle("Operations");
        setSize(1000, 1600);
        setLayout(null);

        Label l = new Label("Here is your Dream Calculator... Come on.. Let's go...");
        l.setFont(new Font("Arial", Font.BOLD, 22));
        l.setBounds(330, 100, 800, 100);
        add(l);

        Label l1 = new Label("NUM1:");
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        l1.setBounds(80, 304, 100, 30);
        add(l1);

        t1 = new TextField();
        t1.setBounds(190, 298, 90, 60);
        add(t1);

        Label l2 = new Label("NUM2:");
        l2.setFont(new Font("Arial", Font.BOLD, 18));
        l2.setBounds(80, 441, 100, 30);
        add(l2);

        t2 = new TextField();
        t2.setBounds(190, 435, 90, 60);
        add(t2);

        Label l3 = new Label("RESULT:");
        l3.setFont(new Font("Arial", Font.BOLD, 18));
        l3.setBounds(560, 341, 100, 30);
        add(l3);

        resultLabel = new Label();
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));
        resultLabel.setBounds(680, 341, 200, 30);
        add(resultLabel);

        Button b1 = new Button("ADD");
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setBounds(120, 591, 120, 60);
        b1.addActionListener(this);
        add(b1);

        Button b2 = new Button("SUBTRACT");
        b2.setFont(new Font("Arial", Font.BOLD, 16));
        b2.setBounds(270, 591, 120, 60);
        b2.addActionListener(this);
        add(b2);

        Button b3 = new Button("MULTIPLY");
        b3.setFont(new Font("Arial", Font.BOLD, 16));
        b3.setBounds(420, 591, 120, 60);
        b3.addActionListener(this);
        add(b3);

        Button b4 = new Button("DIVIDE");
        b4.setFont(new Font("Arial", Font.BOLD, 16));
        b4.setBounds(590, 591, 120, 60);
        b4.addActionListener(this);
        add(b4);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    private boolean isValidInput(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void actionPerformed(ActionEvent e) {
        String input1 = t1.getText();
        String input2 = t2.getText();

        if (!isValidInput(input1) || !isValidInput(input2)) {
            resultLabel.setText("Invalid Input");
            return;
        }

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);

        if (e.getActionCommand().equals("ADD")) {
            double result = num1 + num2;
            resultLabel.setText(String.valueOf(result));
        } else if (e.getActionCommand().equals("SUBTRACT")) {
            double result = num1 - num2;
            resultLabel.setText(String.valueOf(result));
        } else if (e.getActionCommand().equals("MULTIPLY")) {
            double result = num1 * num2;
            resultLabel.setText(String.valueOf(result));
        } else if (e.getActionCommand().equals("DIVIDE")) {
            if (num2 != 0) {
                double result = num1 / num2;
                resultLabel.setText(String.valueOf(result));
            } else {
                resultLabel.setText("Cannot divide by zero");
            }
        }
    }

    public static void main(String[] args) {
        new perform();
    }
}
