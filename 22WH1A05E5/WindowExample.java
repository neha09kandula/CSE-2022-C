package studentreg;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class WindowExample extends@ WindowAdapter(){
	WindowExample(){
		Frame f= new Frame("Registeration Form");
		f.setSize(1080,1080);
		f.setLayout(null);
		f.setVisible(true);
		Button b= new Button("Name");
		f.add(b);
		b.setSize(20,20);

		public void WindowClosing(WindowEvent e) {
			
			f.dispose();
		}
		public static void main(String [] args)
		{
			new WindowExample();
		}
}

