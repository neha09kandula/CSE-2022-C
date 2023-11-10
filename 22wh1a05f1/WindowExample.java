package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public  class WindowExample extends Frame {
WindowExample() {
	
	addWindowListener(new WindowAdapter()
	{
		public void Windowclosing (WindowEvent e)
		{
			dispose();
			
		}
	});
    setSize(400,400);
	setBounds(30,60,80,100);
	setLayout(null);
	setVisible(true);
}

public void Paint(Graphics g)
{
	g.drawRect(200, 110, 120, 30);
}
public static void main(String[]args)
{
	new WindowExample();
}

}
