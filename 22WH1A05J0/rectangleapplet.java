
import java.applet.*;
import java.awt.*;
public class rectangleapplet  extends Applet{
	Frame f=new Frame();
	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillRect(100,100, 500, 100);
	}
public static void main(String args[])
{
	new rectangle();
}
	 
}
