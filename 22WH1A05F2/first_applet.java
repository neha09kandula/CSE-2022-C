import java.applet.Applet;
import java.applet.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class first_applet extends Applet {

	public static void main(String[] args) {

	}
public void paint(Graphics g)
{
	g.setColor(Color.black);
	//g.setBackground(Color.yellow);
	g.drawString("Hi Applet Program",80,150);
}
}