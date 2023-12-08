package frame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class next extends Frame {
    Button submitButton, nextButton;

    public next() {
        setTitle("Page");
        setSize(600, 600);
        setLayout(null);

        submitButton = new Button("Submit");
        nextButton = new Button("Next");

        submitButton.setBounds(200, 220, 100, 30);
        nextButton.setBounds(400, 220, 100, 30);

        submitButton.setBackground(Color.orange);
        nextButton.setBackground(Color.cyan);

        add(submitButton);
        add(nextButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new NextFrame();
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new next();
    }

 
    private class NextFrame extends Frame {
        public NextFrame() {
            setTitle("Next Page");
            setSize(600, 600);
            setLayout(null);

            nextButton = new Button("empty button");
            nextButton.setBounds(200, 220, 100, 30);
            add(nextButton);
            
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });

            setVisible(true);
        }
    }
}
