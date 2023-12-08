package cse2022;
import java.awt.*;
import java.awt.event.*;
public class calculator extends Frame {
    TextField enterField, field2,field3 ;
    Button aButton,bButton,cButton,dButton;
    public calculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);
        Label enterLabel = new Label("Enter A value");
        Label Label2 = new Label("Enter B value");
        Label Label3 = new Label("result");
        enterField = new TextField();
        field2 = new TextField();
        field3 = new TextField();
        aButton = new Button("+");
        bButton = new Button("-");
        cButton = new Button("*");
        dButton = new Button("/");
        aButton.setBackground(Color.pink);
        bButton.setBackground(Color.pink);
        cButton.setBackground(Color.pink);
        dButton.setBackground(Color.lightGray);
        
        enterLabel.setBounds(50,55,80,20);
        enterField.setBounds(150, 50, 160, 30);
        Label2.setBounds(50,85,80,20);
        field2.setBounds(150, 80, 160, 30);
        field3.setBounds(150, 110, 160, 30);
        Label3.setBounds(50,115,80,20);
        aButton.setBounds(70, 160, 40, 30);
        bButton.setBounds(110, 160, 40, 30);
        cButton.setBounds(150, 160, 40, 30);
        dButton.setBounds(190, 160, 40, 30);

        add(enterLabel);
        add(enterField);
        add(Label2);
        add(field2);
        add(Label3);
        add(field3);
        add(aButton);
        add(bButton);
        add(cButton);
        add(dButton);
        aButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int i = Integer.parseInt(enterField.getText());
            	int j = Integer.parseInt(field2.getText());
            	field3.setText(String.valueOf(i+j));           	
            }
        });
        bButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int i = Integer.parseInt(enterField.getText());
            	int j = Integer.parseInt(field2.getText());
            	field3.setText(String.valueOf(i-j));
            	
            }
        });
        cButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int i = Integer.parseInt(enterField.getText());
            	int j = Integer.parseInt(field2.getText());
            	field3.setText(String.valueOf(i*j));           	
            }
        });
        dButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int i = Integer.parseInt(enterField.getText());
            	int j = Integer.parseInt(field2.getText());
            	field3.setText(String.valueOf(i/j));
            	
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
		new calculator();
		// TODO Auto-generated method stub

	}

}
