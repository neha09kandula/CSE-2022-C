package expection;
import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	public class Mouselistnerinterface {

	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Mouse Listener Example");
	        JButton button = new JButton("Click me");
	        button.addMouseListener(new MyMouseListener());

	        frame.add(button);
	        frame.setSize(300, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    static class MyMouseListener implements MouseListener {
	        public void mouseClicked(MouseEvent e) {
	            System.out.println("Mouse Clicked");
	        }

	        public void mousePressed(MouseEvent e) {
	            System.out.println("Mouse Pressed");
	        }

	        public void mouseReleased(MouseEvent e) {
	            System.out.println("Mouse Released");
	        }

	        public void mouseEntered(MouseEvent e) {
	            System.out.println("Mouse Entered");
	        }

	        public void mouseExited(MouseEvent e) {
	            System.out.println("Mouse Exited");
	        }
	    }
	}


