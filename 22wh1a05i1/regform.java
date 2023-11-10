package cse_225i1;
import java.awt.*;
import java.awt.event.*;

class regform extends Frame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button submitButton;
    TextField nameField, fatherNameField, ageField, addressField;
    Label nameLabel, fatherNameLabel, ageLabel, genderLabel, courseLabel, hobbiesLabel, addressLabel, titleLabel;

    regform() {
        setLayout(null);

        titleLabel = new Label("Registration Form");
        submitButton = new Button("submit");
    
        nameLabel = new Label("Name");
        nameField = new TextField();
        fatherNameLabel = new Label("Father Name");
        fatherNameField = new TextField();
        ageLabel = new Label("Age");
        ageField = new TextField();
        genderLabel = new Label("Gender");
        courseLabel = new Label("Course");
        hobbiesLabel = new Label("Hobbies");
        addressLabel = new Label("Address");
        addressField = new TextField();

        titleLabel.setBounds(600, 90, 300, 40);
        submitButton.setBounds(500, 700, 100, 40);       
        nameLabel.setBounds(500, 150, 100, 40);
        nameField.setBounds(700, 150, 300, 40);
        fatherNameLabel.setBounds(500, 200, 100, 40);
        fatherNameField.setBounds(700, 200, 300, 40);
        ageLabel.setBounds(500, 250, 100, 40);
        ageField.setBounds(700, 250, 300, 40);
        genderLabel.setBounds(500, 300, 100, 40);
        courseLabel.setBounds(500, 350, 100, 40);
        hobbiesLabel.setBounds(500, 400, 100, 40);
        addressLabel.setBounds(500, 450, 100, 40);
        addressField.setBounds(700, 450, 300, 100);

        add(submitButton);
        add(nameField);
        add(nameLabel);
        add(fatherNameField);
        add(fatherNameLabel);
        add(ageField);
        add(ageLabel);
        add(addressField);
        add(addressLabel);
        add(genderLabel);
        add(courseLabel);
        add(hobbiesLabel);
        add(titleLabel);

        CheckboxGroup genderGroup = new CheckboxGroup();
        Checkbox femaleCheckbox = new Checkbox("Female", genderGroup, true);
        Checkbox maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox.setBounds(700, 300, 70, 40);
        maleCheckbox.setBounds(900, 300, 70, 40);
        add(femaleCheckbox);
        add(maleCheckbox);

        Checkbox drawingCheckbox = new Checkbox("Drawing", true);
        Checkbox readingCheckbox = new Checkbox("Reading");
        Checkbox dancingCheckbox = new Checkbox("Dancing");
        drawingCheckbox.setBounds(700, 400, 70, 40);
        readingCheckbox.setBounds(800, 400, 70, 40);
        dancingCheckbox.setBounds(900, 400, 70, 40);
        add(drawingCheckbox);
        add(readingCheckbox);
        add(dancingCheckbox);
    }

    public static void main(String[] args) {
        regform form = new regform();
        form.setTitle("Sample Frame");
        form.setSize(1200, 800);
        form.setVisible(true);
        form.addWindowListener(new MyWindowAdapter());
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}
