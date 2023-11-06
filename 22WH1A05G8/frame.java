package javaprograms22wh1a05g8;
import java.awt.Graphics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.*;
import java.awt.*
;
public class frame extends Frame {
	frame() {
		addWindowListener(new WindowAdapter()
	   {
		public void windowCosing (WindowEvent e) {
		System.exit(0);
		}
		});
	}
	public static void main(String[] args) {
		Frame f= new Frame("frame");
		f.setSize(400,400);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	public void paint (Graphics g)
	{
		g.drawLine(100, 156, 167, 156);
		g.drawRect(120, 60, 90, 200);
		g.fillRect(120, 60, 90, 200);
		g.drawOval(145, 120, 30, 30);
		g.drawArc(600,500,65,15,9000,200);
		g.draw3DRect(154, 234, 134, 167, getFocusTraversalKeysEnabled());
		g.drawRoundRect(900,200, 40, 30, 67, 80);
		g.fillRoundRect(900,200, 40, 30, 67, 80);
	}
}
}