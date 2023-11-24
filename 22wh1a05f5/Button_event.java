package packegef5;
import java.awt.*;
import java.awt.event.*;
public class Button_event extends Frame {
	Button b1,b2,b3;
	public Button_event() {
	setSize(300,300);
	setVisible(true);
	setLayout(null);
	b1=new Button("BLUE");
	b2=new Button("RED");
	b3=new Button("PINK");
	
	b1.setBounds(80,100,50,50);
	b2.setBounds(80,160,50,50);
	b3.setBounds(80,220,50,50);
	add(b1);
	add(b2);
	add(b3);
	/*b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setBackground(Color.BLUE);
		}
	
	});
	b2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setBackground(Color.RED);
		}
	
	});
	b3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setBackground(Color.PINK);
		}
	
	});*/
	public void actionPerformed(ActionEvent ae) 
	{
		String str=ae.getActionCommand();
		if(str.equals("BLUE"))this.setBackground(Color.BLUE);
		if(str.equals("PINK"))this.setBackground(Color.PINK);
		if(str.equals("RED"))this.setBackground(Color.RED);
	}

	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			dispose();
		}
	});
	}
	
	
	


	/*private void setBackground(Button b12, String string) {
		// TODO Auto-generated method stub
		
	}*/
	





	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Button_event();
	}

}
