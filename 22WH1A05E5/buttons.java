package csec225e5;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class But2 extends Frame implements ActionListener{
	But2(){
		//creating buttons
		Button b1=new Button("Next");
		Button b2=new Button("Submit");
		
		// creating bounds for the buttons
		b1.setBounds(100, 100, 70, 50);
		b2.setBounds(200,100, 70, 50);
		
		// now after creating the bounds to the buttons you need to add them to your frame
		add(b1);
		add(b2);
		
		// we need to add action listeners to the buttons so that we can implement what happens when a button is clicked
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			// when b1 is clicked it opens a new frame
			Frame f2= new Frame();
			f2.setTitle("PINK");
			f2.setSize(300,300);
			f2.setVisible(true);
			Button b3=new Button("Empty");
			f2.add(b3); //adding the empty button to the frame
			b3.setBounds(200,140,70,40);
			b3.setBackground(Color.PINK);
			
		}
		else
		{
			System.exit(0);
		}
		
		
	}

	public static void main(String[] args) {
		Frame f1=new Frame("First Frame");
		f1.setSize(500,500);
		f1.setLayout(null);
		f1.add(new But2());
		f1.setVisible(true);
	
		}
}
		
