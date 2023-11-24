package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class calculater extends WindowAdapter {
	Frame f;
	calculater() {
		f= new Frame("Calculater");
		f.addWindowListener(this);
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new GridLayout(4,4));
		TextField t1 = new TextField();
		f.add(t1);
		TextField t2 = new TextField();
		f.add(t2);
		TextField t3 = new TextField();
		f.add(t3);
		TextField t4 = new TextField();
		f.add(t4);
		Button bc= new Button("C");
		f.add(bc);
		Button b1= new Button("1");
		f.add(b1);
		b1.setSize(20,30);
		Button b2= new Button("2");
		f.add(b2);
		Button b3= new Button("3");
		f.add(b3);
		Button ba = new Button("+");
		f.add(ba);
		Button bs = new Button("-");
		f.add(bs);
		Button b4= new Button("4");
		f.add(b4);
		Button b5= new Button("5");
		f.add(b5);
		Button b6= new Button("6");
		f.add(b6);
		Button bm = new Button("*");
		f.add(bm);
		Button bd= new Button("/");
		f.add(bd);
		Button b7= new Button("7");
		f.add(b7);
		Button b8= new Button("8");
		f.add(b8);
		Button b9= new Button("9");
		f.add(b9);
		Button b0= new Button("0");
		f.add(b0);
		Button bi= new Button("=");
		f.add(bi);
		
		
	}
	public void windowClosing (WindowEvent e) {
		f.dispose();
	}
	public static void main(String[] args) {
		new calculater();
	}

}
