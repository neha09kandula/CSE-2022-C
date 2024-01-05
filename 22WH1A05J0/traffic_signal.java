package priyanka;
import java.awt.*;
import java.awt.event.*;
public class traffic_signal extends Frame{
	
	 protected static final Color Black = null;


	traffic_signal(){
		
		 setVisible(true);
		 setLayout(null);
		 setSize(500,600);
		 
		 Button b= new Button("Red");
		 b.setBounds(200, 100, 100, 50); 
		 add(b);
		 Button b1= new Button("Yellow");
		 b1.setBounds(300,100,100,50);
		 add(b1);
		 Button b2= new Button("Green");
		 b2.setBounds(400,100,100,50);
		 add(b2);
		 

		 b.addActionListener(new ActionListener()
				 {
			       public void actionPerformed(ActionEvent e)
			       {
			    	   
			    	   
			    	   repaintOvals(Color.RED);
			       }
				 });
			 
		 b1.addActionListener(new ActionListener()
		 {
	       public void actionPerformed(ActionEvent e)
	       {
	    	 
			
			 repaintOvals(Color.YELLOW);
	       }
		 });
		 b2.addActionListener(new ActionListener()
		 {
	       public void actionPerformed(ActionEvent e)
	       {
	    	   
	    	   repaintOvals(Color.GREEN);
	       }
		 });
		 
		 addWindowListener(new WindowAdapter()
				 {
			 public void windowClosing(WindowEvent e)
			 {
				 System.exit(0);
			 }
				 });
	 }
	
		 public void paint(Graphics g)
		 {
			  
			    super.paint(g);
			    g.setColor(Color.gray);
			    g.fillRect(100, 200, 300, 500);
			    g.setColor(Color.BLACK);
		        g.fillOval(200, 200, 100, 100);
		        g.setColor(Color.BLACK);
		        g.fillOval(200, 400, 100, 100);
		        g.setColor(Color.BLACK);
		        g.fillOval(200, 600, 100, 100);
		 }	
		 private void repaintOvals(Color color) {
		        repaint(); 
		    }
		
 
public static void main(String args[])
{
	new traffic_signal();
}
}
