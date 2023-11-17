package frame;
import java.awt.*;
import java.awt.event.WindowAdapter;

public class EventHandling extends WindowAdapter {
	EventHandling(){
		Frame f=new Frame("Student Profile");
		f.setSize(500,500);
		f.setBounds(200, 100, 50, 80);
		f.setLayout(null);
		f.setVisible(true);
		Button b=new Button("Submit");
		f.add(b);
		b.setSize(50, 50);
		b.setLayout(null);
		public void windowClosing(windowEvent e)
		{
			f.dispose();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventHandling();

	}

}
