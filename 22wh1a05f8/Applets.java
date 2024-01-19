package cse_c_225f8;

import  java.applet.*;
import  java.awt.*;

public class Applets extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		setBackground(Color.yellow);
		g.drawString("Applet program",50,120);
	}
public static void main(String [] args)
	{
	 new Applets();
	}
}
