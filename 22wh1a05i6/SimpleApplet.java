import java.applet.*;
import java.awt.*;

public class SimpleApplet extends Applet
{
  public void paint(Graphics g)
{
g.setColor(Color.black);
setBackground(Color.yellow);
g.drawString(" Applet Program", 80,50);
}
}
