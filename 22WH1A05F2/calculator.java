package cse225f2;
import java.awt.event.*;
import java.awt.*;
public class calculator{
public static class window extends Frame
{
	window()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
		});
		setTitle("Calculator");
		setSize(1200,1600);
		setLayout(null);
		Label l1 = new Label("CALCULATOR");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setBounds(500,75,600,200);
		add(l1);
		Button t1 = new Button("1");
		t1.setBounds(300, 400, 200, 100);
		add(t1);
		Button t2 = new Button("4");
		t2.setBounds(300, 500, 200, 100);
		add(t2);
		Button t3 = new Button("7");
		t3.setBounds(300, 600, 200, 100);
		add(t3);
		Button t4 = new Button("2");
		t4.setBounds(500, 400, 200, 100);
		add(t4);
		Button t5 = new Button("5");
		t5.setBounds(500, 500, 200, 100);
		add(t5);
		Button t6 = new Button("8");
		t6.setBounds(500, 600, 200, 100);
		add(t6);
		Button t7 = new Button("3");
		t7.setBounds(700, 400, 200, 100);
		add(t7);
		Button t8 = new Button("6");
		t8.setBounds(700, 500, 200, 100);
		add(t8);
		Button t9 = new Button("9");
		t9.setBounds(700, 600, 200, 100);
		add(t9);
		Button b1 = new Button("+");
		b1.setBounds(300,700,200,100);
		add(b1);
		Button b2 = new Button("-");
		b2.setBounds(500,700,200,100);
		add(b2);
		Button b3 = new Button("=");
		b3.setBounds(700,700,200,100);
		add(b3);
		TextField T = new TextField();
		T.setBounds(300,300,600,100);
		add(T);
		
		setVisible(true);
	}

	public static void main(String args[]) {
		new window();
	}
}
}