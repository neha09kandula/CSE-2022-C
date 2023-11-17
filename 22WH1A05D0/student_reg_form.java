package Java22wh1a05d0;
import java.awt.*;
import java.awt.event.*;
class MyButton extends Frame{
	Button b1,b2;
	TextField t1,t2,t3,t4,t5,t6,t7;
	TextArea t8;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	MyButton(){
		this.setLayout(null);
		l1=new Label("Name");
		l2=new Label("Father name");
		l3=new Label("Mother name");
		l4=new Label("Age");
		l5=new Label("Gender");
		l6=new Label("Course:");
		l7=new Label("Hobbies:");
		l8=new Label("Address");
		b1=new Button("SAVE");
		b2=new Button("EXIT");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(20);
		t4=new TextField(20);
		t5=new TextField(20);
		t6=new TextField(20);
		t7=new TextField(20);
		t8=new TextArea(20,20);
		l1.setBounds(100,150,100,50);
		l2.setBounds(100,200,100,50);
		l3.setBounds(100,250,100,50);
		l4.setBounds(100,200,100,50);
		l5.setBounds(100,350,100,50);
		l6.setBounds(100,400,100,50);
		l7.setBounds(100,450,100,50);
		l8.setBounds(100,500,100,50);
		b1.setBounds(100,550,100,50);
		b2.setBounds(200,600,100,50);
		t1.setBounds(200,150,200,40);
		t2.setBounds(200,200,100,40);
		t3.setBounds(200,250,100,40);
		t4.setBounds(200,300,100,40);
		t5.setBounds(200,350,100,40);
		t6.setBounds(200,400,100,40);
		t7.setBounds(200,450,100,40);
		t8.setBounds(200,500,100,40);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(l7);
		this.add(l8);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		this.add(t6);
		this.add(t7);
		this.add(t8);
		this.add(b1);
		this.add(b2);
		this.setBackground(Color.ORANGE);
	}
}
public class student_reg_form {

	public static void main(String[] args) {

		MyButton f=new MyButton();

		f.setVisible(true);

		f.setSize(600,600);

		f.addWindowListener(new MyClass());

		}

		}

		class MyClass extends WindowAdapter{

		public void windowClosing(WindowEvent we) {

		System.exit(0);

		}

}