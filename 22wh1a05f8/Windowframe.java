package javaprograms225f8;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Windowframe extends Frame{

	public Windowframe() {
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing( WindowEvent e)
			{
				dispose();
			}
				});
		//Frame f=new Frame();
		setSize(4000,4000);
		setBounds(300, 200, 300, 200);
		setLayout(null);
		setVisible(true);
		
	}
	public void paint(Graphics g)
	{
		g.drawRect(200, 500, 200, 500);
	}

	public static void main(String[] args) {
		new Windowframe();

	}

}
