package priyanka5j0;
import java.awt.*;
import java.awt.event.*;

public class Button_Actions {

    Button_Actions() {
        final Frame f = new Frame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null); 

        Button b = new Button("Black");
        b.setBounds(50, 50, 70, 30); 
        f.add(b);

        Button b1 = new Button("Red");
        b1.setBounds(150, 50, 70, 30); 
        f.add(b1);

        Button b2 = new Button("Blue");
        b2.setBounds(250, 50, 70, 30); 
        f.add(b2);

        b.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setBackground(Color.black);
            }
        });

        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setBackground(Color.red);
            }
        });

        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                f.setBackground(Color.blue);
            }
        });

        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        new Button_Actions();
    }
}

