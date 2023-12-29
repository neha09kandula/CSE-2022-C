package java_c;
import java.awt.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java_c.frames.MyComponent;

public class window extends Frame {
	window(){
		addWindowListener(new WindowAdapter()
		{
		public void windowClosing(WindowEvent e) {
		System.exit(0);
		}
		});
		}
	public class frames{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Frame f = new Frame("My first frame");
			f.setSize(1000, 500);
			f.add(new MyComponent());
			f.setBackground(Color.yellow);
			f.setVisible(true);
			
		}
		static class MyComponent extends Component {
		public void paint(Graphics g) { 
		g.drawLine(50, 150, 430, 150);
		g.drawArc(150, 160, 150, 140, 45, 370);
		g.drawRect(100, 80, 250, 300);
		g.drawOval(130, 120, 13, 15);
		g.drawOval(290, 120, 13, 15);
		g.fillOval(130, 120, 14, 15);
		g.fillOval(290, 120, 14, 15);
		g.fillArc(150, 160, 150, 140, 45, 370);
	}
	}
	}
