import java.applet.*;
import java.awt.*;
/*
<applet code="SimpleApplet" width=400 height=400></applet>
*/

public class SimpleApplet extends Applet
{
  public void paint(Graphics g)
{
 g.setColour(Colour.black);
 setBackground(Colour.   yellow);
 g.drawString("HAI TEJASWI" ,80,150);
}
}