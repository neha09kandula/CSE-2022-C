package Frames;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;


public class firstframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Frame f = new Frame("My First Frame");
	f.setSize(400, 300);
	f.add(new MyComponent());
	f.setVisible(true);

	}
	static class MyComponent extends Component{
    public void paint(Graphics g) {
    	g.drawRect(30,60,30,60);
    	g.drawArc(30,60,400,500,400,60);
    	g.draw3DRect(60,30,150,180, getFocusTraversalKeysEnabled());
    	g.drawOval(40,50,100,120);
        g.fillOval(10,20,15,18);
        g.drawString("SAI",90,100);
        g.fill3DRect(30,40,10,15, getFocusTraversalKeysEnabled());
       
        
    }
}
}