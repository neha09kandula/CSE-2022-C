package frames;
import java.awt.Frame ;
import java.awt.Component;
import java.awt.Graphics;
public class firstframe {

	public static void main(String[] args) {
		Frame f = new Frame("My First Frame");//frame is created 
		f.setSize(400,300);//width and height is set
		f.add(new MyComponent());
		f.setVisible(true);//so that the frame is visible 

	}
			
		
	
	static class MyComponent extends Component{
	public void paint(Graphics g)//abstractly defining a method. It cannot be changed 
	{
		g.drawRect(100,50, 100, 200);
		g.drawLine(20,30,100,100);
		g.fillOval(100, 50, 100, 200);
		g.drawArc(100,200,300,400,500,600);
		g.fillRect(80,200,100,300);
		g.fillRoundRect(190,150,60,50,15,15);
		
	}
  }
}
