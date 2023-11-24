package packegef5;
import java.awt.*;
import java.awt.event.*;

public class calc  extends Frame {
	TextField tf;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	public calc() {
		setSize(450,600);
		setVisible(true);
		setLayout(null);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("+");
		b11=new Button("-");
		b12=new Button("*");
		b13=new Button("%");
		b14=new Button("/");
		b15=new Button("0");


	
	
		b1.setBounds(100,100,50,50);
		b2.setBounds(150,100,50,50);
		b3.setBounds(200,100,50,50);
		b4.setBounds(100,150,50,50);
		b5.setBounds(150,150,50,50);
		b6.setBounds(200,150,50,50);
		b7.setBounds(100,200,50,50);
		b8.setBounds(150,200,50,50);
		b9.setBounds(200,200,50,50);
		b10.setBounds(100,250,50,50);
		b11.setBounds(150,250,50,50);
		b12.setBounds(200,250,50,50);
		b13.setBounds(100,300,50,50);
		b14.setBounds(150,300,50,50);
		b15.setBounds(200,300,50,50);
		addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			dispose();
		}
		});
		
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
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new  calc();
	}

}
