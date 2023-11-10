package Frames;

import java.awt.Frame;

import Frames.firstframe.MyComponent;

public class button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Frame f = new Frame("My First Frame");
	     f.setSize(400, 300);
	     f.add(new MyComponent());
	     f.setVisible(true);
	     
	}

}
