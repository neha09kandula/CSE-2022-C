package csec;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class calculator1 extends WindowAdapter{
Frame f;
calculator1(){
f = new Frame("Calculator");
f.setSize(400,400);
        f.addWindowListener(this);
        f.setVisible(true);
        f.setLayout(new GridLayout(3,3));
        Label l1=new Label("Enter");
        f.add(l1);
        l1.setVisible(true);
        TextField t1=new TextField();
        f.add(t1);
        t1.setVisible(true);
        Button b1=new Button("1");
        f.add(b1);
        b1.setVisible(true);
        Button b2=new Button("2");
        f.add(b2);

b2.setVisible(true);

Button b3=new Button("3");

f.add(b3);

b3.setVisible(true);

Button b4=new Button("4");

f.add(b4);

b4.setVisible(true);

Button b5=new Button("5");

f.add(b5);

b5.setVisible(true);

Button b6=new Button("6");

f.add(b6);

b6.setVisible(true);

Button b7=new Button("7");

f.add(b7);

b7.setVisible(true);

Button b8=new Button("8");

f.add(b8);

b1.setVisible(true);

Button b9=new Button("9");

f.add(b9);

b9.setVisible(true);

Button b10=new Button("+");

f.add(b10);

b10.setVisible(true);

Button b11=new Button("-");

f.add(b11);

b11.setVisible(true);

Button b12=new Button("*");

f.add(b12);

b9.setVisible(true);

Button b13=new Button("/");

f.add(b13);

b13.setVisible(true);

Button b14=new Button("=");

f.add(b14);

b14.setVisible(true);

Button b15=new Button("C");

f.add(b15);

b15.setVisible(true);

Button b16=new Button("%");

f.add(b16);

b16.setVisible(true);

}

public void windowClosing(WindowEvent e) {

f.dispose();

}
public static void main(String[] args) {
new calculator1();
}
}
