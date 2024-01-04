package labprograms;

import java.awt.*;
import java.awt.event.*;
public class trafficsignal extends WindowAdapter{
	private Frame f;
	private CheckboxGroup checkboxGroup;
    private Checkbox redCheckbox, yellowCheckbox, greenCheckbox;

	public trafficsignal()
	{
		f=new Frame();
		f.setSize(800,800);
		f.setVisible(true);
		f.setLayout(null);
		f.addWindowListener(this);
		checkboxGroup = new CheckboxGroup();
		// Create radio buttons
        redCheckbox = new Checkbox("Red", checkboxGroup, false);
        yellowCheckbox = new Checkbox("Yellow", checkboxGroup, false);
        greenCheckbox = new Checkbox("Green", checkboxGroup, false);

        // Set radio button bounds
        redCheckbox.setBounds(400, 50, 100, 30);
        yellowCheckbox.setBounds(400, 200, 100, 30);
        greenCheckbox.setBounds(400, 350, 100, 30);

        // Add radio buttons to the frame
        f.add(redCheckbox);
        f.add(yellowCheckbox);
        f.add(greenCheckbox);
		drawCircles();
	}
	private void drawCircles() {
        int x = 50;
        int y = 30;

        for (int i = 0; i <=3; i++) {
            Graphics g = f.getGraphics();
            drawCircle(g, x, y);
            delay(1000);
            y += 150; // Adjust the x-coordinate for the next circle
        }
    }

    private void drawCircle(Graphics g, int x, int y) {
        g.drawOval(x, y, 100, 100);
    }

    private void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	public void windowClosing(WindowEvent e) {
        f.dispose();
    }

	public static void main(String[] args) {
        new trafficsignal();
    }

}
