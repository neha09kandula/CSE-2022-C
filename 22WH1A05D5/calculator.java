package frames;
import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame {
    TextField enterField ;
    Button aButton,bButton,cButton,dButton,eButton,fButton,gButton,hButton,iButton,jButton,kButton,lButton,mButton,nButton,oButton,pButton,qButton,rButton,sButton,tButton,uButton;

    public calculator() {
        setTitle("Calculator");
        setSize(400, 400);
        setLayout(null);
        Label enterLabel = new Label("Enter");
        
        enterField = new TextField();
        aButton = new Button("7");
        bButton = new Button("8");
        cButton = new Button("9");
        dButton = new Button("DEL");
        eButton = new Button("AC");
        fButton = new Button("4");
        gButton = new Button("5");
        hButton = new Button("6");
        iButton = new Button("*");
        jButton = new Button("/");
        kButton = new Button("1");
        lButton = new Button("2");
        mButton = new Button("3");
        nButton = new Button("+");
        oButton = new Button("-");
        pButton = new Button("0");
        qButton = new Button(".");
        rButton = new Button("*10^x");
        sButton = new Button("ANS");
        tButton = new Button("=");
        
        enterLabel.setBounds(50,30,80,20);
        
        enterField.setBounds(50, 50, 190, 30);
        
        aButton.setBounds(50, 100, 30, 30);
        bButton.setBounds(90, 100, 30, 30);
        cButton.setBounds(130, 100, 30, 30);
        dButton.setBounds(170, 100, 30, 30);
        eButton.setBounds(210, 100, 30, 30);
        fButton.setBounds(50, 130, 30, 30);
        gButton.setBounds(90, 130, 30, 30);
        hButton.setBounds(130, 130, 30, 30);
        iButton.setBounds(170, 130, 30, 30);
        jButton.setBounds(210, 130, 30, 30);
        kButton.setBounds(50, 160, 30, 30);
        lButton.setBounds(90, 160, 30, 30);
        mButton.setBounds(130, 160, 30, 30);
        nButton.setBounds(170, 160, 30, 30);
        oButton.setBounds(210, 160, 30, 30);
        pButton.setBounds(50, 190, 30, 30);
        qButton.setBounds(90, 190, 30, 30);
        rButton.setBounds(130, 190, 30, 30);
        sButton.setBounds(170, 190, 30, 30);
        tButton.setBounds(210, 190, 30, 30);
        
        aButton.setBackground(Color.LIGHT_GRAY);
        bButton.setBackground(Color.LIGHT_GRAY);
        cButton.setBackground(Color.LIGHT_GRAY);        
        dButton.setBackground(Color.pink);
        eButton.setBackground(Color.pink);
        fButton.setBackground(Color.LIGHT_GRAY);
        gButton.setBackground(Color.LIGHT_GRAY);
        hButton.setBackground(Color.LIGHT_GRAY);
        iButton.setBackground(Color.pink);       
        jButton.setBackground(Color.pink);
        kButton.setBackground(Color.LIGHT_GRAY);
        lButton.setBackground(Color.LIGHT_GRAY);
        mButton.setBackground(Color.LIGHT_GRAY);
        nButton.setBackground(Color.pink);
        oButton.setBackground(Color.pink);
        pButton.setBackground(Color.LIGHT_GRAY);
        qButton.setBackground(Color.LIGHT_GRAY);
        rButton.setBackground(Color.LIGHT_GRAY);
        sButton.setBackground(Color.pink);
        tButton.setBackground(Color.pink);       
   
        add(enterLabel);	
        add(enterField);
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
        add(oButton);
        add(pButton);
        add(qButton);
        add(rButton);
        add(sButton);
        add(tButton);
        
        tButton.addActionListener(new ActionListener() {
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
