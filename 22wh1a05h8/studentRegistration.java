package java5h8;

import java.awt.*;
import java.awt.event.*;
public class student_reg extends WindowAdapter{
   private Frame f;

   public student_reg() {
       f = new Frame("Hello Frame");
       f.setSize(1000, 1000);
       f.setBounds(30, 60, 800, 600);
       f.setLayout(null);
       f.setVisible(true);
       f.addWindowListener(this);
       f.setBackground(Color.white);
       
       
       Label l = new Label("STUDENT REGISTRATION FORM");
       f.add(l);
       l.setSize(100,100);
       l.setBounds(300,30,300,10);
       l.setVisible(true);
       
       
       Label l1 = new Label("Enter your full name");
       f.add(l1);
       l1.setSize(150,30);
       l1.setBounds(50,60,150,30);
       l1.setVisible(true);
       
       

       
       
       Label l2 = new Label("Guardian name:");
       f.add(l2);
       l2.setSize(100,100);
       l2.setBounds(50,100,150,30);
       l2.setVisible(true);
       
       TextField t1= new TextField();
       f.add(t1);
       t1.setSize(300,30);
       t1.setLocation(200, 50);
       t1.setVisible(true);
       t1.setBackground(Color.GRAY);
       
       TextField t2= new TextField();
       f.add(t2);
       t2.setSize(300,30);
       t2.setLocation(200, 300);
       t2.setVisible(true);
       t2.setBackground(Color.GRAY);
       
       TextField t3= new TextField();
       f.add(t3);
       t3.setSize(300,30);
       t3.setLocation(200, 400);
       t3.setVisible(true);
       t3.setBackground(Color.GRAY);
       
       TextField t4= new TextField();
       f.add(t4);
       t4.setSize(300,30);
       t4.setLocation(200, 450);
       t4.setVisible(true);
       t4.setBackground(Color.GRAY);      
       
       TextField t5= new TextField();
       f.add(t5);
       t5.setSize(300,30);
       t5.setLocation(200, 350);
       t5.setVisible(true);
       t5.setBackground(Color.GRAY);
       
       TextField t6= new TextField();
       f.add(t6);
       t6.setSize(300,30);
       t6.setLocation(200, 250);
       t6.setVisible(true);
       t6.setBackground(Color.GRAY);
       
       TextField t7= new TextField();
       f.add(t7);
       t7.setSize(300,30);
       t7.setLocation(200, 200);
       t7.setVisible(true);
       t7.setBackground(Color.GRAY);
       
       TextField t8= new TextField();
       f.add(t8);
       t8.setSize(300,30);
       t8.setLocation(200, 150);
       t8.setVisible(true);
       t8.setBackground(Color.GRAY);
       
       TextField t9= new TextField();
       f.add(t9);
       t9.setSize(300,30);
       t9.setLocation(200, 100);
       t9.setVisible(true);
       t9.setBackground(Color.GRAY);
       
       
       
       Label l3 = new Label("Parent phone number:");
       f.add(l3);
       l3.setSize(100,100);
       l3.setBounds(50,150,700,30);
       l3.setVisible(true);
      
       
       
       Label l4 = new Label("Student phone number:");
       f.add(l4);
       l4.setSize(100,100);
       l4.setBounds(50,200,900,30);
       l4.setVisible(true);
       
       
       Label l5 = new Label("email:");
       f.add(l5);
       l5.setSize(100,100);
       l5.setBounds(50,250,1100,30);
       l5.setVisible(true);
       
       
       Label l6 = new Label("Gender:");
       f.add(l6);
       l6.setSize(100,100);
       l6.setBounds(50,300,1300,30);
       l6.setVisible(true);
       
       
       Label l7 = new Label("DOB:");
       f.add(l7);
       l7.setSize(100,100);
       l7.setBounds(50,350,1500,30);
       l7.setVisible(true);
       
       
       Label l8 = new Label("DEPARTMENT:");
       f.add(l8);
       l8.setSize(100,100);
       l8.setBounds(50,400,1700,30);
       l8.setVisible(true);
       
       
       Label l9 = new Label("COURSE:");
       f.add(l9);
       l9.setSize(100,100);
       l9.setBounds(50,450,1900,30);
       l9.setVisible(true);
       
       
       Button b1 = new Button("SUBMIT");
       f.add(b1);
       b1.setSize(100,100);
       b1.setBounds(50,550,100,30);
       b1.setVisible(true);
       
       
       Button b2 = new Button("RESET");
       f.add(b2);
       b2.setSize(100,100);
       b2.setBounds(160,550,100,30);
       b2.setVisible(true);
   }

   public void windowClosing(WindowEvent e) {
       f.dispose();
   }

   public static void main(String[] args) {
       new student_reg();
   }
}
