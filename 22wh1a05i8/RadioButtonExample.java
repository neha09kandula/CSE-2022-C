package cse225i8;

import javax.swing.*;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.*;
class RadioButtonExample extends JFrame implements ActionListener {
   JRadioButton rb1, rb2,rb3;
   JButton b;
   RadioButtonExample() {
      rb1 = new JRadioButton("Red");
      rb1.setBounds(50,60,80,100);
      rb1.setForeground(Color.RED);
      rb1.setBackground(getForeground());
      
      rb2 = new JRadioButton("green");
      rb2.setBounds(100, 100, 100, 30);
      
      rb3 = new JRadioButton("yellow");
      rb3.setBounds(100, 150, 100, 30);
      ButtonGroup bg = new ButtonGroup();
      bg.add(rb1);
      bg.add(rb2);
      b = new JButton("click");
      b.setBounds(100, 200, 80, 30);
      b.addActionListener(this);
      add(rb1);
      add(rb2);
      add(rb3);
      add(b);
      setSize(300, 300);
      setLayout(null);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent e) {
      if (rb1.isSelected()) {
         JOptionPane.showMessageDialog(this, "stop ");
      }
      if (rb2.isSelected()) {
         JOptionPane.showMessageDialog(this, "go");
         
      }
      if (rb3.isSelected()) {
          JOptionPane.showMessageDialog(this, "get ready");
      }
   }
   public static void main(String args[]) {
      new RadioButtonExample();
   }
}
