import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Traffic.class"=width height=400></applet>*/

public class Traffic extends Applet implements ItemListener
{
       int colourNum; //global variable which is responsible for changing the light
       

       CheckboxGroup cbg;
       Checkbox red,yellow,green;
       String msg=" ";
    public void init()
    {
        cbg=new CheckboxGroup();
        red=new Checkbox("RED",cbg,true);
        yellow=new Checkbox("YELLOW",cbg,true);
        green=new Checkbox("GREEN",cbg,true);
        add(red);
        add(yellow);
        add(green);
        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
    
    }
public void itemStateChanged(ItemEvent ie)
{
   if(ie.getSource ()== red)
      colourNum = 1;
   else if(ie.getSource () == yellow)
       colourNum = 2;
   else
       colourNum = 3;
   repaint();
}


public void paint(Graphics g) // responsible for graphics "within" the window

{
      g.setColor(Color.black);
      g.fillOval(150,70,50,50); //red light
      g.fillOval(150,150,50,50); //yellow light
      g.fillOval(150,230,50,50); //green light
      switch (colourNum)
    {
      case 1:g.setColor(Color.red);
             g.fillOval(150,70,50,50); //red light
             msg="STOP";
             g.drawString(msg,210,100);
             break;
    
       case 2:g.setColor(Color.yellow);
             g.fillOval(150,150,50,50); //yellow light
             msg="READY";
             g.drawString(msg,210,180);
             break;

       case 3:g.setColor(Color.green);
             g.fillOval(150,230,50,50); //green light
             msg="GO";
             g.drawString(msg,210,260);
             break;

       }
    }
}


