package cse;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
public class calculator extends Frame implements ActionListener

{

	Label l1,l2,l3,l4,l5,l6;

	TextField t1,t2;

	Button b;

	calculator()

	{

		setTitle("Calculator");

		setSize(1800,1600);

		setLayout(null);

		setVisible(true);

		l1 = new Label("Enter first number : ");

		l1.setBounds(200, 100, 500, 30);

		l1.setFont(new Font("Arial",Font.BOLD,30));

		add(l1);

		l2 = new Label("Enter second number : ");

		l2.setBounds(200, 200, 500, 30);

		l2.setFont(new Font("Arial",Font.BOLD,30));

		add(l2);

		l3 = new Label("--");

		l3.setBounds(200, 300, 700, 30);

		l3.setFont(new Font("Arial",Font.BOLD,30));

		add(l3);

		l4 = new Label("--");

		l4.setBounds(200, 400, 700, 30);

		l4.setFont(new Font("Arial",Font.BOLD,30));

		add(l4);

		l5 = new Label("--");

		l5.setBounds(200, 500, 700, 30);

		l5.setFont(new Font("Arial",Font.BOLD,30));

		add(l5);

		l6 = new Label("--");

		l6.setBounds(200, 600, 700, 30);

		l6.setFont(new Font("Arial",Font.BOLD,30));

		add(l6);

		t1 = new TextField();

		t1.setBounds(800, 100, 450, 50);

		add(t1);

		t2 = new TextField();

		t2.setBounds(800, 200,450, 50);

		add(t2);

		b = new Button("Click Me");

		b.setBounds(650, 800, 200, 50);

		


		b.addActionListener(this);

		add(b);

		this.addWindowListener(new WindowAdapter() 

		{

			public void windowClosing(WindowEvent we) 

			{

				System.exit(0);

			}

		});

	}

	public void actionPerformed(ActionEvent e) 

	{

		String s1 = t1.getText();

		String s2 = t2.getText();

		if(s1.isEmpty() || s2.isEmpty()) 

		{

			l3.setText("Please Enter The data");

		}

		else 

		{

			int a = Integer.parseInt(s1);

			int b = Integer.parseInt(s2);

			int c = a+b;

			int d = a-b;

			int p = a*b;

			int f = a/b;

			String sum = String.valueOf(c);

			l3.setText("addition: "+sum);

			String sub = String.valueOf(d);

			l4.setText("subtraction: "+sub);

			String mul = String.valueOf(p);

			l5.setText("multiplication: "+mul);

			String div = String.valueOf(f);

			l6.setText("division: "+div);

		}

	}

	public static void main(String[] args) 

	{

		new calculator();

	}

}