 package cse225e8;
import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.event.MouseListener;
public class mouse_event extends Frame implements MouseListener {
public Frame f;
public Label l;
public mouse_event() {
f=new Frame();
f = new Frame();
f.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
       f.dispose();
       }
    });
       f.addMouseListener(this);
       l=new Label();
       l.setBounds(300,350,180,100);
        f.add(l);
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);
     }
      public void mouseClicked(MouseEvent e) {
          l.setText("Mouse Clicked");
      }
      public void mouseEntered(MouseEvent e) {
          l.setText("Mouse Entered");
      }
      public void mousePressed(MouseEvent e) {
    	  l.setText("Mouse Pressed");
      }
      public void mouseReleased(MouseEvent e) {
          l.setText("Mouse Released");
      }
      public void mouseExited(MouseEvent e) {
          l.setText("Mouse Exited");
      }
      public static void main(String[] args) {
            new mouse_event();

	}

}
