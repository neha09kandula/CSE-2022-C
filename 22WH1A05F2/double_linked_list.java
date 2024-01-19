package cse225f2;
import java.util.*;

public class double_linked_list {
	class node{
		int data;
		node link;
		node prev;	
	public node(int data) {
		this.data=data;
	}
	}
	node head =null;
	public void insert_front(int data) {
		node p=new node(data);
		if(head==null) {
			p.link=null;
			p.prev=null;
			head=p;
		}
		else {
			p.prev=null;
			p.link=head;
			head.prev=p;
			head=p;
		}
	}
	public void display() {
		if(head==null) {
			System.out.println("List is Empty..");
		}
		else {
			node temp=head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.link;
			}
		}
	}
	public void insert_end(int data) {
		node p=new node(data);
		if(head==null){
			p.link=null;
			p.prev=null;
			head=p;
		}
		else {
			node temp=head;
			while(temp.link!=null) {
				temp=temp.link;
			}
			temp.link=p;
			p.prev=temp;
			p.link=null;
		}
	}
	public void delete_front() {
		if(head==null) {
			System.out.println("List is Empty...");
		}
		else {
			node temp=head;
			int a=head.data;
			temp=temp.link;
			temp.prev=null;
			head=temp;
			System.out.println("The node with data as "+a+" is deleted");
		}
	}
	public void delete_end() {
		if(head==null) {
			System.out.println("List is Empty..");			
		}
		else {
			if(head.link==null) {
				int b=head.link.data;
				head=null;
				System.out.println("The node with data as "+b+" is deleted");
			}
			else {
			node temp=head;
			while(temp.link.link!=null) {
				temp=temp.link;			
			}
			int a=temp.link.data;
			temp.link=null;
			System.out.println("The node with data as "+a+" is deleted");
		}}
	}
	public static void main(String args[]) {
		int ch;
		double_linked_list dll=new double_linked_list();
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("1.insert_front\n2.display\n3.insert_end\n4.delete_front\n5.delete_end\n6.exit");
			System.out.println("Enter your choice:");
			ch=in.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter element to insert:");
				int a = in.nextInt();
				dll.insert_front(a);
				break;}
			case 2:{
				dll.display();
				break;
			}
			case 3:{
				System.out.println("Enter element to insert:");
				int b = in.nextInt();
				dll.insert_end(b);
				break;
			}
			case 4:{				
				dll.delete_front();
				break;
			}
			case 5:{			
				dll.delete_end();
				break;
			}			
			case 6:{
				System.exit(0);
				break;
			}
			}
		}
	}
}