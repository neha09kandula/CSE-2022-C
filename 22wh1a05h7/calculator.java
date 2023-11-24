package Frames;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class calculator extends WindowAdapter{   
			 Frame f;    
			   calculator() {    
			     f = new Frame("Calculator");    
			     f.addWindowListener (this);
			     f.setSize(1400,1400);
			     f.setVisible(true);
			     Label l=new Label("Input");
			     f.add(l);
			     l.setBounds(300, 350, 100, 800);
			     TextField t=new TextField();
			     f.add(t);
			     Label l1=new Label("Result : ");
			     f.add(l1);
			     l1.setBounds(300, 350, 50, 80);
			     TextField t1=new TextField();
			     f.add(t1);
			     t1.setBounds(300, 350, 50, 80);
			     Label l2=new Label(" ");
			     f.add(l2);
			     t.setBounds(200, 300, 0, 10);
			     f.setLayout(new GridLayout(4,4));
			    
			     Button b1=new Button("0");
			     f.add(b1);
			     b1.setBounds(100, 200, 80, 90);
			     Button b2=new Button("1");
			     f.add(b2);
			     Button b3=new Button("2");
			     f.add(b3);
			     Button b4=new Button("3");
			     f.add(b4);
			     Button b5=new Button("4");
			     f.add(b5);
			     Button b6=new Button("5");
			     f.add(b6);
			     Button b7=new Button("6");
			     f.add(b7);
			     Button b8=new Button("7");
			     f.add(b8);
			     Button b9=new Button("8");
			     f.add(b9);
			     Button b10=new Button("9");
			     f.add(b10);
			     Button b11=new Button("+");
			     f.add(b11);
			     Button b12=new Button("--");
			     f.add(b12);
			     Button b13=new Button("/");
			     f.add(b13);
			     Button b14=new Button("*");
			     f.add(b14);
			     Button b15=new Button("=");
			     f.add(b15);
			     
			   }    
			public void windowClosing (WindowEvent e) {    
			 f.dispose();    
			}    
			public static void main(String[] args) {    
			 new calculator();
			}    
}
