package csec2022;
import java.awt.*;
import java.awt.event.*;

public class St extends Frame implements ActionListener {
    TextField tfName, tfBranch, tfSection, tfRollNumber,tfYear,tfdob,tfemail;

    St() {
        Button b = new Button("SUBMIT");
        b.setBounds(100, 280, 80, 30);
        b.addActionListener(this);
        add(b);

        Label l1 = new Label("STUDENT NAME");
        l1.setBounds(20, 50, 100, 30);
        add(l1);
        tfName = new TextField();
        tfName.setBounds(150, 50, 150, 20);
        add(tfName);

        Label l2 = new Label("BRANCH NAME");
        l2.setBounds(20, 80, 100, 30);
        add(l2);
        tfBranch = new TextField();
        tfBranch.setBounds(150, 80, 150, 20);
        add(tfBranch);

        Label l3 = new Label("SECTION");
        l3.setBounds(20, 110, 100, 30);
        add(l3);
        tfSection = new TextField();
        tfSection.setBounds(150, 110, 150, 20);
        add(tfSection);

        Label l4 = new Label("ROLL NUMBER");
        l4.setBounds(20, 140, 100, 30);
        add(l4);
        tfRollNumber = new TextField();
        tfRollNumber.setBounds(150, 140, 150, 20);
        add(tfRollNumber);
        
        
        
        
        
        
        Label l6 = new Label("YEAR");
        l6.setBounds(20, 170, 80, 30);
        add(l6);
        tfYear = new TextField();
        tfYear.setBounds(150, 170, 150, 20);
        add(tfYear);

        setSize(300, 300);  // Adjusted the size
        setLayout(null);
        setVisible(true);
        Label l7 = new Label("DOB");
        l7.setBounds(20, 200, 80, 30);
        add(l7);
        tfYear = new TextField();
        tfYear.setBounds(150, 200, 150, 20);
        add(tfYear);

        setSize(300, 300);  // Adjusted the size
        setLayout(null);
        setVisible(true);
        
        
        Label l8 = new Label("EMAIL ADDRESS");
        l8.setBounds(20, 230, 100, 30);
        add(l8);
        tfemail = new TextField();
        tfemail.setBounds(150, 230, 150, 20);
        add(tfemail);

        setSize(300, 300);  // Adjusted the size
        setLayout(null);
        setVisible(true);
        

        // Adding a WindowListener to handle window closing
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();  // Close the window
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        // Handle the submit button action if needed
        
    }

    public static void main(String[] args) {
        new St();
    }
}

