package java22wh1a05d2;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
 
class MyButton extends Frame{
	Button b1,b2,b3;
	MyButton(){
		b1 = new Button("pink");
		b2 = new Button("yellow");
		b3 = new Button("blue");
		b1.setBounds(100,50,80,40);
		b2.setBounds(50,200,70,90);
		b3.setBounds(20,30,10,50);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
  public void actionPerformed(ActionEvent ae) {	
		    String str = ae.getActionCommand();
	    	if(str.equals("Yellow"))this.setBackground(Color.yellow);
		    if(str.equals("Blue"))this.setBackground(Color.blue);
	    	if(str.equals("Pink"))this.setBackground(Color.pink);
		
        }
}
}

public class Button_event {
	public static void main(String[]args) {
		 MyButton f = new MyButton();
	        f.setVisible(true);
	        f.setSize(500, 500);
	        f.addWindowListener(new MyClass());
	    }
	}

	class MyClass extends WindowAdapter {
	    public void windowClosing(WindowEvent we) {
	        System.exit(0);
	    }
	}
