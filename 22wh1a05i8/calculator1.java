package cse225i8;
import java.awt.*; 
import java.awt.event.*;

public class Calculator1  {
	public static  void main(String args[]) 
	{  
		
		Myframe f = new Myframe();
		f.setTitle("Calculator");

		f.setVisible(true);

		f.setSize(600,600);

		f.setBackground(Color.black);
	}
}
		
			
		
		
	
class Myframe extends Frame {
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b1,b2,b3,b4,b5,b6;
	int n1,n2,res;

 Myframe(){
	this.setLayout(null);
	t1=new TextField();
	t1.setBounds(250,50, 300,30);
	t2=new TextField();
	t2.setBounds(250,100, 300,30);
	t3=new TextField();
	t3.setBounds(250,150, 300,30);
	 this.add(t1);
	 this.add(t2);
	 this.add(t3);
	 
	 
	l1=new Label("NUM1");
	l1.setBounds(50,50,100,30);
	l2=new Label("NUM2");
	l2.setBounds(50,100,100,30);
	l3=new Label("RESULT");
	l3.setBounds(50,150,100,30);
	 
    add(l1);
    add(l2);
    add(l3);
    
    b1=new Button("ADD");
	b1.setBounds(200,400,70,30);
	
	b2=new Button("SUB");
	b2.setBounds(280, 400, 70, 30);
	b3=new Button("MUL");
	b3.setBounds(340,400,70,30);
	b4=new Button("DIVIDE");
	b4.setBounds(460, 400, 70, 30);
	b5=new Button("Clear");
	b5.setBounds(520, 400, 70, 30);
	b6=new Button("Submit");
	b6.setBounds(550, 450, 70, 30);
	
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	this.add(b6);
	
	
	
	
    
}
}
