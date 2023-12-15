package cse225d2;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

public class operations extends Frame implements ActionListener{
TextField txt1;
TextField txt2;
Label l1, l2, l3 , l4 , l5, l6;
Button b;

operations(){
setTitle("AWT Operations");
setSize(1000,600);
setLayout(null);
setVisible(true);

l1 = new Label("Enter The Value 1 : ");
l1.setBounds(10, 50, 100, 30);

txt1 = new TextField();
txt1.setBounds(150, 50, 250, 30);

l2 = new Label("Enter The Value 2 : ");
l2.setBounds(10, 100, 100, 30);

txt2 = new TextField();
txt2.setBounds(150, 100, 250, 30);

b = new Button("Click Me");
b.setBounds(150, 150, 100, 30);
b.addActionListener(this);

l3 = new Label("--");
l3.setBounds(10, 200, 300, 30);
l4 = new Label("--");
l4.setBounds(10, 300, 300, 30);
l5 = new Label("--");
l5.setBounds(10, 400, 300, 60);
l6 = new Label("--");
l6.setBounds(10, 500, 300, 70);


add(l1);
add(txt1);

add(l2);
add(txt2);
add(b);
add(l3);
add(l4);
add(l5);
add(l6);


this.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent we) {
System.exit(0);

}

});
}
@Override
public void actionPerformed(ActionEvent e) {
	String s1 = txt1.getText();
	String s2 = txt2.getText();
	if(s1.isEmpty() || s2.isEmpty()) {
		
		l3.setText("Please Enter The data");
		}else {
			int a = Integer.parseInt(s1);
			int b = Integer.parseInt(s2);
			int c = a+b;
			int d = a-b;
			int i = a*b;
			int f = a/b;
			String s = String.valueOf(c);
			l3.setText("Addition :"+s);
			String v = String.valueOf(d);
			l4.setText("Subtraction :"+v);
			String t = String.valueOf(i);
			l5.setText("Multiplication :"+t);
			String q = String.valueOf(f);
			l6.setText("division :"+q);
			}
	
}

public static void main(String[] args) {
new operations();
}

}