package javalab;
import java.awt.*;
import java.awt.event.*;
public class Calculator_awt  extends Frame {
	TextField tf;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,submit,a1,a2,a3,a4,a5;
	public  Calculator_awt() {
		setSize(500,500);
		setVisible(true);
		setLayout(null);
		submit=new Button("enter");
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		a1=new Button("+");
		a2=new Button("-");
		a3=new Button("*");
		a4=new Button("/");
		a5=new Button("%");
		b10=new Button("0");
		submit.setBounds(100,50,70,30);
		b1.setBounds(100,100,50,50);
		b2.setBounds(150,100,50,50);
		b3.setBounds(200,100,50,50);
		b4.setBounds(100,150,50,50);
		b5.setBounds(150,150,50,50);
		b6.setBounds(200,150,50,50);
		b7.setBounds(100,200,50,50);
		b8.setBounds(150,200,50,50);
		b9.setBounds(200,200,50,50);
		b10.setBounds(250,100,50,50);
		a1.setBounds(250,150,50,50);
		a2.setBounds(250,200,50,50);
		a3.setBounds(300,100,50,50);
		a4.setBounds(300,150,50,50);
		a5.setBounds(300,200,50,50);
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			dispose();
			
		}
		});
		add(submit);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(a1);
		add(a2);
		add(a3);
        add(a4);
		add(a5);
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub

			new   Calculator_awt();

	}



}

