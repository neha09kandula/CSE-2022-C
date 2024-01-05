package programs;
import java.awt.event.*;
import java.awt.*;
public class Trafficlight extends WindowAdapter{
	Frame f;
	CheckboxGroup cg;
	Checkbox c1,c2,c3;
	Trafficlight()
	{
		f=new Frame("Traffic lights");
		f.setSize(700, 700);
		f.setVisible(true);
		f.setLayout(null);
		f.addWindowListener(this);
		
		cg=new CheckboxGroup();
		c1=new Checkbox("RED",cg,true);
		c1.setBounds(80, 50, 50, 20);
		
		c2=new Checkbox("YELLOW",cg,false);
		c2.setBounds(170, 50, 85, 20);
		
		c3=new Checkbox("GREEN",cg,true);
		c3.setBounds(270, 50, 85, 20);
		
		f.add(c1);
		f.add(c2);
		f.add(c3);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Trafficlight();
	}
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
	public void paint(Graphics g)
	{
		g.drawOval(350, 400, 90, 60);
	}

}
