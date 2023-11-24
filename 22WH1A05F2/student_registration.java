package cse225f2;
import java.awt.event.*;
import java.awt.*;
public class student_registration
{
		public static class window extends Frame{
			window(){
				addWindowListener(new WindowAdapter()
						{
					public void windowClosing(WindowEvent e) {
						dispose();
					}
						});
				setTitle("Student Registration");
				setSize(1800,1600);
				setLayout(null);
				Label titleLabel=new Label("Student Registration Form");
				titleLabel.setFont(new Font("Arial",Font.BOLD,20));
				titleLabel.setBounds(350,100,500,100);
				add(titleLabel);
				Label l = new Label("Student name");
				l.setBounds(70, 200, 100, 30);
				add(l);
				TextField t = new TextField();
				t.setBounds(180, 200, 200, 40);
				add(t);
				Label l1 = new Label("Department");
				l1.setBounds(70, 300, 100, 40);
				add(l1);
				TextField t1 = new TextField();
				t1.setBounds(180, 300, 200, 40);
				add(t1);
				Label l2 = new Label("Roll.No");
				l2.setBounds(70, 400, 100, 40);
				add(l2);
				TextField t2 = new TextField();
				t2.setBounds(180, 400, 200, 40);
				add(t2);
				Label l3 = new Label("Phone.no");
				l3.setBounds(70, 500, 100, 40);
				add(l3);
				TextField t3 = new TextField();
				t3.setBounds(180, 500, 200, 40);
				add(t3);
				setVisible(true);
			}
			public static void main(String args[]) {
				new window();
			}
		}
	}
