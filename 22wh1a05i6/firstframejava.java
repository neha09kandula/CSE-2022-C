package Frame;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
public class firstframejava
{
	public static void main(String args[])
	{
		//TODO Auto-generated method stub
		Frame f = new Frame("My First Frame");
		f.setSize(700,500);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component
	{
	public void paint(Graphics g)
	{
		g.drawRect(100, 120, 140, 120);
		g.fillRect(100, 120, 140, 120);
		g.drawLine(110, 120, 130, 140);
		g.drawArc(156, 124, 160, 234, 127, 194);
		g.drawOval(47, 34, 71, 25);
		g.fillOval(47, 34, 71, 25);
		g.drawRoundRect(210, 167, 345, 245 , 231 , 124);
		g.fillRoundRect(210, 167, 345, 245, 231, 124);
		
	}
	}

}
