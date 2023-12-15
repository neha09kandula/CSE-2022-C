package cse225d2;
import java.awt.*;
import java.awt.event.*;

public class frame extends Frame implements ActionListener {

	Button b1,b2;
	frame(){
		setLayout(null);
		b1 = new Button("Next");
		b2 = new Button("Submit");
		
		b1.setBounds(100, 100, 70, 40);
		b2.setBounds(200, 100, 70, 40);


		add(b1);
		add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);
	      }
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== b1)
		{
			frame f2 = new frame();
			f2.setSize(400,400);	
			f2.setVisible(true);	
			f2.setTitle("Second Frame");	
			Button b3 = new Button("Empty Button");	
			f2.add(b3);	
			b3.setBounds(200, 200, 200, 200);	
			b3.setBackground(Color.ORANGE);
			/*Button b3 = new Button("Exit");
			b3.setBounds(200,100,70,40);
			f2.add(b3);*/
		}
	else {
		System.exit(0);
	}
	}
	public static void main(String[] args) {
		frame f1 = new frame();
		f1.setSize(500,500);
		f1.setTitle("First Frame");
		f1.setVisible(true);
	}

	}


