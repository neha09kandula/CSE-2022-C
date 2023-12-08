package frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class window extends WindowAdapter {
	Frame f;
	window(){
		f = new Frame("Hello!!!");
		f.addWindowListener(this);
		f.setBounds(400, 300, 700, 600);
		f.setLayout(null);
		f.setVisible(true);
		Checkbox c1 = new Checkbox("Bold");   
        c1.setBounds(60, 40,  70, 50);
        f.add(c1);
        Checkbox c2 = new Checkbox("italic");
        c2.setBounds(160,40,70,50);
        f.add(c2);
        Checkbox c3= new Checkbox("Underline");
        c3.setBounds(300,40,70,50);
        f.add(c3);
        CheckboxGroup cbg = new CheckboxGroup();  
        Checkbox R1 = new Checkbox("Yes", cbg, false);    
        R1.setBounds(440,40, 50,50); 
        f.add(R1);
        Checkbox R2 = new Checkbox("No", cbg, true);    
        R2.setBounds(500,40, 50,50); 
        f.add(R2);
        Checkbox R3 = new Checkbox("other", cbg, true);    
        R3.setBounds(550,40, 50,50); 
        f.add(R3);
        TextField t1 = new TextField(" ");
        t1.setBounds(140, 200, 200, 20);
        f.add(t1);
        Label l1 = new Label("Current State:");
        l1.setBounds(60, 200, 200, 20);
        f.add(l1);
        Label l2= new Label("District :");
        l2.setBounds(80,230,60,20);
        f.add(l2);
        TextField t2 = new TextField(" ");
        t2.setBounds(140,230,200,20);
        f.add(t2);
	}
	
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	public static void main(String[] args) {
		new window();
	}
}
