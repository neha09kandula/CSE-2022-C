import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Fact extends Applet implements ActionListener {
Button b1,b2;
Label l1,l2;
Textfield tf1,tf2;
public void init()
{
b1=new Button("COMPUTE");
b1.addActionListener(this);
tf1= new Textfield(20);
tf2=new Textfield(20);
l1=new Label("NUMBER");
l2=new Label("RESULT");
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
add(b2);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int a=Integer.parseInt(tf1.getText());
int fact=1;
for(int i=1; i<=a;i++)
fact*=i;
tf2.SetText(""+fact);
}
else
{
tf1.SetText("");
tf2.SetText("");
}
}
}


