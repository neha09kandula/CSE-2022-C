package cse_5j2;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class calci  extends WindowAdapter implements ActionListener{
	
	Button b1;
	TextField t1,t2;
	Label l1,l2,s;
	Frame f;
	calci(){
		f=new Frame();
		b1=new Button("SUM");
		t1=new TextField();
		t2=new TextField();
		l1=new Label("enter num1");
		l2=new Label("enter 2nd num");
		s=new Label("SUM:");
		
		t1.setBounds(200, 100, 90, 80);
		t2.setBounds(200, 180, 90, 80);
		l1.setBounds(70, 100, 50, 50);
		l2.setBounds(70, 180, 50, 50);
		s.setBounds(100, 250, 120, 80);
		b1.setBounds(100, 380, 120, 90);
		
		f.add(l1);
		f.add(l2);
		f.add(s);
		f.add(t1);
		f.add(t2);
		
		b1.addActionListener(this);
		f.add(b1);
		f.setLayout(null);
		f.setSize(500, 500);
		f.setVisible(true);
	
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
			
	
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int n=n1+n2;
		s.setText(String.valueOf("Answer: "+n));
		
	}
	
	

	public static void main(String args[]) {

		new calci();
	}
}
