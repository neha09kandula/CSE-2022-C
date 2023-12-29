package expection;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
public class Framework1 {
	
		public static void main(String[] args) {
	        Frame f=new Frame("My first Frame");
	        f.setSize(1000, 800);
	        f.add(new MyComponent());
	        f.setVisible(true);
		}
		static class MyComponent extends Component{
			
		public void paint(Graphics g) {
			g.draw3DRect(200, 200, 300, 300, getFocusTraversalKeysEnabled());
			g.setColor(Color.red);
			g.fill3DRect(200, 200, 300, 300, getFocusTraversalKeysEnabled());
			g.drawRect(250, 250, 200, 200);
			g.setColor(Color.pink);
			g.fillRect(250, 250, 200, 200);
			g.drawOval(250, 250, 200, 200);
			g.drawOval(250, 250, 200, 200);
			g.setColor(Color.black);
			g.fillOval(250, 250, 200, 200);
			g.drawOval(300,300,100,100);
			g.setColor(Color.blue);
			g.fillOval(300, 300, 100, 100);
			g.drawLine(150, 150, 50, 50);
			
		}

	}
	}