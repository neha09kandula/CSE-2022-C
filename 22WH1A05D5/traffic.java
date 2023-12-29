package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class traffic extends JFrame {
    private JButton redButton, greenButton, orangeButton;
    private JLabel statusLabel;

    public traffic() {
        setTitle("Traffic Lights");
        setSize(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        orangeButton = new JButton("Orange");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(orangeButton);

        add(buttonPanel, BorderLayout.NORTH);

        statusLabel = new JLabel("Ready", JLabel.CENTER);
        add(statusLabel, BorderLayout.CENTER);

        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Stop");
            }
        });

        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Go");
            }
        });

        orangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusLabel.setText("Ready");
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	traffic trafficLights = new traffic();
            trafficLights.setVisible(true);
        });
    }
}
