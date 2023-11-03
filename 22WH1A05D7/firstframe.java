package frames;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Event;
public class firstframe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f= new Frame("MY FIRST FRAME");
		f.setSize(400,300);
		f.setBounds(100,50,500,300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component
	{
		public void paint(Graphics g)
		{
			g.drawRect(20, 10, 100, 60);
			g.drawLine(0, 0, 100, 10);
			g.drawLine(0, 90, 100, 10);
			g.drawLine(40, 25, 250, 80);
			g.drawRect(10, 150, 60, 50);
			g.fillRect(100, 150, 60, 50);
			g.drawRoundRect(190, 150, 60, 50, 15,15);
			g.fillRoundRect(280, 150, 60, 50, 30, 40);
			g.drawOval(10, 250, 50, 50);
			g.fillOval(90, 250, 75,50);
		}
	}
	
}
