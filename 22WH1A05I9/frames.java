package javaprograms;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Graphics;
public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("My First Frame");
		f.setSize(400,300 );
		f.add(new MyComponent()); 
		f.setVisible(true);

	}
	public class message extends Frame {
		void meassage(){
			addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}
		
	}				
	static class MyComponent extends Component {
	public void paint(Graphics g) {
		g.drawRect(20, 40, 40, 40);
		g.drawLine(10, 20, 70, 80);
		g.drawOval(50, 70, 50, 40);
		g.fillOval(20, 60, 50, 30);
		g.drawArc(20, 30, 50, 60, 45, 60);
		g.drawRoundRect(20, 40, 60, 60, 40, 20);
	}

}
}
