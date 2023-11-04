package cse225f2;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
public class firstframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My First Frame");
		f.setSize(700,500);
		f.add(new MyComponent());
		f.setVisible(true);
		
	}
	
	static class MyComponent extends Component{
		public void paint(Graphics g) {
			g.drawRect(200, 300, 150, 50);
			g.setColor(Color.magenta);
			g.drawLine(200,10,15,60);
			g.setColor(Color.cyan);
			g.drawArc(500,40,150,50,30,90);
			g.setColor(Color.red);
			g.drawOval(400,10,100,50);
			g.fillRect(150,150,250,50);
			g.fillArc(500,200,130,140,30,30);
			g.setColor(Color.yellow);
			g.fillOval(40,50,40,20);
			g.setColor(Color.green);
			g.drawRoundRect(75,75,90,50,10,10);
			g.fillRoundRect(375,75,90,50,10,10);
			
		}
	}
	
}
