package cse5e3;
import java.awt.*;
import java.awt.event.*;
public class buttonevent extends Frame{

		    Button b1,b2,b3;
		    
		    public buttonevent() {
		        setTitle("ButtonEvent");
		        setSize(400, 400);
		        setLayout(null);
		        
		        
		        b1 = new Button("YELLOW");
		        b2=  new Button("BLUE");
		        b3=  new Button("PINK");
		        b1.setBounds(50, 100, 150, 50);
		        b2.setBounds(50, 200, 150, 50);
		        b3.setBounds(50, 300, 150, 50);
		        add(b1);
		        add(b2);
		        add(b3);
		      

		        b1.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	setBackground(Color.yellow);
		            }
		        });
		        
		        b2.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	setBackground(Color.BLUE);
		            }
		        });
		        
		        b3.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		            	setBackground(Color.PINK);
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
		        new buttonevent();
		    }

	}
