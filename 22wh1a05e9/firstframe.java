package Frames;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;



public class firstframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Frame f = new Frame("My First Frame");
     f.setSize(400, 300);
     f.add(new MyComponent());
     f.setVisible(true);
     
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.drawLine(10, 20, 200, 100);
		g.drawArc(30,150, 100, 150, 30, 90);
		g.draw3DRect(100, 50, 100, 60, getFocusTraversalKeysEnabled());
		g.drawOval(150, 130, 150, 100);
		g.fillRoundRect(220, 30, 100, 80, 50, 50);
		g.drawString("SRUJANA", 100, 20);
		int[] x= {50,100,150,200,250};
		int[] y = {95,150,200,260,300};
		g.drawPolygon(x, y, 4);
		
		
	}
	}
	

}
