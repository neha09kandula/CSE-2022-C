package cse2022;
import java.awt.*;
import java.awt.event.*;
public class add extends Frame {
    TextField enterField, field2;
    Button aButton;
    Label l1;
    public add() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);
        Label enterLabel = new Label("Enter A value");
        Label Label2 = new Label("Enter B value");
        enterField = new TextField();
        field2 = new TextField();
    
        aButton = new Button("click here");

        aButton.setBackground(Color.pink);

        
        enterLabel.setBounds(50,55,80,20);
        enterField.setBounds(150, 50, 160, 30);
        Label2.setBounds(50,85,80,20);
        field2.setBounds(150, 80, 160, 30);
        aButton.setBounds(180, 160, 90, 50);


        add(enterLabel);
        add(enterField);
        add(Label2);
        add(field2);
        add(aButton);
      l1 = new Label("");
      l1.setBounds(100, 120, 85, 20);

      add(l1);
        aButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int i = Integer.parseInt(enterField.getText());
            	int j = Integer.parseInt(field2.getText());
            	int c = i + j;
            	String result = String.valueOf(c);
            	l1.setText("Total :"+result);
                       	
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
		new add();
		// TODO Auto-generated method stub

	}

}


