package Frames;

import java.awt.*;
import java.awt.event.*;

public class MyForm extends WindowAdapter {

    private Frame f;
    public MyForm() {

        f = new Frame("Student Registration Form");
        f.setSize(600, 400);
        f.setLayout(new GridLayout(0,2,3,5)); 
        Label titleLabel = new Label("STUDENT REGISTRATION FORM");
        titleLabel.setForeground(Color.WHITE);
        f.add(titleLabel);
        f.add(new Label()); 
        addLabelAndTextField("NAME:", f);
        addLabelAndTextField("FATHER NAME:", f);
        addLabelAndTextField("MOTHER NAME:", f);
        addLabelAndTextField("PHONE NUMBER:", f);
        addLabelAndTextField("EMAIL:", f);
        addLabelAndTextField("GENDER:", f);
        addLabelAndTextField("DOB:", f);
        addLabelAndTextField("DEPARTMENT:", f);
        addLabelAndTextField("YEAR:", f);
        Button S = new Button("SUBMIT");
        f.add(S);
        Button R = new Button("RESET");
        f.add(R);
        f.addWindowListener(this);
        f.setBackground(Color.darkGray);
        f.setVisible(true);
    }
    private void addLabelAndTextField(String labelText, Frame frame) {
        Label l = new Label(labelText);
        l.setForeground(Color.WHITE);
        frame.add(l);
        TextField t = new TextField(30);
        frame.add(t);
    }
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }
    public static void main(String[] args) {
        new MyForm();
    }
}