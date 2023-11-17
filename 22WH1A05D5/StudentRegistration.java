package frames;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends Frame {
    TextField nameField, emailField,ageField,yearField,branchField;
    Button submitButton,stopButton;

    public StudentRegistration() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setLayout(null);
        Label nameLabel = new Label("Name");
        Label emailLabel = new Label("email");
        Label ageLabel = new Label("age");
        Label yearLabel = new Label("year");
        Label branchLabel = new Label("branch");
        
        nameField = new TextField();
        emailField = new TextField();
        ageField= new TextField();
        yearField = new TextField();
        branchField = new TextField();
        submitButton = new Button("Submit");
        stopButton = new Button("Stop");
        
        nameLabel.setBounds(50,30,80,20);
        emailLabel.setBounds(50,80,80,20);
        ageLabel.setBounds(50,130,80,20);
        yearLabel.setBounds(50,180,80,20);
        branchLabel.setBounds(50,230,80,20);
        
        nameField.setBounds(50, 50, 200, 30);
        emailField.setBounds(50, 100, 200, 30);
        ageField.setBounds(50, 150, 200, 30);
        yearField.setBounds(50, 200, 200, 30);
        branchField.setBounds(50, 250, 200, 30);
        submitButton.setBounds(50, 300, 200, 30);
        stopButton.setBounds(50, 340, 200, 30);
        
        add(nameLabel);
        add(emailLabel);
        add(ageLabel);
        add(yearLabel);
        add(branchLabel);		
        add(nameField);
        add(emailField);
        add(ageField);
        add(yearField);
        add(branchField);
        add(submitButton);
        add(stopButton);
        
        submitButton.addActionListener(new ActionListener() {
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
        new StudentRegistration();
    }
}
