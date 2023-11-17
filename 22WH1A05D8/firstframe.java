package Frame;
import java.awt.Component;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
public class firstframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("My first frame");
		f.setSize(400, 300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.drawRect(50,30,50,30);
		g.setColor(Color.cyan);
		g.drawOval(20, 180,150,100);
		g.fillOval(20,180,150,100);
		g.drawLine(100, 100, 150, 150);
		g.drawArc(20,10,70, 70, 265,50);
		g.setColor(Color.green);
		g.drawRect(200,150,200,150);
		g.setColor(Color.pink);
		g.fillRect(20,10,20,10);
		g.drawOval(10,5,20,13);
	}
	public class message extends Frame {
		   message(){
			   addWindowListener(new WindowAdapter()
			   {
				   public void WindowClosing(WindowEvent e) {
					   System.exit(0);
				   }
			   });
		   }
}
}
}
