package Frames;
import java.awt.*;
import java.awt.event.*;

public class Student extends WindowAdapter {
   private Frame f;
   public Student() {
   f = new Frame("Student Registration Form");
   f.setSize(600, 400);
   f.setLayout(new GridLayout(0, 2, 8, 10));
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
   addLabelAndTextField("AGE:", f);
   Button submitButton = new Button("SUBMIT");
   f.add(submitButton);
   Button resetButton = new Button("RESET");
   f.add(resetButton);
   f.addWindowListener(this);
   f.setBackground(Color.WHITE);
   f.setVisible(true);
}
private void addLabelAndTextField(String labelText, Frame frame) {
    Label label = new Label(labelText);
    label.setForeground(Color.BLACK);
    frame.add(label);
    TextField textField = new TextField(30);
    frame.add(textField);
}
   
public void windowClosing(WindowEvent e) {
    f.dispose();
}

public static void main(String[] args) {
    new Student();
}

}