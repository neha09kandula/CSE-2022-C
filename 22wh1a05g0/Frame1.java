package Frames5G0;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
public class Frame1 {

	public static void main(String[] args) {
		Frame f=new Frame("My First Frame");
		f.add(new MyComponent());
		f.setSize(400, 300);
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.drawRect(140, 160, 140, 160);
		g.drawLine(150,140,170, 160);
		g.drawArc(160, 177, 154, 133, 176, 167);
		g.drawOval(250, 231, 221, 222);
		g.fillRoundRect(138, 152, 134,125, 142, 123);
		g.drawOval(111, 111, 111, 111);
		g.fillOval(88, 88, 88, 88);
			
	}
}
}
