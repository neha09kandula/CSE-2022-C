import java.applet.*;
import java.awt.*;

public class SimpleApplet extends Applet
{
      public void paint(Graphics g)
      {
           g.setColor(Color.black);
           setBackground(Color.pink);
           g.drawString("hii Applet",80,150);
       }
} 