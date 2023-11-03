package Frames;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;

import Frames.firstframejava.MyComponent;

public class shapes {

	public static void main(String[]args)
	{
		//auto-generated method
		Frame f= new Frame("My first frame");
		f.setSize(400,300);
		f.add(new MyComponent());
		f.setVisible(true);
    }
		static class MyComponent extends Component{
			/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

			public void paint(Graphics g) {
				
	}