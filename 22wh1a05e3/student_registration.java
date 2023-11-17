package cseb225e3;
import java.awt.*;    
import java.awt.event.*;    
public class student_registration extends WindowAdapter {    
TextField nameField,emailField,mobile_number;
 Frame f;    
  {    
 student_registration();
//creating the frame  
     f = new Frame("my first frame");
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
     Button b=new Button("submit");
     f.add(b);
     Button b1=new Button("Clear");
     f.add(b1);
     b.setBounds(200,500,100,50);
     b1.setBounds(500,500,100,50);
     //b.setLabel(null);

//setting the size, layout and visibility of frame  
     f.setSize (400, 400);  
     f.setLayout (null);    
     f.setVisible (true);    
 }    
//overriding the windowClosing() method   
public void windowClosing (WindowEvent e) {    
 f.dispose();    
}    
private void student_registration() {
	// TODO Auto-generated method stub
}
//main method  
public static void main(String[] args) {    
 new student_registration();    
}    
} 
