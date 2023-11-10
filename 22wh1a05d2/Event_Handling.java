package Java_program;
import java.awt.*;

public class Event_Handling
{
	public class Window Example Extends frame()
	{
{
  Window Example(){
	  addWindowListener(new Window Adapter()
  }
				{
					public void WindowClosing(WindowEvent e)	
				}
			{
				dispose();
			}
				});
		setSize(400,400);
		setBounds(30,60,80,120);
		setlayout(null);
		setVisible(true);
	}
	public void Paint(Graphics g)
	{
		g.drawRect(200, 110, 120, 30);
	}
	public static void main(String[] args){
		new Window Example();

	}

}
