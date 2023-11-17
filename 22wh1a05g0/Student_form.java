package Frames5G0;
import java.awt.event.*;
import java.awt.*;


public class Student_form extends Frame{
	Student_form(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
				});
		setTitle("student");
		setSize(1800,1800);
		setLayout(null);
		Label titleLabel=new Label("student Registration form");
		titleLabel.setFont(new Font("Arial",Font.BOLD,20));
		titleLabel.setBounds(350,100,500,100);
		add(titleLabel);
		Label l = new Label("NAME");
		l.setBounds(80, 200, 100, 30);
		add(l);
		TextField t = new TextField();
		t.setBounds(190, 200, 200, 30);
		add(t);
		Label l1 = new Label("DEPT");
		l1.setBounds(80, 300, 100, 30);
		add(l1);
		TextField t1 = new TextField();
		t1.setBounds(190, 300, 200, 30);
		add(t1);
		Label l2 = new Label("Rollno");
		l2.setBounds(80, 400, 100, 30);
		add(l2);
		TextField t2 = new TextField();
		t2.setBounds(190, 400, 200, 30);
		add(t2);
		Label l3 = new Label("Contact No");
		l3.setBounds(80, 500, 100, 30);
		add(l3);
		TextField t3 = new TextField();
		t3.setBounds(190, 500, 200, 30);
		add(t3);
		Button b = new Button("Submit");
		b.setBounds(100, 600, 50, 50);
		add(b);
		Button b1 = new Button("Reset");
		b1.setBounds(200, 600, 50, 50);
		add(b1);
		
		
		setVisible(true);
	}
	
	
	public static void main(String args[]) {
		new Student_form();
	}
}
