package frames;
import java.awt.*;
import java.awt.event.*;

public class b extends WindowAdapter {
	    private Frame f;
	    CheckboxGroup menu;
	    Choice ch;

	    public b() {
	        f = new Frame("Hello Frame");
	        f.setSize(1000, 1000);
	        f.setBounds(30, 60, 800, 600);
	        f.setLayout(null);
	        f.setVisible(true);
	        f.addWindowListener(this);
	        f.setBackground(Color.GRAY);
	        Label l = new Label("Radiobutton");
	        f.add(l);
	        l.setSize(200,200);
	        l.setBounds(300,30,300,30);
	        l.setVisible(true);
	        Checkbox c1 = new Checkbox();
	        f.add(c1);
	        c1.setSize(10,10);
	        c1.setBounds(100,100,10,30);
	        c1.setVisible(true);
	        Label l12 = new Label("BOLD");
	        f.add(l12);
	        l12.setSize(100,100);
	        l12.setBounds(115,100,50,30);
	        l12.setVisible(true);
	        Checkbox c2= new Checkbox();
	        f.add(c2);
	        c2.setSize(10,10);
	        c2.setBounds(200,100,10,30);
	        c2.setVisible(true);
	        Label l13 = new Label("ITALIC");
	        f.add(l13);
	        l13.setSize(100,100);
	        l13.setBounds(215,100,50,30);
	        l13.setVisible(true);
	        Checkbox c3= new Checkbox();
	        f.add(c3);
	        c3.setSize(10,10);
	        c3.setBounds(300,100,10,30);
	        c3.setVisible(true);
	        Label l14 = new Label("UnderLine");
	        f.add(l14);
	        l14.setSize(100,100);
	        l14.setBounds(315,100,50,30);
	        l14.setVisible(true);
	        menu = new CheckboxGroup();
	        
	    }

	    public void windowClosing(WindowEvent e) {
	        f.dispose();
	    }

	    public static void main(String[] args) {
	        new b();
	    }
	}
