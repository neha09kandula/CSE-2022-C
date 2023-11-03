package frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import frames.firstframejava.MyComponent;

public class message extends Frame {
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
	Font f=new Font("Arial",Font.BOLD+Font.ITALIC,0);
	g.setFont(f);
	g.setColor(getBackground());
}


public static void main(String[] args) {
			Frame f=new Frame("My first frame");
			f.setSize(400,300);
			f.setBounds(100,50,400,300);
			f.add(new MyComponent());
			f.setVisible(true);
		}
}