package javaprograms;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Component;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("My First Frame");
		f.setSize(1000, 1000);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component {
	public void paint(Graphics g) {
		g.drawRect(100, 400, 100, 400);
		g.setColor(Color.orange);
		g.fillRect(100, 400, 100, 400);
		g.drawLine(140, 80, 100, 200);
		g.drawOval(200, 500, 100, 500);
		g.setColor(Color.pink);
		g.fillOval(100, 400, 100, 400);
		g.drawRoundRect(190, 150, 60, 50, 15, 15);
		g.fillRoundRect(280, 150, 60, 50, 40, 30);
	
	}

	}

}
