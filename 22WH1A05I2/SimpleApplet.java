import java.awt.*;
import java.applet.*;

public class SimpleApplet extends Applet{
	public void paint(Graphics g) {
		g.setColor (Color.black);
		setBackground(Color.yellow);
		g.drawString("Hello Kitty!",80,150);
 	}
}