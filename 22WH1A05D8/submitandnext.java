package frame;
import java.awt.*;
import java.awt.event.*;

public class submitandnext  extends Frame{
      submitandnext() {
    	  Frame f = new Frame("helloframe");
    	  f.setSize(600, 600);
          f.setLayout(null);
          f.setVisible(true);
          
        Button a=new Button("Submit");
        Button b=new Button("Next");
        
        a.setBounds(200, 220, 100,30);
        b.setBounds(400, 220, 100, 30);
        
        a.setBackground(Color.orange);
        b.setBackground(Color.cyan);
          
        f.add(a);
        f.add(b);
        
        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	f.dispose();
            }
        });
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Frame f2=new Frame("new frame");
            	f2.setSize(400,400);
            	f2.setVisible(true);
            	Button c =new Button("button");
            	f2.add(c);
            	c.setBounds(190,200,80,50);
            	c.setBackground(Color.yellow);
            	c.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) {
            			f2.dispose();
            		}
            	});
            }
        });
 
    }

    public static void main(String[] args) {
        new submitandnext();
    }

}

