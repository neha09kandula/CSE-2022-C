package cse225f7;
import java.awt.*;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;



public class Windowframe extends Frame {

	Windowframe()

	{

		addWindowListener(new WindowAdapter()

			{  

			public void windowClosing(WindowEvent e)

			{

				dispose();

			}

				});

		setSize(400,400);

		setBounds(30,40,80,60);

		setLayout(null);

		setVisible(true);

		

		

		



	}

	public void paint(Graphics g)

	{

		g.drawRect(200, 345,560, 450);

	}











	public static void main(String[] args) {

		new Windowframe();

		// TODO Auto-generated method stub



	}



}

