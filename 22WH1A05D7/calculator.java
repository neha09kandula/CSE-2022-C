package cse225d7;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class calculator extends Frame {
    TextField enterField ;
    Button submitButton,stopButton,aButton,bButton,cButton,dButton,eButton,fButton,gButton,hButton,iButton,jButton,kButton,lButton,mButton,nButton;

    public calculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);
        Label enterLabel = new Label("Enter");
        
        enterField = new TextField();
        submitButton = new Button(".");
        stopButton = new Button("=");
        aButton = new Button("7");
        bButton = new Button("8");
        cButton = new Button("9");
        dButton = new Button("%");
        eButton = new Button("4");
        fButton = new Button("5");
        gButton = new Button("6");
        hButton = new Button("*");
        iButton = new Button("1");
        jButton = new Button("2");
        kButton = new Button("3");
        lButton = new Button("+");
        mButton = new Button("0");
        nButton = new Button("/");
        aButton.setBackground(Color.pink);
        bButton.setBackground(Color.pink);
        cButton.setBackground(Color.pink);
        dButton.setBackground(Color.lightGray);
        eButton.setBackground(Color.pink);
        fButton.setBackground(Color.pink);
        gButton.setBackground(Color.pink);
        hButton.setBackground(Color.lightGray);
        iButton.setBackground(Color.pink);
        jButton.setBackground(Color.pink);
        kButton.setBackground(Color.pink);
        lButton.setBackground(Color.lightGray);
        mButton.setBackground(Color.pink);
        nButton.setBackground(Color.lightGray);
        enterLabel.setBounds(50,50,80,20);
        submitButton.setBackground(Color.lightGray);
        stopButton.setBackground(Color.lightGray);
        
        enterField.setBounds(50, 70, 160, 30);
        
        aButton.setBounds(50, 100, 40, 30);
        bButton.setBounds(90, 100, 40, 30);
        cButton.setBounds(130, 100, 40, 30);
        dButton.setBounds(170, 100, 40, 30);
        eButton.setBounds(50, 130, 40, 30);
        fButton.setBounds(90, 130, 40, 30);
        gButton.setBounds(130, 130, 40, 30);
        hButton.setBounds(170, 130, 40, 30);
        iButton.setBounds(50, 160, 40, 30);
        jButton.setBounds(90, 160, 40, 30);
        kButton.setBounds(130, 160, 40, 30);
        lButton.setBounds(170, 160, 40, 30);
        mButton.setBounds(50, 190, 40, 30);
        nButton.setBounds(90, 190, 40, 30);
        submitButton.setBounds(130, 190, 40, 30);
        stopButton.setBounds(170, 190, 40, 30);

        
        add(enterLabel);	
        add(enterField);
        add(submitButton);
        add(stopButton);
        add(aButton);
        add(bButton);
        add(cButton);
        add(dButton);
        add(eButton);
        add(fButton);
        add(gButton);
        add(hButton);
        add(iButton);
        add(jButton);
        add(kButton);
        add(lButton);
        add(mButton);
        add(nButton);
        
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
        new calculator();
    }
}
