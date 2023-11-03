package frames;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
public class firstframejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f =new Frame("My First Frame");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.drawLine(10, 20, 30, 40);
		g.drawArc(20,30,240,100,170,150);
		g.drawRect(50,60, 320, 200);
		g.drawOval(30, 40,120,90);
		g.drawRoundRect(20,90, 310, 390, 120, 175);
		g.fillOval(90,250,75,50);
		g.fillRect(190,260,150, 170);
		
	
	}
	}
}
