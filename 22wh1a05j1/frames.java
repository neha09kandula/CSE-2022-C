package frames;
import java.awt.*;


public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("my First Frame");
		f.setSize(400,300);
		f.setVisible(true);
		f.add(new My());	

	}
	static class My extends Component{
	public void paint(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(300, 150, 120, 120);
		g.drawOval(590, 150, 120, 120);
		g.drawArc(660, 600, 400, 500, 40, 40);
		g.setColor(Color.blue);
		g.fillOval(250, 20, 500, 500);
	    g.setColor(Color.pink);
	    g.fillRect(590, 150, 120, 120);
	    g.setColor(Color.yellow);
		g.fillOval(450, 300, 120, 120);
		
	    
		
	}

}
}
public class message extends frames {
	message(){
	         addWindowListener(new WindowAdapter()
			{
			public void windowClosing(WindowEvent e) {
		    System.exit(0);
	        }
	
	        });
            }
			public void paint(Graphics g) {
			this.setBackground(new Color(100,20,20));
			Font f=new Font("arial",Font.BOLD+Font.ITALIC)
			g.setFont(f);
				
			}
			
}

