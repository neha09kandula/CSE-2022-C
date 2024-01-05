package frames;
import java.awt.*;
import java.awt.event.*;

	public class trafficlights extends Frame {
		 TextField textField;
		 trafficlights() {
	        Frame f = new Frame("TrafficLights"); 
	        f.setSize(500, 500);
	        f.setBounds(500, 200, 500, 500);
	        f.setLayout(null); 
	        f.setVisible(true);
	        
	        Button a = new Button("GREEN");
	        f.add(a);
	        a.setBounds(200, 100, 80, 30);
	        a.setBackground(Color.GREEN);
	        
	        
	        Button b = new Button("ORANGE"); 
	        f.add(b);
	        b.setBounds(200, 150, 80, 30); 
	        b.setBackground(Color.ORANGE);
	        
	        
	        Button c = new Button("RED"); 
	        f.add(c);
	        c.setBounds(200, 200, 80, 30);
	        c.setBackground(Color.RED);
	        
	        textField = new TextField();
	        f.add(textField);
	        textField.setBounds(180, 250, 130, 30);
	        textField.setEditable(false);
	        
	        
	        a.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                textField.setText("GO");
	            }
	        });
	        
	        
	        b.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                textField.setText("WAIT AND PROCEED");
	            }
	        });
	        
	        
	        c.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                textField.setText("STOP");
	            }
	        });

	        
	        f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                f.dispose();
	            }
	        });
	    }

	    public static void main(String[] args) {
	        new trafficlights(); 
	    }
	}
