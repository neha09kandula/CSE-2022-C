package CSE225d8;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class ButtonEvent extends Frame {
	 Button YellowButton,PinkButton,GreenButton;
     public ButtonEvent() {
   	  setTitle("page");
   	  setSize(400, 400);
      setLayout(null);
        
      YellowButton=new Button(" yellow ");
      PinkButton=new Button(" Pink ");
      GreenButton=new Button(" green ");
      
      YellowButton.setBounds(150,100,60,30);
      PinkButton.setBounds(150,150,60,30);
      GreenButton.setBounds(150,200,60,30);

      add(YellowButton);
      add(PinkButton);
      add(GreenButton);
      
      YellowButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  setBackground(Color.yellow);
          }
      });
      PinkButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  setBackground(Color.pink);
          }
      });
      GreenButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
        	  setBackground(Color.green);
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
      new ButtonEvent();
  }
 
}

