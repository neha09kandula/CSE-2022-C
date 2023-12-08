package cse5h8;
import java.awt.*;
import java.awt.event.*;
public class frame extends WindowAdapter{
    Frame f;

   public frame() {
       f = new Frame("Hello Frame");
       f.setSize(500, 500);
       f.setBounds(30, 60, 500, 500);
       f.setLayout(null);
       f.setVisible(true);
       f.addWindowListener(this);
       f.setBackground(Color.lightGray);
       
       
       Label l = new Label("CHECKBOX and DROPDOWNS");
       f.add(l);
       l.setSize(300,40);
       l.setBounds(150,40,250,40);
       l.setVisible(true);
       
       
       Checkbox c1 = new Checkbox("CSE");
       f.add(c1);
       c1.setBounds(30,80,50,50);
       
       Checkbox c2 = new Checkbox("AIML");
       f.add(c2);
       c2.setBounds(100,80,50,50);
       
       Checkbox c3 = new Checkbox("IT");
       f.add(c3);
       c3.setBounds(170, 80, 100, 50);
       	
       //Checkboxes are used to create radiobuttons.
       //we can select only one radiobutton when a group of radiobuttons are created using checkboxgroup
   		Checkbox r1, r2;
   		CheckboxGroup cbg;
		cbg = new CheckboxGroup(); 
		r1 = new Checkbox("SEC-A",cbg,false);
		r1.setBounds(30, 130, 70, 50);
		r2 = new Checkbox("SEC-B",cbg,false);
		r2.setBounds(100, 130, 70, 50);
		f.add(r1);
		f.add(r2);
		// dropdown button
		Choice ch;
		ch = new Choice();
		ch.add("JAVA");
		ch.add("C");
		ch.add("PYTHON");
		ch.add("C++");
		ch.setBounds(30,200,70,70);
		f.add(ch);
       
       
       
       
     
   }

   public void windowClosing(WindowEvent e) {
       f.dispose();
   }

   public static void main(String[] args) {
       new frame();
   }
}
