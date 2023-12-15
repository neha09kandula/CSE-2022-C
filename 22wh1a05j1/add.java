package cseakshaya;


import java.awt.*;
import java.awt.event.*;
public class add extends Frame implements ActionListener
{
Label l1,l2,l3,l4;
TextField txt1,txt2;
Button add,sub,mul,div,mod,clear;
public add()
{
//super("Calculator");
setSize(500,500);
setLayout(null);
setVisible(true);
l1=new Label("Enter value 1 :");
l1.setBounds(50,50,150,30);

txt1=new TextField();
txt1.setBounds(250,50,150,30);

l2=new Label("Enter value 2 :");
l2.setBounds(50,100,150,30);

txt2=new TextField();
txt2.setBounds(250,100,150,30);

add=new Button("ADD");
add.setBounds(50,150,100,30);
add.addActionListener(this);;

sub=new Button("SUB");
sub.setBounds(150,150,100,30);
sub.addActionListener(this);

mul=new Button("MUL");
mul.setBounds(250,150,100,30);
mul.addActionListener(this);

div=new Button("DIV");
div.setBounds(50,200,100,30);
div.addActionListener(this);

mod=new Button("MOD");
mod.setBounds(150,200,100,30);
mod.addActionListener(this);

clear=new Button("CLEAR");
clear.setBounds(250,200,100,30);
clear.addActionListener(this);

l3=new Label("Result :");
l3.setBounds(250,250,100,50);

l4=new Label("    ");
l4.setBounds(380,250,150,30);

add(l1);
add(txt1);
add(l2);
add(txt2);
add(add);
add(sub);
add(mul);
add(div);
add(mod);
add(clear);
add(l3);
add(l4);

this.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});

}
public void actionPerformed(ActionEvent ae)
{
String opr=ae.getActionCommand();
if(opr.equals("ADD"))
{
int a =Integer.parseInt(txt1.getText());
int b =Integer.parseInt(txt2.getText());
int c=a+b;
String result = String.valueOf(c);
l4.setText(result);
}
if(opr.equals("SUB"))
{
int a =Integer.parseInt(txt1.getText());
int b =Integer.parseInt(txt2.getText());
int c=a-b;
String result = String.valueOf(c);
l4.setText(result);
}
if(opr.equals("MUL"))
{
int a =Integer.parseInt(txt1.getText());
int b =Integer.parseInt(txt2.getText());
int c=a*b;
String result = String.valueOf(c);
l4.setText(result);
}
if(opr.equals("DIV"))
{
int a =Integer.parseInt(txt1.getText());
int b =Integer.parseInt(txt2.getText());
int c=a/b;
String result = String.valueOf(c);
l4.setText(result);
}
if(opr.equals("MOD"))
{
int a =Integer.parseInt(txt1.getText());
int b =Integer.parseInt(txt2.getText());
int c=a%b;
String result = String.valueOf(c);
l4.setText(result);
}
if(opr.equals("CLEAR"))
{
txt1.setText(null);
txt2.setText(null);
l4.setText("   ");
}
}
public static void main(String[] args)
{
add obj=new add();
}

}