package cse225f7;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Component;
import java.awt.event.*;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Frame f = new Frame("my first Frame");
        f.setSize(400,300);
        f.setBounds(100,40,500,250);
        f.add(new MyComponent());
        f.setVisible(true);
	}
	static class MyComponent extends Component {
    public frames() {
			// TODO Auto-generated constructor stub
		}

	public void paint(Graphics g) {
        g.drawRect(40,50,40,50);
        g.fillRect(40,50,40,50);
        g.drawLine(60,70,80,90); 
    }
	}
}