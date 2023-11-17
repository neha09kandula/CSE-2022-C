package frames;

//importing the necessary libraries  
import java.awt.*;    
import java.awt.event.*;    

//class which inherits the WindowAdapter class  
public class studentregistration extends WindowAdapter {
	TextField nameField, emailField,mobile_number,password;
//object of Frame  
 Frame f;    
//class constructor  
 studentregistration() {    
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
     
     Label emailLabel=new Label("email :");
     emailLabel.setBounds(150,200,200,30);
     f.add(emailLabel);
     
     mobile_number=new TextField();
     mobile_number.setBounds(250,300,200,30);
     f.add(mobile_number);
     
     Label mobile_number=new Label("mobile number :");
     mobile_number.setBounds(150,300,200,30);
     f.add(mobile_number);
     
     password=new TextField();
     password.setBounds(250,400,200,30);
     f.add(password);
     
     Label password=new Label("password :");
     password.setBounds(150,400,200,30);
     f.add(password);
     
     Button b=new Button("reset");
     f.add(b);
     b.setBounds(150,500,100,50);
     Button c=new Button("register");
     f.add(c);
     c.setBounds(450,500,100,50);
     Button d=new Button("back");
     f.add(d);
     d.setBounds(300,600,100,50);
     
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
 new studentregistration();    
}    
}  