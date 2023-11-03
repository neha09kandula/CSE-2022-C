package Frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
public class frame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My First Frame");
		f.setSize(400, 300);
		f.setBounds(100, 50, 500, 300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	    public void paint(Graphics g) {
	    	g.drawRect(110, 120, 140, 150);
	    	g.drawLine(20, 30, 40, 50);
	    	g.drawArc(50, 60, 70, 80, 90, 100);
	        g.drawOval(100,150, 180, 200);
	        g.drawRoundRect(60, 50, 70, 90, 140, 200);
	        g.fillOval(58, 300, 200, 190);
	  
	    }

		
	}
	
	
}
