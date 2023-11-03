package csec2022;
import java.awt.*;//7894561230
//import java.awt.Graphics;


public class Gui {
	public static void main(String[] args) {
		Frame f= new Frame("my first frame");
		f.setSize(400,400);
		f.add(new MyComponent());
		f.setVisible(true);
		//action listeners are used in order to close the window		
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
	/*g.drawRect(50, 50, 340, 540);
	g.fillRect(50,50,340,540);
	g.drawOval(300, 370, 340, 540);
	g.fillOval(300,370,340,540);
	//g.draw3DRect(50,50,500,, getFocusTraversalKeysEnabled());
	g.drawOval(400,400,100,100);
	g.fillOval(400,400,100,100);		
	//g.drawRoundRect(50,50,400,300,60,60);
	//g.fillRoundRect(50,50,400,300,60,60);*/
	g.drawRect(100,100,500,500);
	g.drawRect(100,100,250,250);
	g.drawRect(100,200,100,100);
	g.drawRect(100, 400, 150, 200);
	}
}
}