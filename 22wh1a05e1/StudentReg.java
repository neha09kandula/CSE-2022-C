package Frames;
package 22csec;

import java.awt.*; 
class MyButton extends Frame
{
	Button b1,b2;
	TextField t1,t2;
	MyButton()
	{
		this.setLayout(null);
		b1=new Button("save");
		b2=new Button("update");
		t1 = new TextField();
		t2 = new TextField(30);
		b1.setBounds(100,346,100,50);
		b2.setBounds(200,346,100,50);
		this.add(b1);
		this.add(b2);
		this.add(t1);
		this.add(t2);
		Checkbox c1 = new Checkbox();
		Checkbox c2 = new Checkbox("Telugu");
		Checkbox c3 = new Checkbox("English",true);
		Checkbox c4 = new Checkbox("Hindi");
		c1.setBounds(50,50,10,50);
		c2.setBounds(30,50,10,50);	
	}
}
class Labels extends Frame
{
	
}
public class StudentReg 
{

	public static void main(String[] args) 
	{
		MyButton f = new MyButton();
		f.setTitle("sample");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass());
		f.setBackground(Color.GRAY);
	}

}
class MyClass extends WindowAdapter
{
	public void windowClosing(WindowEvent we) 
	{
		System.exit(0);
	}
}
