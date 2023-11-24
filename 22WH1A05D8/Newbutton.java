package CSE225d8;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;

public class Newbutton extends Frame implements ActionListener{
	 Button YellowButton,PinkButton,GreenButton;
     public Newbutton() {
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

      addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
     }
     
      public void actionPerformed(ActionEvent ae) {
    	 String str=ae.getActionCommand();
     	 if(str.equals("Yellow"))
     	 this.setBackground(Color.yellow);
     	 if(str.equals("Pink"))
     	 this.setBackground(Color.pink);
     	 if(str.equals("Green"))
         this.setBackground(Color.green);
      }


  public static void main(String[] args) {
      new Newbutton();
  }

}
