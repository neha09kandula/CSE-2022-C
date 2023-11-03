package frames;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("my first frame");
        f.setSize(400,300);
        f.setVisible(true);
        f.add(new MyComponent());
	}
	static class MyComponent extends Component{

	public void paint(Graphics g) {
		  g.drawRect(180,180, 180, 180);
		  
		  g.drawLine(800,800,90,100);
		  
		  
		  g.drawOval(360, 360, 180, 180);
		  
		  g.drawArc(540, 540, 160, 190, 180, 180);
		  g.fillArc(540, 540, 160, 190, 180, 180);
		  g.setColor(Color.orange);
		  
		  
		  g.fill3DRect(180, 180, 180,180, getFocusTraversalKeysEnabled());
		  g.setColor(Color.pink);
		  
		  
		  g.fillOval(360,360,180,180);
		  g.setColor(Color.blue);
		  
		  
		  
		  
	
		  
	}
	}

	

public class meassage extends Frame {
	 void message()
	{
		addWindowListener(new WindowAdapter()
	  {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	  });
		
	}
	public void paint(Graphics g) {
		
		this.setBackground(new Color(10,20,20));
	Font f=new Font("Arial",Font.BOLD +Font.ITALIC,0);
	} 
        }
}	
	
