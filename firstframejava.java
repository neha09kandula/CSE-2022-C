package cse22wh1a05d4;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

public class firstframejava {
	public static void main(String[] args) {
		Frame f=new Frame("My first Frame");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);
		
		
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.drawRect(100, 100, 100, 100);
		//g.drawLine(50, 50, 20, 30);
	    g.drawOval(100, 100, 100, 100);
		//g.drawLine(FRAMEBITS, ERROR, ALLBITS, ABORT);
		//g.drawArc(FRAMEBITS, ERROR, WIDTH, HEIGHT, ALLBITS, ABORT);
		g.draw3DRect(200, 200, 200, 200, getFocusTraversalKeysEnabled());
	    g.fillRect(100,100,100,100);
	    g.fillOval(250, 240, 30,50);
	    g.drawArc(190,190,150,200,200,150);
	    g.drawRect(400, 100, 100, 100);
	    g.fillRect(400,100,100,100);
	    g.fillOval(310, 240, 30,50);
	    
	    
	}
		
	}
}
