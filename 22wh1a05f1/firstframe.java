package Frames;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component; 

public class firstframe {
	
public static void main(String[]args) {
	Frame f= new Frame("My first frame");
	f.setSize(500, 400);
	f.add(new MyComponent());
	f.setVisible(true);
}
		
static class MyComponent extends Component {
	

public void paint (Graphics g) {
	g.fillRect(100,150,100,150);
	g.drawLine(180,80,250, 220);
	g.drawArc(200, 280, 100, 110, 45, 145);
	g.drawOval(260, 200,120,80);
	g.fillRoundRect(330, 150, 60, 50 ,15,15);
}

}
}
