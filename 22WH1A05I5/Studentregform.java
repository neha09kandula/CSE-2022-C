package csec5i5;
import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame{
Button b1,b2;
TextField t1,t2,t3,t4;
TextArea t5;
Label Title,Name,Fathername,Age,Gender,Course,Hobbies,Addr;
Checkbox c1,c2,c3,c4;
MyButton(){
this.setLayout(null);
this.setBackground(Color.red);
b1 = new Button("Save");
b2 = new Button("Clear");
Title = new Label("Registration Form");
Name = new Label("Name:");
Fathername = new Label("Father Name:");
Age = new Label("Age:");
Gender = new Label("Gender:");
Course = new Label("Course:");
Hobbies = new Label("Hobbies:");
Addr = new Label("Address:");
t1 = new TextField(32);
t2 = new TextField(32);
t3 = new TextField(5);
t4 = new TextField(30);
t5 = new TextArea(50,50);
c1 = new Checkbox("Dance");
Title.setBounds(50, 50, 200, 40);
Font f1 = new Font("Arial",Font.ITALIC,20);
Title.setFont(f1);
Name.setBounds(110, 100, 50, 20);
Fathername.setBounds(110, 150, 80, 20);
Age.setBounds(110, 200, 80, 20);
Gender.setBounds(110, 250, 80, 20);
Course.setBounds(110, 300, 80, 20);
Hobbies.setBounds(110, 350, 80, 20);
Addr.setBounds(110, 400, 80, 20);
t1.setBounds(210, 100, 200, 20);
t2.setBounds(210, 150, 200, 20);
t3.setBounds(210, 200, 200, 20);
t4.setBounds(210, 300, 200, 20);
t5.setBounds(210, 400, 200, 100);
b1.setBounds(210, 600, 80, 20);
b2.setBounds(310, 600, 80, 20);
this.add(t1);this.add(t2);this.add(t3);this.add(t4);this.add(t5);
this.add(b1);this.add(b2);
this.add(Age);
this.add(Gender);
this.add(Course);
this.add(Hobbies);
this.add(Addr);
this.add(Fathername);
this.add(Name);
this.add(Title);
}
}
public class Studentregform {
public static void main(String[] args) {
Frame f = new MyButton();
 f.setTitle("Student Register Form");
 f.setVisible(true);
 f.setSize(700, 700);
 f.addWindowListener(new MyClass());
}
}
class MyClass extends WindowAdapter{
public void windowClosing(WindowEvent we) {
System.exit(0);
}
}

