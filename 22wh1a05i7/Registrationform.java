package javaprogram;



import java.awt.*;

import java.awt.event.*;





public class Registrationform {

 public static void main(String args[]) {

  Myframe frame =new Myframe();

  

  frame.setTitle("calculator");

  frame.setVisible(true);

  frame.setSize(700,700);

  frame.setBackground(Color.black);

  

 }



}

class Myframe extends Frame{

 TextField t1,t2,t3,t4,t5;

 Label l1,l2,l3,l4,l5;

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

  t4=new TextField();

  t4.setBounds(250,200,300,30);

  t5=new TextField();

  t5.setBounds(250,250,300,30);

  this.add(t1);

  this.add(t2);

  this.add(t3);

  this.add(t4);

  this.add(t5);

  

  l1=new Label("NAME");

  l1.setBounds(50,50,100,30);

  l2=new Label("DOB");

  l2.setBounds(50,100,100,30);

  l3=new Label("ROLL NO");

  l3.setBounds(50,125,100,30);

  l3=new Label("COURSE");

  l3.setBounds(50,200,100,30);

  l4=new Label("CNO");

  l4.setBounds(50,250,100,30);

  l5=new Label("ADD");

  l5.setBounds(50,300,100,30);

  

  add(l1);

  add(l2);

  add(l3);

  add(l4);

  add(l5);

  

  



 }



 }

	

	






