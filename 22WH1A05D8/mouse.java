package cse225d8;
import java.awt.*;
import java.awt.event.*;
public class mouse extends Frame implements MouseListener {
        Label l;
        mouse(){
        	addMouseListener(this);
        	l=new Label();
        	l.setBounds(20,50,100,90);
        	add(l);
        	setSize(300,300);
        	setLayout(null);
        	addWindowListener(new WindowAdapter(){
        		public void windowClosing(WindowEvent e) {
        			dispose();
        		}
        	});
        	setVisible(true);
        }
        public  void mouseClicked(MouseEvent e) {
        	l.setText("Mouse clicked");
        }
        public void mouseEntered(MouseEvent e) {
        	l.setText("Mouse Entered");
        }
        public void mouseExited(MouseEvent e) {
        	l.setText("Mouse Exited");
        }
        public void mousePressed(MouseEvent e) {
        	l.setText("Mouse Pressed");
        }
        public void mouseReleased(MouseEvent e) {
        	l.setText("Mouse Released");
        }
     public static void main(String []args) {
    	  new mouse();
     }
}

