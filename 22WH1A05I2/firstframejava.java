package Frames;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class firstframejava{

	public static void main(String[]args)
	{
		//auto-generated method
		Frame f= new Frame("My first frame");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);
		f.addWindowListener(new Class());	
    }
	static class MyComponent extends Component{
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		g.drawRect(200,200,120,120);//creation
		g.fillRect(200,200,120,120);
		g.setColor(Color.pink);
		
		
		g.drawOval(120,120,120,120);
		g.fillOval(120,120,120,120);
		g.setColor(Color.pink);
		
		//draw lines
		//g.drawLine(0,0,100,90);
		
		//draw ellipses and circles
		g.drawOval(250, 120, 120, 120);
		g.fillOval(250, 120, 120, 120);
		g.setColor(Color.pink);
		
		g.drawOval(250, 250, 120, 120);
		g.fillOval(250, 250, 120, 120);
		g.setColor(Color.pink);
		
		g.drawOval(120, 250, 120, 120);
		g.fillOval(120, 250, 120, 120);
		g.setColor(Color.pink);
		
		
	}
	}
	
}
	class Class extends WindowAdapter{
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}}

