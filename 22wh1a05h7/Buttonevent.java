package Frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Buttonevent extends WindowAdapter{
		Frame f;
		
	Buttonevent(){
			f=new Frame();
			f.addWindowListener(this);
			f.setLayout(null);
			f.setSize(1400, 1400);
			f.setVisible(true);
			
			Button b=new Button("Yellow");
			b.setBounds(100, 250, 80, 30);
			f.add(b);
			b.addActionListener((ActionListener) this);
			
			Button b1=new Button("Green");
			b1.setBounds(100, 350, 80, 30);
			f.add(b1);
			b1.addActionListener((ActionListener) this);
			
			Button b2=new Button("Pink");
			b2.setBounds(100, 450, 80, 30);
			f.add(b2);
			b2.addActionListener((ActionListener) this);
	}
	
			public void actionperformed(ActionEvent ae)
			{
				String s=ae.getActionCommand();
				if(s.equals("Yellow")) f.setBackground(Color.yellow);
				if(s.equals("Green")) f.setBackground(Color.green);
				if(s.equals("Pink")) f.setBackground(Color.pink);
			}
	
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Buttonevent();
	}

}

