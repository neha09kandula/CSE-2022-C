package javaprograms;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Frame f= new Frame("My First Frame");
  f.setSize(1000,1000);
  f.add(new MyComponent());
  f.setVisible(true);
  
	}
	static class MyComponent extends Component{
    public void paint(Graphics g) {
    	g.drawRect(100, 200,  100, 200);
    	g.fillRect(50, 100, 50, 100);
    	g.setColor(Color.PINK);
    	g.drawLine(100, 70, 200, 500);
    	g.drawOval(100, 200, 100 , 200);
    	g.fillOval(50, 100, 50, 100);
    	g.draw3DRect(250, 200, 250, 200, getFocusTraversalKeysEnabled());
    	g.fill3DRect(300,250,300,250, getFocusTraversalKeysEnabled());
    }
    }
}
 