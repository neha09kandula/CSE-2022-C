package javaprograms;
import java.awt.Frame;
import java.awt.Component;
import java.awt.Graphics;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Frame f =new Frame("my first frame");
      f.setSize(400,300);
      f.add(new MyComponent());
      f.setVisible(true);
	}
	static class MyComponent extends Component{
    public void paint(Graphics g) {
    	g.drawRect(50,50,50,50);
    	g.drawLine(345,246,178,90);
    	g.drawArc(20, 30,45, 60, 70, 80);
    	g.fillRect(100, 150, 60, 50);
    	g.fillRoundRect(280, 150, 60, 50, 30, 40);
        
    }
}
}