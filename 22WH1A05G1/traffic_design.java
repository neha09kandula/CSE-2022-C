package cse225g1;
import java.awt.*;
import java.awt.event.*;
public class traffic extends Frame {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("Traffic");
		
		f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
		Label l = new Label("STOP..WAIT..GO..!");
		l.setFont(new Font("Arial", Font.BOLD, 52));
		f.add(l);
        l.setBounds(260,100,500,100);
		f.setSize(1000,1600);
		Button b1=new Button("STOP");
		b1.setFont(new Font("Arial", Font.BOLD, 22));
		b1.setBounds(170,790,150,100);
		f.add(b1);
		Button b2=new Button("WAIT");
		b2.setFont(new Font("Arial", Font.BOLD, 22));
		b2.setBounds(370,790,150,100);
		f.add(b2);
		Button b3=new Button("GO");
		b3.setFont(new Font("Arial", Font.BOLD, 22));
		b3.setBounds(570,790,150,100);
		f.add(b3);
		f.add(new MyComponent());
		f.setVisible(true);
	}
	static class MyComponent extends Component{
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(350, 300, 100, 390);
		g.setColor(Color.RED);
		g.fillOval(360, 370, 80, 80);
		g.setColor(Color.YELLOW);
		g.fillOval(360, 470, 80, 80);
		g.setColor(Color.GREEN);
		g.fillOval(360, 570, 80, 80);		
	}
	}
}
