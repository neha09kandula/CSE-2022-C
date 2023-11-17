package Frames;
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}

public class  Calculator {

	Button sumButton,diffButton,mulButton,divButton,eqButton;
    TextField Num1Field, Num2Field,ResultField;
    Label Num1Label,Num2Label;
    

    
Calculator()
{

    Label TitleLabel = new Label("Calculator");
    Button ResultButton = new Button("Result");
    
    new Label("Num1");
	new TextField();
    
    new Label("Num2");
	new TextField();
	
	Frame f=new Frame("Calculator");
	f.setSize(120,100);
	f.setBounds(500,600,100,40);
	f.setLayout(null); 
	f.setVisible(true);
	
	Button sumButton=new Button("+");
	Button diffButton=new Button("-");
	Button mulButton=new Button("*");
	Button divButton=new Button("/");
	Button eqButton=new Button("=");
  
    TitleLabel.setBounds(700, 90, 300, 40);
    ResultButton.setBounds(600, 700, 100, 40);  
    
    
    
    
    Button aButton = new Button("1");
    Button bButton = new Button("2");
    Button cButton = new Button("3");
    Button dButton = new Button("4");
    Button eButton = new Button("5");
    Button fButton = new Button("6");
    Button gButton = new Button("7");
    Button hButton = new Button("8");
    Button iButton = new Button("9");
    Button jButton = new Button("0");
    
    
    
    aButton.setBounds(100,100,100,100);
    bButton.setBounds(200,100,100,100);
    cButton.setBounds(300,100,100,100);
    dButton.setBounds(100,200,100,100);
    eButton.setBounds(200,200,100,100);
    fButton.setBounds(300,200,100,100);
    gButton.setBounds(100,300,100,100);
    hButton.setBounds(200,300,100,100);
    iButton.setBounds(300,300,100,100);
    jButton.setBounds(100,400,100,100);
    sumButton.setBounds(200, 400, 100, 100);
    diffButton.setBounds(300, 400, 100, 100);
    mulButton.setBounds(100, 500, 100, 100);
    divButton.setBounds(200, 500, 100, 100);
    eqButton.setBounds(300, 500, 100, 100);
  
    
    f.add(sumButton);
    f.add(diffButton);
    f.add(mulButton);
    f.add(divButton);
    f.add(eqButton);
	f.add(aButton); 
	f.add(bButton);
	f.add(cButton);
	f.add(dButton);
	f.add(eButton);
	f.add(fButton);
	f.add(gButton);
	f.add(hButton);
	f.add(iButton);
	f.add(jButton);
	
	TextField numField = new TextField();
	f.add(numField);
	numField.setBounds(100,50,300,50);

	
}

public static void main(String args[]) {
	new Calculator();
	
	}

}