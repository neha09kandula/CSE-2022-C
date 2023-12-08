package frames;
import java.awt.*;
import java.awt.event.*;
public class basiccalculator extends WindowAdapter {
	Frame f;
	public basiccalculator()
	{
		f = new Frame("basic calculator");
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		Label l1 = new Label("number1:");
		f.add(l1);
		l1.setSize(50,50);                                                                         
		l1.setBounds(30,50,70,50);
		l1.setVisible(true);
		
	
		Label l2 = new Label("number2:");
		f.add(l2);
		l2.setSize(50,50);
		l2.setBounds(30,100,70,50);
		l2.setVisible(true);
		
		Label l3 = new Label("result:");
		f.add(l3);
		l3.setSize(50,50);
		l3.setBounds(30,200,70,50);
		l3.setVisible(true);
		
		TextField t1 = new TextField();
		f.add(t1);
		t1.setSize(50,50);
		t1.setBounds(110,65,100,20);
		t1.setVisible(true);
		
		TextField t2 = new TextField();
		f.add(t2);
		t2.setSize(50,50);
		t2.setBounds(110,115,100,20);
		t2.setVisible(true);
		
		TextField t3 = new TextField();
		f.add(t3);
		t3.setSize(50,50);
		t3.setBounds(110,217,100,20);
		t3.setVisible(true);
		
		Button b1 = new Button("ADD");
		f.add(b1);
		b1.setSize(50,50);
		b1.setBounds(30,150,50,50);
		b1.setVisible(true);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s1 = t1.getText();
				String s2 = t2.getText();
				if(s1.isEmpty()||s2.isEmpty()) {
					t3.setText("please enter the data");
				}
				else {
					int a = Integer.parseInt(s1);
					int b = Integer.parseInt(s2);
					int c = a+b;
					String result = String.valueOf(c);
					t3.setText(result);
				}
			}
		});
		
		
		Button b2 = new Button("SUB");
		f.add(b2);
		b2.setSize(50,50);
		b2.setBounds(100,150,50,50);
		b2.setVisible(true);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s1 = t1.getText();
				String s2 = t2.getText();
				if(s1.isEmpty()||s2.isEmpty()) {
					t3.setText("please enter the data");
				}
				else {
					int a = Integer.parseInt(s1);
					int b = Integer.parseInt(s2);
					int c = a-b;
					String result = String.valueOf(c);
					t3.setText(result);
				}
			}
		});
		
		Button b3 = new Button("MUL");
		f.add(b3);
		b3.setSize(50,50);
		b3.setBounds(170,150,50,50);
		b3.setVisible(true);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s1 = t1.getText();
				String s2 = t2.getText();
				if(s1.isEmpty()||s2.isEmpty()) {
					t3.setText("please enter the data");
				}
				else {
					int a = Integer.parseInt(s1);
					int b = Integer.parseInt(s2);
					int c = a*b;
					String result = String.valueOf(c);
					t3.setText(result);
				}
			}
		});
		
		Button b4 = new Button("DIV");
		f.add(b4);
		b4.setSize(50,50);
		b4.setBounds(240,150,50,50);
		b4.setVisible(true);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String s1 = t1.getText();
				String s2 = t2.getText();
				if(s1.isEmpty()||s2.isEmpty()) {
					t3.setText("please enter the data");
				}
				else {
					int a = Integer.parseInt(s1);
					int b = Integer.parseInt(s2);
					int c = a/b;
					String result = String.valueOf(c);
					t3.setText(result);
				}
			}
		});
		
	
		
		
	 
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		
		});
		
	}	
	public static void main(String[]args)
	{
		new basiccalculator();
	}
	
}
