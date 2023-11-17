package javaprograms;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends WindowAdapter {
    private Frame f;

    public StudentForm() {
        f = new Frame("Student Registration Form");
        f.setSize(800, 600);
        f.setLayout(null);

        Label titleLabel = new Label("STUDENT REGISTRATION FORM");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBounds(200, 30, 400, 30);
        f.add(titleLabel);

        Label nameLabel = new Label("NAME:");
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(50, 60, 150, 30);
        f.add(nameLabel);

        TextField nameTextField = new TextField(30);
        nameTextField.setBounds(200, 60, 300, 30);
        f.add(nameTextField);

        Label fatherLabel = new Label("FATHER NAME:");
        fatherLabel.setForeground(Color.WHITE);
        fatherLabel.setBounds(50, 100, 150, 30);
        f.add(fatherLabel);

        TextField fatherTextField = new TextField(30);
        fatherTextField.setBounds(200, 100, 300, 30);
        f.add(fatherTextField);

        Label motherLabel = new Label("MOTHER NAME:");
        motherLabel.setForeground(Color.WHITE);
        motherLabel.setBounds(50, 140, 150, 30);
        f.add(motherLabel);

        TextField motherTextField = new TextField(30);
        motherTextField.setBounds(200, 140, 300, 30);
        f.add(motherTextField);

        Label phoneLabel = new Label("PHONE NUMBER:");
        phoneLabel.setForeground(Color.WHITE);
        phoneLabel.setBounds(50, 180, 150, 30);
        f.add(phoneLabel);

        TextField phoneTextField = new TextField(30);
        phoneTextField.setBounds(200, 180, 300, 30);
        f.add(phoneTextField);

        Label emailLabel = new Label("EMAIL:");
        emailLabel.setForeground(Color.WHITE);
        emailLabel.setBounds(50, 220, 150, 30);
        f.add(emailLabel);

        TextField emailTextField = new TextField(30);
        emailTextField.setBounds(200, 220, 300, 30);
        f.add(emailTextField);

        Label genderLabel = new Label("GENDER:");
        genderLabel.setForeground(Color.WHITE);
        genderLabel.setBounds(50, 260, 150, 30);
        f.add(genderLabel);

        TextField genderTextField = new TextField(30);
        genderTextField.setBounds(200, 260, 300, 30);
        f.add(genderTextField);

        Label dobLabel = new Label("DOB:");
        dobLabel.setForeground(Color.WHITE);
        dobLabel.setBounds(50, 300, 150, 30);
        f.add(dobLabel);

        TextField dobTextField = new TextField(30);
        dobTextField.setBounds(200, 300, 300, 30);
        f.add(dobTextField);

        Label departmentLabel = new Label("DEPARTMENT:");
        departmentLabel.setForeground(Color.WHITE);
        departmentLabel.setBounds(50, 340, 150, 30);
        f.add(departmentLabel);

        TextField departmentTextField = new TextField(30);
        departmentTextField.setBounds(200, 340, 300, 30);
        f.add(departmentTextField);

        Label yearLabel = new Label("YEAR:");
        yearLabel.setForeground(Color.WHITE);
        yearLabel.setBounds(50, 380, 150, 30);
        f.add(yearLabel);

        TextField yearTextField = new TextField(30);
        yearTextField.setBounds(200, 380, 300, 30);
        f.add(yearTextField);

        Button submitButton = new Button("SUBMIT");
        submitButton.setBounds(50, 480, 100, 30);
        f.add(submitButton);

        Button resetButton = new Button("RESET");
        resetButton.setBounds(160, 480, 100, 30);
        f.add(resetButton);

        f.addWindowListener(this);
        f.setBackground(Color.BLACK);
        f.setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}