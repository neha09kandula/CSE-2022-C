package frames;
import java.awt.*;
import java.awt.TextField;
import java.awt.event.*;
public class Regristration_form extends WindowAdapter
{
Frame f;
Regristration_form()
{
   f = new Frame("Hello Frame");
   f.addWindowListener(this);
f.setSize(500, 500);
f.setBounds(120, 200, 500, 500);
f.setLayout(null);
f.setVisible(true);
Label L = new Label("Name");
f.add(L);
L.setSize(130, 150);
L.setVisible(true);
Button b = new Button("Submit");
f.add(b);
b.setSize(150, 210);
b.setBounds(350, 360, 120, 60);
b.setVisible(true);
Button b1=new Button("close");
f.add(b1);
b1.setSize(120,200);
b1.setBounds(100,200,100,200);
b1.setVisible(true);
TextField t=new TextField("entre your text");
f.add(t);
//t.setSize(10,20);
t.setSize(200,60);
t.setBounds(150,90,150,90);
t.setVisible(true);
}
public void windowClosing(WindowEvent e)
  {
 f.dispose();
  }
public static void main(String args[])
{
new Regristration_form();
}
}


