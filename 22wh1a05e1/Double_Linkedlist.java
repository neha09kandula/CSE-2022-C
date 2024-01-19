package cse225e1;
import java.io.*;
import java.util.Scanner;

public class Double_Linkedlist 
{
@SuppressWarnings("unused")
	
	int data;
	Double_Linkedlist prev;
	Double_Linkedlist next;
	Double_Linkedlist(int value)
	{
		this.data = value;
	}
	void display()
	{
		System.out.println(data); 
	}
}
class Linked
{
	public Linkedlist fstnode,lastnode;
	Linked()
	{
		fstnode = null;
		lastnode = null;
	} 
	void Insert_Front(int value)
	{
		Linkedlist node = new Linkedlist(value);
		if(fstnode == null)
		{
			node.prev = node.next = null;
			fstnode = lastnode=node;
			System.out.println("linked list extracted  successfully");
		}
		else
		{
			node.prev = null;
			node.next = fstnode;
			fstnode.prev = node;
			fstnode = node;
			System.out.println("node inserted at the first of the linkedlist");
		}
	}
	void insert_End(int value)
	{
		Linkedlist node = new Linkedlist(value);
		if(fstnode == null)
		{
			node.prev = node.next = null;
			fstnode = lastnode = node;
			System.out.println("Linkedlist created successfully");
		}
		else
		{
			node.next = null;
			node.prev = null;
			lastnode.next = node;
			lastnode = node;
			System.out.println("Node inserted at the end of the Linkedlist");
		}
	}
	void delete()
	{
		
		int count = 0,number,i;
		Linkedlist node,node1,node2;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		for(node=fstnode;node != null;node=node.next);
		count++;
		display();
		node = node1=node2=fstnode;
		System.out.println(count+"NOdes are available");
		System.out.println("Enter the node to be deleted");
		number = Integer.parseInt(input.nextLine());
		if(number != 1)
		{
			if(number < count && number > 0)
			{
				for(i=2;i<=number;i++)
					node = node.next;
				for(i=2;i<=number-1;i++)
					node1 = node1.next;
				for(i=2;i<=number+1;i++)
					node2 = node2.next;
					node2.prev = node1;
					node1.next = node2;
					node.prev = null;
					node.next = null;
					node = null;
			}
			else if(number == count)
			{
					node = lastnode;
					lastnode = node.prev;
					lastnode.next = null;
			}
			else
			{
					System.out.println("Invalid node number!\n");
			}	
		}
		else
		{
			node = fstnode;
			fstnode = node.next;
			fstnode.prev = null;
			node = null;
		}
		System.out.println("Node had been deleted successfully!\n");
	}
	void display()
	{
		Linkedlist node = fstnode;
		System.out.println("List of node from first to last");
		while(node != null)
		{
			node.display();
			node = node.next;
		}
		node = lastnode;
		System.out.println("list of node from last to first");
		while(node!=null)
		{
			node.display();
			node=node.prev;
		}
	}
}
public class Double_Linkedlist
{
	public static void main(String args[])
	{
		Linked list = new Linked();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int op = 0;
		while(op!=5)
		{
			System.out.println("1.Insert at front\n2.Insert at back\n3.Delete\n4.Display\n5.exit");
			System.out.println("Enter your choice: ");
			op = Integer.parseInt(input.nextLine());
			switch(op)
			{
			case 1:
				System.out.println("Enter the positive value for Linkedlist");
				list.Insert_Front(Integer.parseInt(input.nextLine()));
				break;
			case 2:
				System.out.println("Enter a positive number for LinkedList");
				list.insert_End(Integer.parseInt(input.nextLine()));
				break;
			case 3:
				list.delete();
				break;
			case 4:
				list.display();
				break;
			case 5:
				System.out.println("Bye Bye!");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice!");
			}
		}
			}
}

