package Frames;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Window extends WindowAdapter{
       Frame f1,f2;
       Button b15;
		Window(){
		f1=new Frame("Hellow Frame");
		f1.addWindowListener( this);
		f1.setSize(800,800);
		f1.setVisible(true);
		f1.setLayout(null);
		f1.setLayout( new GridLayout(3,3));
		Label l1 =new Label("ENTER");
		f1.add(l1);
		l1.setVisible(true);
		Button b1=new Button("1");
		f1.add(b1);
		b1.setVisible(true);
		Button b2=new Button("2");
		f1.add(b2);
		b1.setVisible(true);
		Button b3=new Button("3");
		f1.add(b3);
		b1.setVisible(true);
		Button b4=new Button("4");
		f1.add(b4);
		b1.setVisible(true);
		Button b5=new Button("5");
		f1.add(b5);
		b1.setVisible(true);
		Button b6=new Button("6");
		f1.add(b6);
		b1.setVisible(true);
		Button b7=new Button("7");
		f1.add(b7);
		b1.setVisible(true);
		Button b8=new Button("8");
		f1.add(b8);
		b1.setVisible(true);
		Button b9=new Button("9");
		f1.add(b9);
		b1.setVisible(true);
		Button b10=new Button("+");
		f1.add(b10);
		b1.setVisible(true);
		Button b11=new Button("-");
		f1.add(b11);
		b1.setVisible(true);
		Button b12=new Button("*");
		f1.add(b12);
		b1.setVisible(true);
		Button b13=new Button("/");
		f1.add(b13);
		b1.setVisible(true);
		Button b14=new Button("=");
		f1.add(b14);
		b14.setVisible(true);
		Button b15=new Button("SUBMIT");
		f1.add(b15);
		b15.setVisible(true);
		b15.addActionListener((ActionListener) this);
		}
	public void actionPerformed(ActionEvent ae)
	{
    if(ae.getSource()==b15)
       {
    	   f2=new Frame("Congratulations");
    	   f2.setSize(800,800);
    	   f2.setVisible(true);
    	   Label l2=new Label("EMPTY");
    	   f2.add(l2);
    	   l2.setVisible(true);
    	   
       }
    else
    {
    	System.exit(0);
    }
		
	}
	public void windowClosing(WindowEvent e) {
		f1.dispose();
		f2.dispose();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new Window();
	}

}

