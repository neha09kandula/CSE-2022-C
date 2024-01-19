import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class factorial extends Applet implements ActionListener {
    TextField t1,t2;
    Button a;
    Label l1,l2;

    public void init() {
        
        a = new Button("Compute");
	a.addActionListener(this);
        t1=new TextField(20);
        t2=new TextField(20);	
	l1=new Label("number");
	l2=new Label("result");
	
	add(l1);
	add(l2);
	add(t1);
	add(t2);
	add(a);
	
}
public void actionPerformed(ActionEvent e){
if(e.getSource()==a)
{
int a = Integer.parseInt(t1.getText());
int fact=1;
for(int i = 1;i<=a;i++)
fact*=i;
t2.setText(""+fact);
}
else{
t1.setText("");
t2.setText("");
}
}
}
