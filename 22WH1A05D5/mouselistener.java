package frames;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouselistener extends Frame implements MouseListener {
 Label l;
 mouselistener() {
     addMouseListener(this);
     l = new Label();
     l.setBounds(20, 50, 70, 90);
     add(l);
     setSize(200, 200); 
     setBounds(30, 60, 300, 200); 
     setVisible(true);  
 }
 public void mouseClicked(MouseEvent e) {
     l.setText("MouseClicked");  
 }
 public void mouseEntered(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
 public void mousePressed(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public static void main(String[] args) {
     new mouselistener();
 }
}

