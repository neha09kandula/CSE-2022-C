package frames;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
public class firstframe {

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		Frame f = new Frame("my first Frame");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);		
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(220, 230, 240, 250);
		g.setColor(Color.yellow);
		g.fillOval(220, 230, 240, 250);
		g.setColor(Color.black);
		g.drawArc(265, 260, 150, 170, 210, 125);
		g.fillOval(280, 280, 50, 60);
		g.fillOval(360, 280, 50, 60);
		g.drawLine(460, 230, 330, 90);
	}
	}
}
