package applets;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;

public class FirstFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My first frame");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);
		
	}
	static class MyComponent extends Component{
	public void paint(Graphics g)
	{
		

		g.setColor(Color.blue);
		
		g.drawRect(100,350,150,250);
		g.setColor(Color.orange);
		g.fillOval(100,370,100,200);
		g.setColor(Color.blue);
		
		g.drawRect(50, 350, 150, 250);
		g.setColor(Color.red);
		g.fillRoundRect(55,355,40,50,60,70);
		g.setColor(Color.red);
		g.fillRoundRect(55,415,40,50,60,70);
		g.setColor(Color.red);
		g.fillRoundRect(55,480,40,50,60,70);
		g.setColor(Color.red);
		g.fillRoundRect(55,545,40,50,60,70);
		g.setColor(Color.red);
		g.fillRoundRect(205,355,40,50,60,70);
		g.setColor(Color.red);
		g.fillRoundRect(205,415, 40,50,60,70);
		g.setColor(Color.red);
		g.fillRoundRect(205, 480, 40, 50, 60, 70);
		g.setColor(Color.red);
		g.fillRoundRect(205,545,40,50,60,70);
		
		g.setColor(Color.black);
		g.drawOval(100,100,120,120);
		g.fillOval(100, 100, 100,100);
		
	
		g.setColor(Color.darkGray);
		g.drawRect(500, 600, 150, 250);
		
		g.setColor(Color.green);
		g.fillRect(510, 610, 20, 30);
		g.fillRect(535, 610, 20, 30);
		g.fillRect(510,650,20,30);
		g.fillRect(535, 650, 20, 30);
		
		g.setColor(Color.gray);
		g.drawLine(620, 600, 620, 900);
		g.drawLine(630, 600, 630, 900);
		g.drawLine(640, 600, 640, 900);
		
	}
}
}
