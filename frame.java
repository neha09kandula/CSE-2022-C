package csec2022;
import java.awt.*;
import java.awt.event.*;

 class TestGui extends Frame{
	public void paint(Graphics g) {
		g.drawRect(500,400,300,350);
		g.setColor(Color.red);
		g.fill3DRect(500,400,300,350, getFocusTraversalKeysEnabled());
		g.drawOval(550,480,200,200);
		g.setColor(Color.blue);
		g.fillOval(550,480,200,200);
		g.drawOval(590,520,19,28);
		g.setColor(Color.black);
		g.fillOval(590,520,19,28);
		g.drawOval(690,520,19,28);
		g.setColor(Color.black);
		g.fillOval(690,520,19,28);
		g.drawOval(690,520,19,28);
		//g.drawLine(645,550,645,620);
		g.drawArc(350,500,30,400,100,40);
		g.drawString("Always keep smiling",100,100);
		g.setColor(Color.green);
		g.drawRect(10,10,340,540);
 	    g.drawOval(10, 10, 340, 540);
 	    g.fillOval(90, 10, 340, 540);
 	    g.drawOval(10, 250,75,50);
 	    g.drawLine(0, 0, 100, 90);
 	    g.drawLine(0, 90, 100, 10);
 	    g.drawLine(40, 25,250, 80);
 	    g.drawRect(10,150,60,50);
 	    g.fillRect(100,150,60,50);
 	    g.drawRoundRect(190,150,60,50,15,15);
 	    g.fillRoundRect(280,150,60,50,30,40);
        g.drawRect(10,10,630,540);
 	    g.drawOval(10,10,150,150);
 	    g.drawRect(200,280,350,260);
		}
}
public class GUI {
     public static void main(String[] args) {
    	     TestGui f= new TestGui();
			 f.setVisible(true);
	         f.setSize(400, 200);
	         f.addWindowListener(new MyClass());
     }

}
	class MyClass extends WindowAdapter{
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}