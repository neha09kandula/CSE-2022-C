package frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowExample extends Frame
{
	WindowExample()
	{
		   addWindowListener(new WindowAdapter()
		   {
			   public void windowClosing(WindowEvent e)
			   {
				  dispose(); 
			   }
			   
		   });
	setSize(400,400);
	setBounds(300,600,800,720);
	setLayout(null);
	setVisible(true);

	}
	public void paint(Graphics g)
	{
		g.drawRect(200, 110, 120, 30);
		g.drawOval(30, 20, 40, 50);
	}
	public static void main(String args[])
	{
		new WindowExample();
	}

}