package cse225i6;

	import java.awt.*;
	import java.awt.event.*;
	public class calculator extends WindowAdapter{
	   private Frame f;

	   public calculator() {
	       f = new Frame("Hello Frame");
	       f.setSize(500, 500);
	       f.setBounds(30, 60, 500, 500);
	       f.setLayout(null);
	       f.setVisible(true);
	       f.addWindowListener(this);
	       f.setBackground(Color.white);
	       
	       
	       Label l = new Label("CALCULATOR");
	       f.add(l);
	       l.setSize(200,40);
	       l.setBounds(190,40,100,40);
	       l.setVisible(true);
	       
	       
	      
	       
	       Button b1 = new Button("1");
	       f.add(b1);
	       b1.setSize(100,100);
	       b1.setBounds(30,130,80,80);
	       b1.setVisible(true);
	       b1.setBackground(Color.lightGray);
	       
	       
	       Button b2 = new Button("2");
	       f.add(b2);
	       b2.setSize(100,100);
	       b2.setBounds(130,130,80,80);
	       b2.setVisible(true);
	       b2.setBackground(Color.lightGray);
	       
	       Button b3 = new Button("3");
	       f.add(b3);
	       b3.setSize(100,100);
	       b3.setBounds(230,130,80,80);
	       b3.setVisible(true);
	       b3.setBackground(Color.lightGray);
	       
	       Button b4 = new Button("4");
	       f.add(b4);
	       b4.setSize(100,100);
	       b4.setBounds(30,230,80,80);
	       b4.setVisible(true);
	       b4.setBackground(Color.lightGray);
	       
	       Button b5 = new Button("5");
	       f.add(b5);
	       b5.setSize(100,100);
	       b5.setBounds(130,230,80,80);
	       b5.setVisible(true);
	       b5.setBackground(Color.lightGray);
	       
	       Button b6 = new Button("6");
	       f.add(b6);
	       b6.setSize(100,100);
	       b6.setBounds(230,230,80,80);
	       b6.setVisible(true);
	       b6.setBackground(Color.lightGray);
	       
	       Button b7 = new Button("7");
	       f.add(b7);
	       b7.setSize(100,100);
	       b7.setBounds(30,330,80,80);
	       b7.setVisible(true);
	       b7.setBackground(Color.lightGray);
	       
	       Button b8 = new Button("8");
	       f.add(b8);
	       b8.setSize(100,100);
	       b8.setBounds(130,330,80,80);
	       b8.setVisible(true);
	       b8.setBackground(Color.lightGray);
	       
	       Button b9 = new Button("9");
	       f.add(b9);
	       b9.setSize(100,100);
	       b9.setBounds(230,330,80,80);
	       b9.setVisible(true);
	       b9.setBackground(Color.lightGray);
	       
	       Button bPlus = new Button("+");
	       f.add(bPlus);
	       bPlus.setSize(100,100);
	       bPlus.setBounds(330,140,60,60);
	       bPlus.setVisible(true);
	       bPlus.setBackground(Color.lightGray);
	       
	       Button bMinus = new Button("-");
	       f.add(bMinus);
	       bMinus.setSize(100,100);
	       bMinus.setBounds(410,140,60,60);
	       bMinus.setVisible(true);
	       bMinus.setBackground(Color.lightGray);
	       
	       Button bMul = new Button("*");
	       f.add(bMul);
	       bMul.setSize(100,100);
	       bMul.setBounds(330,240,60,60);
	       bMul.setVisible(true);
	       bMul.setBackground(Color.lightGray);
	       
	       Button bDiv = new Button("/");
	       f.add(bDiv);
	       bDiv.setSize(100,100);
	       bDiv.setBounds(410,240,60,60);
	       bDiv.setVisible(true);
	       bDiv.setBackground(Color.lightGray);
	       
	       Button beq = new Button("=");
	       f.add(beq);
	       beq.setSize(100,100);
	       beq.setBounds(330,340,120,60);
	       beq.setVisible(true);
	       beq.setBackground(Color.lightGray);
	       
	       TextField t = new TextField("");
	       f.add(t);
	       t.setSize(300,30);
	       t.setBounds(200,80,270,30);
	       t.setVisible(true);
	       t.setBackground(Color.lightGray);
	   }

	   public void windowClosing(WindowEvent e) {
	       f.dispose();
	   }

	   public static void main(String[] args) {
	       new calculator();
	   }
	}



