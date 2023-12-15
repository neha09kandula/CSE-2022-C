package frame;
import java.awt.*;
import java.awt.event.*;

public class radiobutton extends WindowAdapter{
	Frame f;
	Checkbox c1,c2,c3;
	Label l,l1,l2;
	radiobutton()
	{
		f=new Frame("Hello");
		f.addWindowListener(this);
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);
		
		c1=new Checkbox("Italic");
		c1.setBounds(50,70, 70, 50);
		f.add(c1);
		
		
		c2=new Checkbox("Bold");
		c2.setBounds(150, 70, 70, 50);
		f.add(c2);
		
		c3=new Checkbox("Underline");
		c3.setBounds(230, 70, 70, 50);
		f.add(c3);
		
		CheckboxGroup cbg=new CheckboxGroup();
		Checkbox R1 = new Checkbox("Yes", cbg, false);    
        R1.setBounds(440,70, 50,50); 
        f.add(R1);
        Checkbox R2 = new Checkbox("No", cbg, true);    
        R2.setBounds(500,70, 50,50); 
        f.add(R2);
        Checkbox R3 = new Checkbox("other", cbg, true);    
        R3.setBounds(550,70, 50,50); 
        f.add(R3);
	
        Choice c=new Choice();
        c.setBounds(140,130,80,90) ;
        f.add(c);
        c.add("English");
        c.add("Telugu");
        c.add("Tamil");
       
        l=new Label("Changes ");
        l.setAlignment(Label.CENTER);
        l.setSize(450, 480);
        f.add(l);
        
        l1=new Label();
        //l1.setAlignment(Label.LEFT);
        l1.setSize(450, 680);
        f.add(l1);
        c1.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) {                 
               l.setText("Italic "+ (e.getStateChange()==1?"true":"false")); 
               l1.setText("Bold "+ (e.getStateChange()==1?"true":"false")); 
            }    
         });    
	}
	public void windowClosing(WindowEvent e) {
			f.dispose();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new radiobutton();
	}
}
