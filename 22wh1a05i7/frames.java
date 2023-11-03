package javaprogram;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Graphics;

public class frames{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f =new Frame("My First Frame");
		f.setSize(400, 300);
		f.add(new MyComponent ());
		f.addWindowListener(new MyWindowListener());
		f.setVisible(true);

	}
	static class MyWindowListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e) 
		{
			System.exit(0);
		}
	}
	/*public class message extends Frame{
		void message(){
			addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent e) {
								System.exit(0);
				}
			});
		}
	}*/
	static class MyComponent extends Component {
    public void paint(Graphics g) {
    	g.drawRect(170, 150, 190, 200);
    	g.drawLine(100, 50, 60, 90);
    	g.drawOval(200, 210, 190, 250);
    	g.drawRoundRect(239, 200, 215, 195, 175, 260);
    }
	}
}
	
	

