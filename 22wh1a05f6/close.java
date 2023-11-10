package csec2022;
import java.awt.*;

public class close extends Frame{
       close(){
    	   addWindowListeer(new WindowAdapter(){
    	   public void windowClosing(WindowEvent e) {
    	   System.exit(0);
    	   }
    	   });
           }
           public void paint(Graphics g) {
    	   this.setBackground(new color(100,20,20));
    	   Front f=new Font("Arial",Font.BOLD+Font.ITALIC);
       }
}
