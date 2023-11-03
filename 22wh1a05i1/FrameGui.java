package cse_225i1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
public class FrameGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("haii");
		f.setSize(400,400);
		f.add(new MyComponent());
		f.setVisible(true);
		
	}
	static class MyComponent extends Component{
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.drawRect(120,120,120,120);
		g.setColor(Color.pink);
		g.fillRect(120,120,120,120);
		g.drawOval(120, 120, 120, 120);
		g.setColor(Color.yellow);
		g.fillOval(120, 120, 120, 120);
		g.setColor(Color.yellow);
		g.drawOval(150, 150, 70, 70);
		g.setColor(Color.blue);
		g.fillOval(150, 150, 70, 70);
		g.setColor(Color.blue);
		
	
	}
	}
}