package Frame;

import java.applet.*;
import java.awt.*;
/*
<applet code="SimpleApplet" width=400 height=400></applet>
*/

@SuppressWarnings("removal")
public class SimpleApplet extends Applet
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paint(Graphics g)
{
 g.setColor(Color.white);
 setBackground(Color.blue);
 g.drawString("HI AKSHARA BHAVITHA",80,150);
}
}