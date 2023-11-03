package javaprograms225g7;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;


public class firstframe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("my first frame");
		f.setSize(400, 300);
		f.add(new MyComponent());
		f.setVisible(true);
	
	} 
	static class MyComponent extends Component{
	public void paint (Graphics g) {
		g.drawLine(300, 180, 200, 180);
		g.drawRect(120, 50, 140, 50);
		g.drawOval(50, 140, 140, 90);
		g.fillRoundRect(280, 150, 60, 50, 30, 40);
		g.fillArc(150, 160, 120, 140, 45, 370);

}
}
}
