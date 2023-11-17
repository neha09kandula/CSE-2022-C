package frames;
import java.awt.*;    

import java.awt.event.*;    



//class which inherits the WindowAdapter class  

public class studentreg extends WindowAdapter {    

//object of Frame  
TextField nameField,emailField,mobile_number,age;
 Frame f;    

//class constructor  

 studentreg() {    

//creating the frame  

     f = new Frame("Student Registration");
     Label nameLabel=new Label("Name :");

//adding  WindowListener to the frame  

     f.addWindowListener (this);
     
     nameLabel.setBounds(150,100,200,30);
     nameField=new TextField();
     nameField.setBounds(250,100,200,30);
     f.add(nameField);
     f.add(nameLabel);
     
     emailField=new TextField();
     emailField.setBounds(250,200,200,30);
     f.add(emailField);
     Label email=new Label("Email :");
     email.setBounds(150,200,200,30);
     f.add(email);
   
     
     mobile_number=new TextField();
     mobile_number.setBounds(250,300,200,30);
     f.add(mobile_number);
     Label mobile=new Label("Mobile Number :");
     mobile.setBounds(150,300,200,30);
     f.add(mobile);
     
     age=new TextField();
     age.setBounds(250,400,200,30);
     f.add(age);
     Label Age=new Label("Age :");
     Age.setBounds(150,400,200,30);
     f.add(Age);

     Button b=new Button("submit");

     f.add(b);
     Button b1=new Button("Clear");

     f.add(b1);
    
     b.setBounds(200,500,100,50);
     b1.setBounds(500,500,100,50);

     //b.setLabel(null);

     

//setting the size, layout and visibility of frame  

     f.setSize (700, 700);  


     f.setLayout (null);    

     f.setVisible (true);    

 }    



//overriding the windowClosing() method   

public void windowClosing (WindowEvent e) {    

 f.dispose();    

}    

//main method  

public static void main(String[] args) {    

 new studentreg();    

}    

} 