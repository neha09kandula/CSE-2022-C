package shravani514;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
public class FrameGui {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frame f= new Frame("My Class Frame");
f.setSize(400,500);
f.add(new MyComponent());
f.setVisible(true);

	}
static class MyComponent extends Component
{
	public void paint(Graphics g)
	{
		g.drawRect(30, 0, 80, 50);
		g.drawLine(0, 0, 0, 0);
		g.drawArc(0, 0, 0, 0, 0, 0); 
	}
}
}
