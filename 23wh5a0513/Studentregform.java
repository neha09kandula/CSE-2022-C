package cseb;
import java.awt.*;
 import java.awt.event.*;
 class MyButton extends Frame implements ActionListener{
	 Button b1,b2,b3;
	 // TextField t1,t2;
     MyButton(){
    	 this.setLayout(null);
		/* b1 = new Button("save");
		 b2 = new Button(" Update");
		 t1 = new TextField();
		 t2 = new TextField(30);
		 b1.setBounds(100,100,100,50);
		 b2.setBounds(200,100,100,50);
		 t1.setBounds(200,100,100,50);
		 t2.setBounds(200,100,100,50);
		 this.add(b1);
		 this.add(b2);
		 this.add(t1);
		 this.add(t2);
		 Checkbox c1 = new Checkbox();
		 Checkbox c2 = new Checkbox("Telugu",true);
		 Checkbox c3 = new Checkbox("English",true);
		 c2.setBounds(170,180,100,100);
		 c3.setBounds(130,120,100,100);
		 this.add(c2);
		 this.add(c3); 
		 */
b1 = new Button("red");
b2 = new Button("green");
b3 = new Button("blue");
b1.setBounds(100,100,100,50);
b2.setBounds(200,100,100,50);
b3.setBounds(300,100,100,50);
this.add(b1);
this.add(b2);
this.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
     public void actionPerformed(ActionEvent ae)
     {
    	 String str1,str2,str3;
    	 str1 = b1.getActionCommand();
    	 if(str1.equals("red")) 
    		 this.setBackground(Color.red);
    	 str2 = b2.getActionCommand();
    	 if(str2.equals("green"))
    		 this.setBackground(Color.green);
    	 str3 = b3.getActionCommand();
    	 if(str3.equals("blue"))
    		 this.setBackground(Color.blue);
     }
}
public class StudentRegForm{
 public static void main(String[] args)
 {
	 MyButton f = new MyButton();
	 f.setTitle("Sample frame");
	 f.setVisible(true);
	 f.setSize(400,400);
	 f.addWindowListener(new MyClass1());
 }
}
class MyClass1 extends WindowAdapter
{
	public void WindowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

