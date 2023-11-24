package Frames;
import java.awt.*;
import java.awt.event.*;

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

public class ButtonEvent{
       
   
   ButtonEvent(){
		final Frame f = new Frame("Frame1");
	    f.setSize(500, 600);
        f.setBounds(500, 600, 500, 600);
        f.setLayout(null);
        f.setVisible(true);
        Button blackButton=new Button("Black");
		Button redButton=new Button("Red");		
		Button blueButton=new Button("blue");
		
	
		blackButton.setBounds(100, 100, 150, 80);
        redButton.setBounds(100, 200, 150, 80);
        blueButton.setBounds(100, 300, 150, 80);
        
		f.add(blackButton);
		f.add(redButton);
		f.add(blueButton);
		
//action if we click on button color changes
		blackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.setBackground(Color.black);
			}
		});
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.setBackground(Color.red);
			}
		});
		
		blueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				f.setBackground(Color.CYAN);
			}
		});
		
//method 2:
		/*
		class actionPerformed(ActionEvent ae)
		{
			String str =ae.getActionCommand();
			if(str.equals("Yellow"))this.setBackground(Color.YELLOW);
			if(str.equals("blue"))this.setBackground(Color.BLUE);
			if(str.equals("pink"))this.setBackground(Color.PINK);
		}
		private void setBackground(Color yellow) {
			// TODO Auto-generated method stub
			
		}
		*/
		
		
	        f.addWindowListener(new MyWindowAdapter());
	    }


public static void main(String args[]) {
    new ButtonEvent();
}
}
