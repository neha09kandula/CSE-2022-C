import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Color;
public class SimpleApplet extends Applet {
public static void main(String args[]) {
}
public void paint(Graphics g) {
g.setColor(Color.black);
g.setBackground(Color.yellow);
g.drawString("HI APPLET PROGRAM",80,150);
}
}
