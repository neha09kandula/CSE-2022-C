package cse_c_225f8;

import java.util.*;
class node
{
	int data;
	node pre=null;
	node next=null;
	/*public node(int data)
	{
		this.data=data;
		this.pre=null;
		this.next=null;
	}*/
}
public class DoubleLL {
	static node head;
	static node tail;
	public static void main(String[]args)
	{
		System.out.println("1.Insert ,2.Delete ,3.Display ,4.exit");
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:Insert_front();
			break;
			case 2:Delete();
			break;
			case 3:Display(head);
			break;
			default:System.out.println("enter the correct choice");
			break;
			}
			
		}
	}
	public static  void Insert_front() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter data into the node");
		int ele=s.nextInt();
		node p=new node();
		if(head==null)
		{
			head=p;
			tail=p;
		}
		else
		{
			p.next=head;
			head.pre=p;
			head = p;
		}
	}
	public static void Insert_end()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter data into the node");
		int ele=s.nextInt();
		node p=new node();
		node t=head;
		if(head==null)
		{
			head=p;
			//tail=p;
		}
		else
		{
			
		}
	}
	public static void Delete() {
		if(head==null)
		{
			System.out.println("list is empty");
			return;
	}
		else
		{
			if(head.next==null)
			{
				head=null;
				//tail=null;
				return;
			}
			else
			{
				node t = head;
				head = head.next;
				head.pre=null;
				t.pre = null;
				t.next = null;
				System.out.println("deleted");
			}
		}
	}

	public static void Display(node head) {
		node p=head;
		if(head==null)
		{
			System.out.println("DLL is empty");
		}
		else
		{
		while(p!=tail)
		{
			System.out.println(head.data);
			head=head.next;
		}
		System.out.println(p.data);
		}
	}
}
