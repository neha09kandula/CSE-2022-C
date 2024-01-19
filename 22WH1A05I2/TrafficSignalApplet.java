package cse5i2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrafficSignalApplet extends Applet {
    private static final long serialVersionUID = 1L;

    private int signalState = 0;
    private boolean isRunning = true;

    public void init() {
        setSize(200, 400);
        setBackground(Color.white);

        // Use an anonymous inner class for the ActionListener
        new Thread(new Runnable() {
            public void run() {
                while (isRunning) {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    signalState = (signalState + 1) % 3;
                    repaint();
                }
            }
        }).start();
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(50, 50, 100, 300);

        drawLight(g, Color.red, 75, 70, signalState == 0);
        drawLight(g, Color.yellow, 75, 170, signalState == 1);
        drawLight(g, Color.green, 75, 270, signalState == 2);
    }

    private void drawLight(Graphics g, Color color, int x, int y, boolean isOn) {
        g.setColor(Color.black);
        g.fillOval(x, y, 50, 50);

        g.setColor(isOn ? color : Color.gray);
        g.fillOval(x + 5, y + 5, 40, 40);
    }

    public void stop() {
        isRunning = false;
    }
}
