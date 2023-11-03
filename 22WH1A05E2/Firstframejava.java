package Frames;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;

public class Firstframejava {
	
	public static void main(String [] args)
	{
		//TODO Auto-generated method stub
		Frame f= new Frame("MY FIRST FRAME");
		f.setSize(400,300);
		f.setBounds(100,50,500,300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	
	static class MyComponent extends Component
	{
		public void paint(Graphics g)
		{
			g.drawRect(20, 10,50,100);
			//Draw line
			g.drawLine(0, 0,100,90);
			g.drawLine(0,90,100,10);
			g.drawOval(20,20,20,20);
			g.fillOval(20,20,20,20);
		}
	}
}