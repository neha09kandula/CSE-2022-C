package frames;
import java.awt.*;
import java.awt.frames;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class message extends firstframejava
{
   message()
   {
	   addWindowListener(new WindowAdapter()
	   {
		   public void windowClosing(WindowEvent e)
		   {
			   System.exit(0);
		   }
	   });
   }
   private void addWindowListener(WindowAdapter windowAdapter) {
	// TODO Auto-generated method stub
	
}
public class firstframejava
   {
   	public void main(String args[])
   	{
   		//TODO Auto-generated method stub
   		Frame f = new Frame("My First Frame");
   		f.setSize(700,500);
   		f.setVisible(true);
   	}
}
}
