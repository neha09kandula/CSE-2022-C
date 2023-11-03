package frames;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
public class firstframejava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My first Frame");
		f.setSize(400,300);
		f.setBounds(100,50,500,300);
		f.add(new MyComponent ());
		f.setVisible(true);
	}
	static class MyComponent extends Component {
		public void paint(Graphics g)  {
			g.drawRect(50, 50, 50, 50);
			g.drawLine(50,45,30,45);
			g.drawArc(20,30, 35, 25, 40, 35);
			g.drawRoundRect(100, 110, 70, 50, 60, 70);
			g.draw3DRect(100, 110, 120, 110, getFocusTraversalKeysEnabled());
			g.drawOval(100,100,100,100);
			g.fillRect(50,100,50,60);
			g.fill3DRect(120, 100, 50, 120,getFocusTraversalKeysEnabled() );
			
			
		}
	}
 
}
