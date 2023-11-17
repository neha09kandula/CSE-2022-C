package frame;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class closethewindow extends Frame {
	closethewindow(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
				});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
