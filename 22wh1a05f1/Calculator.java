package cse225f1;
import java.awt.*;
import java.awt.event.*;

public class Calculator{
public static void main(String args[]) {
Myframe frame =new Myframe();

frame.setTitle("calculator");
frame.setVisible(true);
frame.setSize(700,700);
frame.setBackground(Color.white);

}
}
class Myframe extends Frame{
TextField t1,t2,t3;
Label l1,l2,l3;
Button b1,b2,b3,b4,b5,b6;
int n1,n2,res;

Myframe(){
this.setLayout(null);
t1=new TextField();
t1.setBounds(250,50,300,30);
t2=new TextField();
t2.setBounds(250,100,300,30);
t3=new TextField();
t3.setBounds(250,150,300,30);
this.add(t1);
this.add(t2);
this.add(t3);

l1=new Label("NUMBER 1");
l1.setBounds(50,50,100,30);
l2=new Label("NUMBER 2");
l2.setBounds(50,100,100,30);
l3=new Label("RESULT");
l3.setBounds(50,150,100,30);

add(l1);
add(l2);
add(l3);

b1=new Button("ADD");
b1.setBounds(200,400,70,30);
b2=new Button("SUB");
b2.setBounds(250,400,70,30);
b3=new Button("MUL");
b3.setBounds(300,400,70,30);
b4=new Button("DIVI");
b4.setBounds(350,400,70,30);
b5=new Button("CLEAR");
b5.setBounds(520,400,70,30);
b6=new Button("SUBMIT");
b6.setBounds(600,400,70,30);

add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);



}

}
