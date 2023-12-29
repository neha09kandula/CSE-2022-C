import java.awt.*;
import java.awt.event.*;

public class FactGUI extends Frame implements ActionListener{
	Button b;
	TextField txt;
	Label l1,l2;
	FactGUI(){
		l1=new Label("Enter an integer: ");
		l1.setBounds(100, 100, 100, 30);
		txt=new TextField();
		txt.setBounds(200, 100, 40, 20);
		b=new Button("Find Factorial");
		b.setBounds(100,200,100,30);
		b.addActionListener(this);
		l2=new Label(" .");
		l2.setBounds(100,150,100,10);
		add(l1);
		add(txt);
		add(b);
		add(l2);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent ae) {
		int n=Integer.parseInt(txt.getText());
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		String res = String.valueOf(f);
		l2.setText("Result is: "+res);
	}
	public static void main(String args[]) {
		FactGUI f1 = new FactGUI();
	}
}
