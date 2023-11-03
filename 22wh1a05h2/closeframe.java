package frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class closeframe{
	public static void main(Stringargs[]) {
		Frame f = new Frame("My first Frame");
		f.setSize(400,300);
		f.setVisible(true);
		
	}
public class closeframe extends firstframe{
	closeframe(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
				});
	}
}
}
