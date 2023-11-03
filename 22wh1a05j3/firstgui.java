package Frames;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
public class firstgui 
{
public static void main(String args[])
{
	Frame f= new Frame("my frame");
	f.setSize(400,400);
	f.add(new MyComponent());
	f.setVisible(true);
}
static class MyComponent extends Component 
{
public void paint(Graphics g)
{
	    
	g.drawRect(100, 50, 60, 50);
	g.fillRect(100, 50, 60, 50);
	g.drawArc(100, 100, 100, 100, 100, 100);
	g.drawOval(200, 100, 100, 50);
	g.drawLine(200, 200, 200, 200);
}
}
}

