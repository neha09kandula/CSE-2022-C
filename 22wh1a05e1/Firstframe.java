package Frames;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;

public class Firstframe {
	
	public static void main(String[] args)
	{
		Frame f=new Frame("My First Frame");
		f.setSize(400,800);
		f.setBounds(100,50,500,300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	 static class MyComponent extends Component{

	public void paint(Graphics g)
	{
	 g.drawRect(80,80,40,40);
	 g.drawLine(50,10,10,15);
	 g.drawOval(20,20,20,20);
	 g.fillOval(20,20,20,20);
	}
	}
}