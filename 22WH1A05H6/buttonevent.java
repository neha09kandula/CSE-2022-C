package csec;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class buttonevent extends WindowAdapter {

		Frame f;
	    buttonevent(){
	    	 f = new Frame("Colors");
	    	 f.setSize(1000,1000);
	         f.addWindowListener(this);
	         f.setVisible(true);
	         f.setLayout(null);
	    	 Button b1= new Button("Green");
	    	 f.add(b1);
	    	 b1.setBounds(200, 200,110, 90);
	    	 b1.setVisible(true);
	    	 Button b2=new Button("Yellow");
	    	 f.add(b2);
	    	 b2.setBounds(200, 300, 110, 90);
	    	 b2.setVisible(true);
	    	 Button b3 = new Button("Pink");
	    	 f.add(b3);
	    	 b3.setBounds(200, 400, 110, 90);
	    	 b3.setVisible(true); 	
	    }
		public void windowClosing(WindowEvent e)
	    {
	    	f.dispose();
	    }
		public static void main(String[] args) {

	        new buttonevent();

		}



	}
