package CSE225d8;
import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame {
    TextField enterField ;
    Button AddButton,MulButton,aButton,bButton,cButton,dButton,eButton,fButton,gButton,hButton,iButton,jButton,kButton;

    public calculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);
        Label enterLabel = new Label("Enter");
        
        enterField = new TextField();
        AddButton = new Button("Add");
        MulButton = new Button("Mul");
        aButton = new Button("1");
        bButton = new Button("2");
        cButton = new Button("3");
        dButton = new Button("4");
        eButton = new Button("5");
        fButton = new Button("6");
        gButton = new Button("7");
        hButton = new Button("8");
        iButton = new Button("9");
        jButton = new Button("0");
        kButton = new Button("=");
        
        
        enterLabel.setBounds(50,30,80,20);
        
        enterField.setBounds(50, 50, 150, 30);
        
        aButton.setBounds(50, 100, 30, 30);
        bButton.setBounds(90, 100, 30, 30);
        cButton.setBounds(130, 100, 30, 30);
        dButton.setBounds(170, 100, 30, 30);
        eButton.setBounds(50, 130, 30, 30);
        fButton.setBounds(90, 130, 30, 30);
        gButton.setBounds(130, 130, 30, 30);
        hButton.setBounds(170, 130, 30, 30);
        iButton.setBounds(50, 160, 30, 30);
        jButton.setBounds(90, 160, 30, 30);
        kButton.setBounds(130, 160, 70, 30);
        
        AddButton.setBounds(50, 220, 80, 30);
        MulButton.setBounds(130, 220, 80, 30);
        
        
        add(enterLabel);	
        add(enterField);
        add(AddButton);
        add(MulButton);
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
        
        
        AddButton.addActionListener(new ActionListener() {
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
 
