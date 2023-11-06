package frames;
import java.awt.Color;
import java.awt.Frame;
import java.awt.*;
import java.awt.Component;
import java.awt.Graphics;
public class firstframe{
	public static void main(String[] args) {
		Frame f = new Frame("my first frame");
		f.setSize(400, 300);
		f.setBounds(100,50,500,300);
		f.add(new MyComponent());
		f.setVisible(true);

		// TODO Auto-generated method stub

	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.drawRect(500,90,200,150);
		g.drawOval(300,1,150,100);
		g.setColor(Color.blue);
		g.drawLine(100,5,150,150);
		g.setColor(Color.pink);
		g.drawArc(20,10, 70, 70, 265, 50);
		g.setColor(Color.green);
		g.fillOval(10,20,90,80);
		g.setColor(Color.yellow);
		g.fillRect(150,10,70,50);
	}
	}
}
