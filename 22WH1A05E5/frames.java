package Frames;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.color.*;
public class firstframejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My first frame");
		f.setSize(500,500);
		f.add(new MyRectangle());
		f.setVisible(true);
		f.setBackground(Color.black);
	}
	static class MyRectangle extends Component{
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.drawOval(100, 100, 120, 120);
		g.fillOval(100, 100, 100, 100);
		g.setColor(Color.red);
		g.drawRect(190, 380, 150, 120);
		g.drawRect(200, 400, 10, 20);
		g.drawRect(210, 400, 10, 20);
		g.drawRect(240, 400, 10, 20);
		g.drawRect(250, 400, 10, 20);
		g.drawRect(280, 400, 10, 20);
		g.drawRect(290, 400, 10, 20);
		
		
		
		g.drawRect(400, 300, 100, 120);
		g.drawRect(200, 400, 10, 20);
		g.drawRect(210, 400, 10, 20);
		g.drawRect(240, 400, 10, 20);
		g.drawRect(250, 400, 10, 20);
		g.drawRect(280, 400, 10, 20);
		g.drawRect(290, 400, 10, 20);
	}
	}
}
	
