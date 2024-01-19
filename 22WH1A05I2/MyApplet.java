import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet{
		
		public void paint(Graphics g) {
    		System.out.println("Hellowww...its my 1st applet!");
		g.setColor (Color.black);
		setBackground(Color.yellow);
		g.drawString("Hello Nice to see you !",80,150);
 	}

		
	
}