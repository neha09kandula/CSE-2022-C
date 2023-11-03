package frames;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.Color;

public class firstframe {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My First Frame");
		f.setSize(400, 300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(200, 200, 200, 200);
		g.setColor(Color.yellow);
	    g.fillOval(200, 1, 200, 200);
	    g.setColor(Color.black);
	    g.drawOval(260, 80, 10, 10);
	    g.drawOval(330, 80, 10, 10);
	    g.fillOval(260, 80, 10, 10);
	    g.fillOval(330, 80, 10, 10);
	    g.drawArc(250, 60, 100, 100, 940, 100);
	    g.setColor(Color.red);
	    g.fillRect(200, 400, 100, 200);
	    g.setColor(Color.red);
	    g.fillRect(301, 400, 100, 200);
	    g.setColor(Color.black);
	    g.fillOval(200, 600, 100,50);
	    g.fillOval(300, 600, 100,50);
	    g.setColor(Color.yellow);
	    g.fillRect(100,200 ,100 ,30 );
	    g.fillRect(100,100 ,30 ,100 );
	    g.fillRect(400,200 ,100 ,30 );
	    g.fillRect(470,100 ,30 ,100 );
	    
	
	}
	
	}
}    