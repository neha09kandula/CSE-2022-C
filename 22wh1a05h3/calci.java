package labprograms;

import java.awt.*;
import java.awt.event.*;

public class calci extends WindowAdapter implements ActionListener  {
	private Frame f;
	private TextField t1, t2, t3;
    private Button b1;
	public calci()
	{
		 f=new Frame();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLayout(null);
		
		Label l1=new Label("num1");
		f.add(l1);
		l1.setSize(50,50);
		l1.setVisible(true);
		l1.setBounds(150,150,50,50);
		
		 t1=new TextField();
		f.add(t1);
		t1.setVisible(true);
		t1.setSize(50,50);
		t1.setBounds(210,150,50,50);
		
		Label l2=new Label("num2");
		f.add(l2);
		l2.setSize(50,50);
		l2.setVisible(true);
		l2.setBounds(150,210,50,50);
		
		t2=new TextField();
		f.add(t2);
		t2.setVisible(true);
		t2.setSize(50,50);
		t2.setBounds(210,220,50,50);
		
		Label l3=new Label("RESULT");
		f.add(l3);
		l3.setSize(50,50);
		l3.setVisible(true);
		l3.setBounds(150,270,50,50);
		
		t3=new TextField();
		f.add(t3);
		t3.setVisible(true);
		t3.setSize(50,50);
		t3.setBounds(210,280,50,50);
		
		 b1=new Button("DIVIDE");
		f.add(b1);
		b1.setVisible(true);
		b1.setSize(50,20);
		b1.setBounds(250,400,60,20);
		b1.addActionListener(this);
		
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent e) {
        f.dispose();
    }

	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());

                // Check for division by zero
                if (num2 != 0) {
                    double result = num1 / num2;
                    t3.setText(Double.toString(result));
                } else {
                    t3.setText("Cannot divide by zero");
                }
            } catch (NumberFormatException ex) {
                t3.setText("Invalid input");
            }
        }
    }
    public static void main(String[] args) {
        new calci();
    }
}

