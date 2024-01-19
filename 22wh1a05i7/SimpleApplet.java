import java.applet.Applet;
import java.awt.*;
public class SimpleApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		setBackground(Color.pink);
		g.drawString("HI APPLET PROGRAM",80,150);
	}
}