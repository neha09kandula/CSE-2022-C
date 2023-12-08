package cse2022;
import java.awt.*;
import java.awt.event.*;

public class submit extends Frame {
	Button submitButton,nextButton;
	
	public submit() {
		setTitle("page");
        setSize(400, 400);
        setLayout(null);
        submitButton = new Button("submit");
        submitButton.setBackground(Color.lightGray);
        submitButton.setBounds(130, 190, 50,40);
        add(submitButton);
        dispose();
        
        nextButton = new Button("next");
        nextButton.setBackground(Color.lightGray);
        nextButton.setBounds(200, 190, 50, 40);
        add(nextButton);

		submitButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	dispose();
	        }
	    });
		nextButton.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	Frame f2 = new Frame();
	        	f2.setSize(400,400);
	        	f2.setVisible(true);
	        	f2.setTitle("Second Frame");
	            Label l2 = new Label("hello ! how are you");
	        	f2.add(l2);
	        	l2.setBounds(1,5,190,90);
	        	Button c =new Button("close");
            	f2.add(c);
            	c.setBounds(10,20,30,40);
            	c.setBackground(Color.yellow);
            	c.addActionListener(new ActionListener() {
            		public void actionPerformed(ActionEvent e) {
            			f2.dispose();
            		}
            	});
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
		new submit();
		// TODO Auto-generated method stub

	}

}
