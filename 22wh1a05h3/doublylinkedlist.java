package cse225g2;
import java.util.*;

class node{
	int data;
	node next;
	node previous;
	
	public node(int data)
	{
		this.data=data;
		this.next=null;
		this.previous=null;
	}
}
 
class doublelink{
	
	private node head;
	public doublelink()
	{
		this.head=null;
	}
	//method to insert node at front
	public void insert(int data)
	{
		node n1=new node(data);
		node t = head;
		if(head==null)
		{
			head=n1;
		}
		
		else
		{
			n1.next=head;
			head=n1;
		}
	}
	//method to display
	
	public void display()
	{
		node t = head;
		while(t!=null)
		{
			System.out.print(t.data);
			t=t.next;
		}
	}
	//method to insert at end
	
	public void insertend(int data)
	{
		node n1=new node(data);
		node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=n1;
		n1.previous=t;
	}
	//method to delete front 
	public void delete()
	{
		node t=head;
		if(head==null)
		{
			System.out.println("empty list");
		}
		else
		{
		head=head.next;
		head.previous=null;
		}
		
	}
	//method to delete end
	public void deleteend()
	{
		node t =head;
		if(head==null)
		{
			System.out.println("empty list");
		}
		else
		{
		while(t.next!=null)
		{
			t=t.next;
		}
		t.previous.next=null;
		}
	}
	//method to insert node at particular position
	public void insertparticular(int data,int position)
	{
		 node n1 = new node(data);

	        if (position <= 0) {
	            System.out.println("Invalid position");
	            return;
	        }

	        if (position == 1) {
	            n1.next = head;
	            if (head != null) {
	                head.previous = n1;
	            }
	            head = n1;
	            return;
	        }

	        node t = head;
	        for (int i = 1; i < position - 1 && t != null; i++) {
	            t = t.next;
	        }

	        if (t == null) {
	            System.out.println("Invalid position");
	            return;
	        }

	        n1.next = t.next;
	        n1.previous = t;
	        if (t.next != null) {
	            t.next.previous = n1;
	        }
	        t.next = n1;
	    }
	}

public class doublylinkedlist {

	public static void main(String[]args)
	{
		doublelink dll=new doublelink();
		dll.insert(5);
		dll.insert(4);
		dll.insert(3);
		dll.insertend(6);
		dll.delete();
		dll.deleteend();
		dll.insertparticular(30,2);
		dll.display();
		
	}
	
	
}
