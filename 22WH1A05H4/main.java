package Frames;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;


public class main extends WindowAdapter  {
   Frame f;
   main(){
	   f=new Frame("Welcome");
	   f.addWindowListener(this);
	   f.setBounds(600,500,600,700);
	   f.setLayout(null);
	   f.setVisible(true);
	   Checkbox c1= new Checkbox("Telugu");
	   f.add(c1);
	   c1.setVisible(true);
	   c1.setBounds(50, 60, 50, 50);
	   Checkbox c2= new Checkbox("Hindi");
	   f.add(c2);
	   c2.setBounds(200, 60, 50, 50);
	   Checkbox c3= new Checkbox("Urdu");
	   f.add(c3);
	   c3.setBounds(300, 60, 50, 50);
	   Checkbox c4= new Checkbox("Marati");
	   f.add(c4);
	   c4.setBounds(400, 60, 50, 50);
	   Label l1= new Label("Current State:");
	   f.add(l1);
	   l1.setBounds(50, 150, 80, 20);
	   TextField t1=new TextField();
	   f.add(t1);
	   t1.setBounds(150, 150, 160, 20);
	   CheckboxGroup cbg = new CheckboxGroup();
	   Checkbox R1= new Checkbox("Yes",cbg,true);
	   R1.setBounds(500, 60, 50, 50);
	   f.add(R1);
	   Checkbox R2= new Checkbox("No",cbg,true);
	   R2.setBounds(550, 60, 50, 50);
	   f.add(R2);
	   
   }
   public void windowClosing(WindowEvent e)
   {
	   f.dispose();
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new main();
	}

}
