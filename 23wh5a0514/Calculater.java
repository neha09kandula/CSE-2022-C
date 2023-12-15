package le514;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Calculater extends WindowAdapter {
Calculater(){
Frame f=new Frame();
f.setVisible(true);
f.setSize(500,500);
f.setLayout(null);
f.setBounds(700,800,90,10);

Button b1=new Button("ADD");
f.add(b1);
b1.setSize(50,50);
b1.setVisible(true);
b1.setBounds(500,600,70,80);

Button b2=new Button("MUL");
f.add(b2);
b2.setVisible(true);
b2.setSize(50,50);
b2.setBounds(100,200,70,80);


Button b3=new Button("SUB");
f.add(b3);
b3.setVisible(true);
b3.setSize(50,50);
b3.setBounds(100,200,70,80);



Button b4=new Button("DIV");
f.add(b4);
b4.setSize(50,50);
b4.setVisible(true);
b4.setBounds(100,200,70,80);
}


public void windowClosing(WindowEvent e) 
{
	System.exit(0);
}
public static void main(String args[])
{
new Calculater();
}
}

