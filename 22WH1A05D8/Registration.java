package Frame;
import java.awt.*;
import java.awt.event.*;

public class Registration extends Frame {
    Registration() {
        setTitle("Student Registration Form");
        setSize(400, 300);
        setLayout(null);

        Label nameLabel = new Label("Name:");
        add(nameLabel);
        nameLabel.setBounds(50, 50, 80, 20);

        TextField nameTextField = new TextField();
        add(nameTextField);
        nameTextField.setBounds(150, 50, 150, 20);

        Label ageLabel = new Label("Age:");
        add(ageLabel);
        ageLabel.setBounds(50, 80, 80, 20);

        TextField ageTextField = new TextField();
        add(ageTextField);
        ageTextField.setBounds(150, 80, 50, 20);

        Button submitButton = new Button("Submit");
        add(submitButton);
        submitButton.setBounds(100, 120, 80, 30);

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
        new  Registration();
    }
}
