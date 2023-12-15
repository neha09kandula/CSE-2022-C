package cse;
import java.awt.event.*;
import java.awt.*;
public class calci{
			public static class window extends Frame
			{
				window()
				{
					addWindowListener(new WindowAdapter()
					{
						public void windowClosing(WindowEvent e)
						{
							dispose();
				}

					});
					setTitle("Calculator");
					setSize(900,900);
					setLayout(null);
					Label l = new Label("OPERATION");
					l.setFont(new Font("Arial",Font.BOLD,30));
					l.setBounds(500,75,500,200);
					add(l);
					Button b1=new Button("RESULT");
					b1.setBounds(300, 720, 200, 100);
					add(b1);
					Button b2=new Button("+");
					b2.setBounds(500,600,200,100);
					add(b2);
					Button b3=new Button("-");
					b3.setBounds(300,600,200,100);
					add(b3);
					TextField T = new TextField();
					T.setBounds(300,300,400,80);
					add(T);
					Label l2 = new Label("enter element1");
					l2.setFont(new Font("Arial",Font.BOLD,30));
					l2.setBounds(200,200,300,60);
					add(l2);
					Label l3 = new Label("enter element2");
					l3.setFont(new Font("Arial",Font.BOLD,30));
					l3.setBounds(200,400,300,60);
					add(l3);
					TextField T1 = new TextField();
					T1.setBounds(300,500,400,80);
					add(T1);
					setVisible(true);
				}
				public static void main(String args[])
				{
					new window();
				}
			}
		}
