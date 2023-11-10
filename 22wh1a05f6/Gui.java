
package csec2022;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import cse22592.MyClass;
import cse22592.TestGui;
public class Gui {
      public static void main(String[]args) {
    	  Frame f=new Frame("My first frame");
    		  f.setSize(700,700);
    		  f.add(new MyComponent()); 
    	      f.setVisible(true);//till this line we just created a frame
    	                         //we can't remove the frame
    	                                     
    	                                   //action listeners are used to close the frame
      }
       static class MyComponent extends Component{
       public void paint(Graphics g) {
    	   //g.drawRect(10,10,340,540);
    	   //g.drawOval(10, 10, 340, 540);
    	  // g.fillOval(90, 10, 340, 540);
    	  // g.drawOval(10, 250,75,50);
    	   //g.drawLine(0, 0, 100, 90);
    	  // g.drawLine(0, 90, 100, 10);
    	  // g.drawLine(40, 25,250, 80);
    	  // g.drawRect(10,150,60,50);
    	   //g.fillRect(100,150,60,50);
    	  // g.drawRoundRect(190,150,60,50,15,15);
    	   //g.fillRoundRect(280,150,60,50,30,40);
    	   g.drawRect(10,10,630,540);
    	   g.drawOval(10,10,150,150);
    	   g.drawRect(200,280,350,260);
    	   
      
    	
       }
       }
}
public class GUI {
    public static void main(String[] args) {
   	     Frame f= new Frame();
			 f.setVisible(true);
	         f.setSize(400, 200);
	         f.addWindowListener(new MyClass());
    }

}
	class MyClass extends WindowAdapter{
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	}

