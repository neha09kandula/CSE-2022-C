package frames;
import java.awt.*;
import java.awt.event.*;
public class Regristration_form extends WindowAdapter
{
	Frame f;
	Regristration_form()
	{
	    f = new Frame("Hello Frame");
	    f.addWindowListener(this);
		f.setSize(500, 500);
		f.setBounds(120, 200, 500, 500);
		f.setLayout(null);
		f.setVisible(true);
		Label L = new Label("Name");
		f.add(L);
		L.setSize(130, 130);
		L.setVisible(true);
		L.setBounds(50, 10, 70, 80);
		Label L1 = new Label("Father Name");
		f.add(L1);
		L1.setSize(140, 100);
		L1.setVisible(true);
		L1.setBounds(50,70, 80, 50);
		Label L2 = new Label("Mother Name");
		f.add(L2);
		L2.setSize(140, 100);
		L2.setVisible(true);
		L2.setBounds(50,110, 80, 50);
		Label L3 = new Label("DOB");
		f.add(L3);
		L3.setSize(140, 100);
		L3.setVisible(true);
		L3.setBounds(50,150, 80, 50);
		Label L4 = new Label("Phone Num.");
		f.add(L4);
		L4.setSize(140, 100);
		L4.setVisible(true);
		L4.setBounds(50,190, 80, 50);
		Label L5 = new Label("Adress");
		f.add(L5);
		L5.setSize(140, 100);
		L5.setVisible(true);
		L5.setBounds(50,230, 80, 50);
		Label L6 = new Label("Gender");
		f.add(L6);
		L6.setSize(140, 100);
		L6.setVisible(true);
		L6.setBounds(50,335, 80, 50);
		TextField t1 = new TextField();
		f.add(t1);
		t1.setBounds(150, 30, 150, 30);
		t1.setVisible(true);
		TextField t2 = new TextField();
		f.add(t2);
		t2.setBounds(150, 75, 150, 30);
		t2.setVisible(true);
		TextField t3 = new TextField();
		f.add(t3);
		t3.setBounds(150, 115, 150, 30);
		t3.setVisible(true);
		TextField t4 = new TextField();
		f.add(t4);
		t4.setBounds(150, 155, 150, 30);
		t4.setVisible(true);
		TextField t5 = new TextField();
		f.add(t5);
		t5.setBounds(150, 195, 150, 30);
		t5.setVisible(true);
		TextField t6 = new TextField();
		f.add(t6);
		t6.setBounds(150, 235, 200, 100);
		t6.setVisible(true);
		Checkbox c1 = new Checkbox("F");
		f.add(c1);
		c1.setBounds(150, 350, 30, 30);
		Checkbox c2 = new Checkbox("M");
		f.add(c2);
		c2.setBounds(200, 350, 30, 30);
		Button b = new Button("Submit");
		f.add(b);
		b.setSize(150, 210);
		b.setBounds(350, 370, 120, 60);
		b.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	   {
		  f.dispose(); 
	   }
	public static void main(String args[])
	{
		new Regristration_form();
	}
}
