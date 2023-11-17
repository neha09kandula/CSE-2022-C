package frame;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("My main");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);
		
	}
	static class MyComponent extends Component{
    public void paint(Graphics g) {
    	g.drawRect(32, 46, 63, 81);
    	g.drawLine(100, 100, 200, 210);
    	g.drawArc(150, 100, 50, 62, 30, 188);
    	g.drawOval(150, 90, 71, 49);
    	g.draw3DRect(100, 150, 80, 60, getFocusTraversalKeysEnabled());
        g.drawRoundRect(50, 80, 150, 130, 160, 70);
        g.fillRoundRect(150, 180, 70, 90, 95, 83);
    }
}
}
