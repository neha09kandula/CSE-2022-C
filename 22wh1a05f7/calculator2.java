package cse225f7;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;



public class calculator2 extends Frame {


	Button b1,b2,b3,b4,b5,b6,b7,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9;

	Label l1;

	TextArea t1;

	String current,expression;

	Panel p;

	calculator2 (){

	this.setLayout(new BorderLayout());

	p=new Panel(new GridLayout(4,4));

	b1=new Button("+");

	b2=new Button("-");

	b3=new Button("*");

	b4=new Button("/");

	b5=new Button("AC");

	b6=new Button("=");

	b7=new Button(".");

	n0=new Button("0");

	n1=new Button("1");

	n2=new Button("2");

	n3=new Button("3");

	n4=new Button("4");

	n5=new Button("5");

	n6=new Button("6");

	n7=new Button("7");

	n8=new Button("8");

	n9=new Button("9");

	this.add(p);

	p.add(n0);

	p.add(n1);

	p.add(n2);

	p.add(n3);

	p.add(n4);

	p.add(n5);

	p.add(n6);

	p.add(n7);

	p.add(n8);

	p.add(n9);

	p.add(b1);

	p.add(b2);

	p.add(b3);

	p.add(b4);

	p.add(b5);

	p.add(b6);

	t1 = new TextArea(5,5);

	this.add(t1,BorderLayout.NORTH);

	}







	public static void main(String[] args) {

	calculator2 f = new calculator2();

	f.setVisible(true);

	f.setSize(350,500);

	f.addWindowListener(new MyClass());

	}

	}



	class MyClass extends WindowAdapter {

	public void windowClosing(WindowEvent we) {

	System.exit(0);

	}

	}