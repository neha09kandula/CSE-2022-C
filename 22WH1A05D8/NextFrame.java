package CSE225d8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NextFrame  extends Frame{
      Button SubmitButton,NextButton;
      public NextFrame() {
    	  setTitle("page");
    	  setSize(600, 600);
          setLayout(null);
          
        SubmitButton=new Button("Submit");
        NextButton=new Button("Next");
        
        SubmitButton.setBounds(200, 220, 100,30);
        NextButton.setBounds(400, 220, 100, 30);
        
        SubmitButton.setBackground(Color.orange);
        NextButton.setBackground(Color.cyan);
          
        add(SubmitButton);
        add(NextButton);
        
        SubmitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new NextFrame();
    }
      }

