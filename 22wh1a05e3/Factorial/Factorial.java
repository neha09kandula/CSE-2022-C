import java.awt.*;
import java.applet.Applet;
import java.awt.Event;
import java.awt.event.ActionEvent; //because we're using this to listen to the buttons
import java.awt.event.ActionListener;
@SuppressWarnings({ "unused", "deprecation", "removal", "serial" })
public class Factorial extends Applet implements ActionListener
{
Button b1,b2;
Label l1,l2;
TextField t1,t2;
public void init()
{
b1 = new Button("Compute");
b1.addActionListener(this);
b2 = new Button("Clear");
b2.addActionListener(this);
t1=new TextField(20);
t2=new TextField(20);
l1=new Label("NUMBER");
l2=new Label("RESULT");
add(l1);
add(t1);
add(l2);
add(t2);
add(b1);
add(b2);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1) {//if we're getting the source from b1 then use it
int n=Integer.parseInt(t1.getText());
// transforms string into integer
int fact=1;
for (int i=1;i<=n;i++) {
fact*=i;
t2.setText(""+fact);
}
}
else { // if any other button other than b1 is being clicked it keeps the textfields empty with this or clear
t1.setText("");
t2.setText("");
}
}
}