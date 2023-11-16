import java.awt.*;
import java.awt.event.*;

public class ExampleWindow extends WindowAdapter implements ActionListener {
    private Frame f;
    private Panel mainPanel;
    private TextField[] textFields;
    private Label[] labels;

    public ExampleWindow() {
        f = new Frame("Student Registration Form");
        f.setSize(800, 600);
        f.setLayout(new BorderLayout());

        mainPanel = new Panel();
        mainPanel.setLayout(null);

        Label titleLabel = new Label("STUDENT REGISTRATION FORM");
        titleLabel.setBounds(250, 30, 300, 30);
        titleLabel.setBackground(new Color(100, 149, 237));
        titleLabel.setForeground(Color.BLACK);
        mainPanel.add(titleLabel);

        textFields = new TextField[9];
        labels = new Label[9];

        addLabeledTextField("NAME:", 50, 100, 0, new Color(240, 248, 255)); 
        addLabeledTextField("FATHER NAME:", 50, 150, 1, new Color(240, 248, 255));
        addLabeledTextField("MOTHER NAME:", 50, 200, 2, new Color(240, 248, 255));
        addLabeledTextField("PHONE NUMBER:", 50, 250, 3, new Color(240, 248, 255));
        addLabeledTextField("EMAIL:", 50, 300, 4, new Color(240, 248, 255));
        addLabeledTextField("GENDER:", 50, 350, 5, new Color(240, 248, 255));
        addLabeledTextField("DOB:", 50, 400, 6, new Color(240, 248, 255));
        addLabeledTextField("DEPARTMENT:", 50, 450, 7, new Color(240, 248, 255));
        addLabeledTextField("COURSE:", 50, 500, 8, new Color(240, 248, 255));

        Button submitButton = new Button("SUBMIT");
        submitButton.setBounds(50, 550, 100, 30);
        submitButton.addActionListener(this);
        mainPanel.add(submitButton);

        Button resetButton = new Button("RESET");
        resetButton.setBounds(160, 550, 100, 30);
        resetButton.addActionListener(this);
        mainPanel.add(resetButton);

        f.add(mainPanel, BorderLayout.CENTER);
        f.addWindowListener(this);
        f.setBackground(new Color(245, 245, 245));
        f.setVisible(true);
    }

    private void addLabeledTextField(String labelText, int x, int y, int index, Color backgroundColor) {
        labels[index] = new Label(labelText);
        labels[index].setBounds(x, y, 150, 30);
        labels[index].setBackground(backgroundColor);
        labels[index].setForeground(Color.BLACK);
        mainPanel.add(labels[index]);

        textFields[index] = new TextField();
        textFields[index].setBounds(x + 150, y, 200, 30);
        mainPanel.add(textFields[index]);
    }

    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("SUBMIT")) {
            for (int i = 0; i < textFields.length; i++) {
                System.out.println(labels[i].getText() + ": " + textFields[i].getText());
            }
        } else if (e.getActionCommand().equals("RESET")) {
            for (TextField textField : textFields) {
                if (textField != null) {
                    textField.setText("");
                }
            }
        }
    }

    public static void main(String[] args) {
        new ExampleWindow();
    }
}
