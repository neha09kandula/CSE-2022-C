package cse_c;

import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListener_Example{
public class MouseListener_Example extends frame implements MouseListener {
		Label l;
		MouseListener_Example();
		{
			Object add;
			((MouseListener_Example)add).MouseListener_Example();
			l=newlabel();
			l.setBounds(20,50,70,90);
			add(l);
			SetSize(50,50);
			SetBounds(30,60,80,100);
			SetVisiblity(true);
		}
			public abstract void MouseClicked(MouseEvent e) {
				l.Settext("MouseClicked");
		}
			public static void main(String[] args){
				new MouseListener_Example();
			}
	}
}