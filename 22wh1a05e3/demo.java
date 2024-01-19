import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
/*
<applet code="demo.class" width="200" height="200">
    </applet>
*/

public class demo extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World!",70, 100);
        g.setColor(Color.black);
        setBackground(Color.yellow);
        
    }

public static void main(String[] args){

}
}
