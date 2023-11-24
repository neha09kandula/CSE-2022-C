package newpro;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Buttonevent extends WindowAdapter{
	Frame f= new Frame("Hello Frame"); 
		
	Buttonevent() {
		f.setSize(1080,1080);
		f.setLayout(null);
		f.setVisible(true);
		Button b1=new Button("Blue");
		Button b2=new Button("Red");
		Button b3=new Button("Cyan");
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		b1.setBackground(Color.blue);
		b1.setSize(50,50);
		b1.setBounds(10, 10, 20, 20);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setBackground(Color.blue);
			}
		}
		);
		
		
		b2.setBackground(Color.red);
		b2.setBounds(20, 20, 20, 20);
		b2.setSize(50,50);
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setBackground(Color.red);
			}
		}
		);
		
		b3.setBackground(Color.cyan);
		b3.setBounds(30, 30, 20, 20);
		b3.setSize(50,50);
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				setBackground(Color.cyan);
			}
		}
		);
		

	}


	protected void setBackground(Color blue) {
		// TODO Auto-generated method stub
		
	}


	public void WindowClosing(WindowEvent e) {
		f.dispose();
		}
	

	public static void main(String args[]) {
		new Buttonevent();
	}
}
