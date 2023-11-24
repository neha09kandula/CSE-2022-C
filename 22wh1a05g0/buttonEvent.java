import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class buttonEvent extends Frame{
	buttonEvent(){
		addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				dispose();
			}
				});
		setSize(800,800);
		setLayout(null);
		Button b = new Button("blue");
		b.setBounds(300, 300, 200, 60);
		add(b);
		b.addActionListener(new ActionListener() {

	          public void actionPerformed(ActionEvent e) {

	              setBackground(Color.BLUE);
	          
		Button b1 = new Button("yellow");
		b1.setBounds(300, 400, 200, 60);
		add(b1);
		Button b2 = new Button("green");
		b2.setBounds(300, 500, 200, 60);
		add(b2);
		Button b3 = new Button();
		b3.setBounds(600, 300, 200, 60);
		add(b3);
		setVisible(true);
		
		
	}
	public static void main(String args[]) {
		new buttonEvent();
	}
}