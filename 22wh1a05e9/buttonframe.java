package frames;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
public class buttonframe extends Frame{
  public Frame frame,frame1;
   buttonframe(){
	frame1=new Frame();
	frame1.setTitle("1stFrame");
	frame1.setSize(600,600);
	frame1.setLayout(null);
	frame1.setVisible(true);
	
	 frame1.addWindowListener(new WindowAdapter() {

         public void windowClosing(WindowEvent e) {

            frame1.dispose();

         }

     });
   
    Button b1=new Button("NEXT");
    b1.setBounds(100,90,100,50);
    b1.setBackground(Color.GREEN);
    
    b1.setVisible(true);
    frame1.add(b1);
    Button b2=new Button("CLOSE");
    b2.setBounds(250,90,100,50);
    
    b2.setBackground(Color.RED);
    b2.setVisible(true);
    frame1.add(b2);
    
    b1.addActionListener(new ActionListener()
    		{
    	public void actionPerformed(ActionEvent e)
    	{
    		frame=new Frame();
    		frame.setTitle("New Frame");
    		frame.setSize(500,500);
    		frame.setLayout(null);
    		frame.setVisible(true);
    		
            Button b3=new Button("WELCOME");
            b3.setBounds(180, 200, 150, 70);
            b3.setBackground(Color.PINK);
            b3.setVisible(true);
            frame.add(b3);
    		 frame.addWindowListener(new WindowAdapter() {

    	         public void windowClosing(WindowEvent e) {

    	            frame.dispose();

    	         }

    	     });
    		
    	}
    		});
    
    b2.addActionListener(new ActionListener()
    		{
    	      public void actionPerformed(ActionEvent e)
    	      {
    	    	

    	    	            System.exit(0);
    	      }

    	    	         

    	    	  

    		});
    
    }

  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new buttonframe();
  
	}


}