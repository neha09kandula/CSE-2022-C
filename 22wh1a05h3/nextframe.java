package labprograms;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
public class nextframe extends WindowAdapter implements ActionListener{
	Frame f;
	Frame f1;
	public nextframe() {
		f = new Frame("first frame");
		f.setSize(500,500);
		f.setBounds(30,60,800,600);
		f.setVisible(true);
		f.setLayout(null);
		f.addWindowListener(this);
		Button b1 =  new Button("exit");
		f.add(b1);
		b1.setSize(50,50);
		b1.setBounds(300,150,60,60);
		b1.setVisible(true);
		b1.addActionListener(this);
		Button b2 =  new Button("next");
		f.add(b2);
		b2.setSize(50,50);
		b2.setBounds(400,150,60,60);
		b2.setVisible(true);
		b2.addActionListener(this);
		
	}
		public void windowClosing(WindowEvent e) {
	        f.dispose();
	    }
		
		 public void actionPerformed(ActionEvent e) {
		        if (e.getActionCommand().equals("exit")) {
		            f.dispose();
		        } else if (e.getActionCommand().equals("next")) {
		            nextframe();
		        }
		    }
		private void nextframe()  {
			f.dispose();
			f1 = new Frame("second frame");
			f1.setSize(500,500);
			f1.setBounds(30,60,800,600);
			f1.setLayout(null);
			f1.setVisible(true);
			Label l = new Label("this is the last frame");
			f1.add(l);
			l.setSize(00,100);
			l.setBounds(300,300,200,30);
			l.setVisible(true);
			f1.addWindowListener(this);
			f1.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                f1.dispose();
	            }
	        });
			
		}
		
		
		
		public static void main(String[]args) {
			new nextframe();
		
	}

}
