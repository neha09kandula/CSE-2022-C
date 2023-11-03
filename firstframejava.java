package frames;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
public class firstframejava {

	public static void main(String[] args) {
				Frame f=new Frame("My first frame");
				f.setSize(400,300);
				f.setBounds(100,50,400,300);
				f.add(new MyComponent());
				f.setVisible(true);
			}
	static  class MyComponent extends Component{


	public void paint(Graphics g) {
		g.drawLine(10,20,30,40);
		g.drawArc(30, 400, 150, 150, 150,200);
		g.drawRect(50,60,320,400);
		g.drawOval(50, 100, 200, 300);
        g.drawRoundRect(90,310,210,270, 370, 157);
        g.fillOval(200, 310, 250, 170);
        
	}
	}
	}


