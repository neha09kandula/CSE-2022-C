import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

	public class student_reg extends WindowAdapter {
		Frame f=new Frame("Hello Frame");
		public student_reg() {
		f.addWindowListener(this);
		f.setSize(300,300);
		f.setBounds(300,200,500,500);
		f.setVisible(true);
		}
	public void windowClosing(WindowEvent e)
			{
				f.dispose();
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new student_reg();
	}
}
