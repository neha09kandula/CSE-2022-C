import java.applet.*;
import java.awt.*;

public class MyApplet2 extends Applet
{
	public void init()
	{
		setSize(400,400);
	}
	public void paint(Graphics g){
		g.drawRect(200,300,90,150);
}
}
