package cse513;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Traffic {
	Button b1,b2,b3;
	Traffic(){
		Frame f = new Frame("Hello Frame");
		f.setSize(500,500);
		f.setBounds(30,60,70,120);
		f.setVisible(true);
		f.setLayout(null);
		
		b1 = new Button("RED");
		b2 = new Button("Yellow");
		b3 = new Button("Green");
		
		b1.setBounds(200,150,150,200);
		b2.setBounds(350,150,150,200);
		b3.setBounds(500,150,150,200);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);	
		f.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent e) {
	System.exit(0);
}
	
	});
	}
  public void paint(Graphics g) {
	  
         g.setColor(Color.gray);
         g.fillRect(100, 200, 300, 500);
         g.setColor(Color.BLACK);
         g.fillOval(200, 200, 100, 100);
         g.setColor(Color.BLACK);
         g.fillOval(200, 400, 100, 100);
         g.setColor(Color.BLACK);
         g.fillOval(200, 600, 100, 100);
	     g.fillOval(100, 150, 150, 200);
	  }

public static void main(String[] args) {
	new Traffic();
}
}
