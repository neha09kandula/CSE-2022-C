package cse225d7;
import java.awt.*;
import java.awt.event.*;


public class page extends Frame  {
	Button submitButton,nextButton;
	
	public page() {
		setTitle("page");
        setSize(400, 400);
        setLayout(null);
        submitButton = new Button("submit");
        submitButton.setBackground(Color.lightGray);
        submitButton.setBounds(130, 190, 50,40);
        add(submitButton);
        
        
        nextButton = new Button("next");
        nextButton.setBackground(Color.lightGray);
        nextButton.setBounds(200, 190, 50, 40);
        add(nextButton);
        
        
        
        
		submitButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	dispose();
	        }
	    });
		
		 addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	            dispose();
	        }
	    });

    setVisible(true);
   }
	public static void main(String[] args) {
		 new page();
	  
		// TODO Auto-generated method stub

	}

}
