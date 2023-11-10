package Frames;
import java.awt.*;

public class windowExample extends frame {
	windowExample() {
		add(windowListener(new windowAdapter())
		{
			public void windowClosing(windowEvent e)
			{
				dispose();
			}
		});
		f.setSize(400,400);
	}
}