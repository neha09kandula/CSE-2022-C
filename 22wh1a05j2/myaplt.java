import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
class myaplt extends Frame{
	myaplt()
	{
		@SuppressWarnings("unused")
		Canvas c = new Canvas();
		setBackground(Color.PINK);
		setTitle("Smiley!!");
		setSize(500,500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(125, 125, 250, 250);
		g.setColor(Color.BLACK);
		g.fillOval(210, 200, 25, 50);
		g.fillOval(270, 200, 25, 50);
		g.drawArc(180, 230, 150, 100, 180, 180);
		g.drawArc(180, 232, 150, 100, 180, 180);
		g.drawArc(180, 233, 150, 100, 180, 180);
		g.drawArc(180, 234, 150, 100, 180, 180);
		g.drawArc(180, 235, 150, 100, 180, 180);
		g.setColor(Color.WHITE);
		g.fillOval(217, 235, 14, 14);
		g.fillOval(277, 235, 14, 14);
	}
	public static void main(String[] args)
	{
		new myaplt();
	}
}
