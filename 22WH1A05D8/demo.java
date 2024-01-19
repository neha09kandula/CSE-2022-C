import java.applet.Applet;  
import java.awt.Graphics;  
import java.awt.Color;
public class demo extends Applet{  
 
public void paint(Graphics g){
g.setColor(Color.black);
setBackground(Color.yellow);
g.drawString("welcome",150,150);  
}  
 
}  