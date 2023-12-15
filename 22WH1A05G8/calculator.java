package frames;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class calculator extends WindowAdapter implements ActionListener {
	Frame f;
	Button b1;
	TextField t1,t2;
	Label l1,l2,l3;
	calculator(){
		f= new Frame("Hello calculator!!!...");
		f.setSize(500,500);
		f.setLayout(null);
		f.addWindowListener(this);
		f.setVisible(true);
		t1 = new TextField(" ");
		t1.setBounds(140, 200, 200, 20);
        f.add(t1);
        l1 = new Label("first value:");
        l1.setBounds(60, 200, 200, 20);
        f.add(l1);
        l2= new Label("Second valie:");
        l2.setBounds(80,230,60,20);
        f.add(l2);
        t2 = new TextField(" ");
        t2.setBounds(140,230,200,20);
        f.add(t2);
        l3= new Label();
        l3.setBounds(100,230,60,20);
        f.add(l3);
        b1 = new Button("Click me");
        f.add(b1);
        b1.setBounds(150, 150, 100, 30);
        b1.addActionListener(this);
        
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			String s1=t1.getText();
			String s2=t2.getText();
			if(s1.isEmpty() || s2.isEmpty()) {
				l3.setText("Plese enter the data");
			}
			else
			{
				int a=Integer.parseInt(s1);
				int b= Integer.parseInt(s2);
				int c=a+b;
				String result=String.valueOf(c);
				l3.setText("Total:"+ result);
			}
		}
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	public static void main(String[] args) {
		new calculator();
	}
}
