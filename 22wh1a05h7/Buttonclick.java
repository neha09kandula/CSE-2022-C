package frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Buttonclick extends WindowAdapter implements ActionListener{
	Frame f,f1,f2;
	Button b,b1,b3,b4;
	Buttonclick(){
		f=new Frame(" ");
		f.addWindowListener (this);
	    f.setSize(400,500);
	    f.setVisible(true);
	    f.setLayout(null);
	    b=new Button("Next");
	    b.setBounds(140,210,165,45);
	    f.add(b);
	    b1=new Button("Submit");
	    b1.setBounds(140,290,165,45);
	    f.add(b1);
	    b1.addActionListener(this);
	    b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		//Frame f1,f2;
		
		if (ae.getSource()==b1)
			{
			f1=new Frame();
			f1.setBackground(Color.green);
			f1.setSize(400, 500);
			f1.setVisible(true);
			f1.setLayout(null);
			Label b3=new Label("Sorry!!!");
			b3.setBounds(140,290,165,45);
			f1.add(b3);
			f1.addWindowListener(this);
			}
			
		else if(ae.getSource()==b)
		{
			f2=new Frame();
			f2.setBackground(Color.yellow);
			f2.setSize(400, 500);
			f2.setVisible(true);
			f2.setLayout(null);
			Label b4=new Label("End");
			b4.setBounds(140,190,165,145);
			f2.add(b4);
			f2.addWindowListener(this);
		}
			}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
		System.exit(0);
	}
	public static void main(String [] args) {
		new Buttonclick();
	}
}

