package javaprograms;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
public class Buttons extends Frame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button green, blue,pink;
	public Buttons() {
		setTitle("page");
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        green = new Button("green");
        blue = new Button("blue");
        pink = new Button("pink");
        
        green.setBounds(130, 130, 50,40);
        add(green);
        blue.setBounds(130, 180, 50,40);
        add(blue);
        pink.setBounds(130, 230, 50,40);
        add(pink);
        
        green.addActionListener(this);
        blue.addActionListener(this);
        pink.addActionListener(this);     
        addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	            System.exit(0);
	        }
	    });
	}
	    public void actionPerformed(ActionEvent ae) {
	        	String str=ae.getActionCommand();
	    		if(str.equals("green"))this.setBackground(Color.green);
	    		if(str.equals("blue"))this.setBackground(Color.blue);
	    		if(str.equals("pink"))setBackground(Color.pink);
	        } 
	public static void main(String[] args) {
		 new Buttons();
		// TODO Auto,-generated method stub
	}
}