package Frames;

import java.awt.*;
import java.awt.event.*;

public class grids extends WindowAdapter {
    private Frame frame;

    public grids() {
    	frame = new Frame();
        frame.setLayout(new BorderLayout()); // Use BorderLayout for the frame

        TextField textField = new TextField();
        textField.setPreferredSize(new Dimension(500, 50)); // Set preferred size for the TextField
        frame.add(textField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

       
        buttonPanel.add(new Button("1"));
        buttonPanel.add(new Button("2"));
        buttonPanel.add(new Button("3"));
        buttonPanel.add(new Button("Del"));
       
       
        buttonPanel.add(new Button("4"));
        buttonPanel.add(new Button("5"));
        buttonPanel.add(new Button("6"));
        buttonPanel.add(new Button("Clr"));
        
        buttonPanel.add(new Button("7"));
        buttonPanel.add(new Button("8"));
        buttonPanel.add(new Button("9"));
        buttonPanel.add(new Button("="));
       
        buttonPanel.add(new Button("0"));
        buttonPanel.add(new Button("*"));
        buttonPanel.add(new Button("+"));
        buttonPanel.add(new Button("-"));
        
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new grids();
    }
}

        
      
      
   
         
      

    
