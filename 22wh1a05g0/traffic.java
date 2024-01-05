package cse_225g0;
import java.util.*;

import cse_225g0.t.MyComponent;

import java.awt.*;
import java.awt.event.*;
public class traffic extends Frame {

	public static void main(String[] args) {
		Frame f = new Frame("Traffic");
		f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
		f.setSize(900,900);
		f.setLayout(null);
		Button b1=new Button("Stop");
		b1.setBounds(100,200,150,100);
		f.add(b1);
		Button b2=new Button("wait");
		b2.setBounds(300,200,150,100);
		f.add(b2);
		Button b3=new Button("Go");
		b3.setBounds(500,200,150,100);
		f.add(b3);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
		public void draw(Graphics g) {
			g.setColor(Color.RED);
			g.fillOval(360, 570, 80, 80);
		}
	}

}
