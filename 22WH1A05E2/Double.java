package linkedList;

import java.util.Scanner;

class node
{
	int data;
	node next,prev;
	public Object getLinkNext;
	public node()
	{
		data=0;
		next=null;
		prev=null;
	}
	public node(int d,node n,node p)
	{
		data=d;
		next=n;
		prev=p;
	}
	public void setLinkNext(node n)
	{
		next=n;
	}
	public void setLinkPrev(node p)
	{
		prev=p;
	}
	public node getLinkNext()
	{
		return next;
	}
	public node getLinkPrev()
	{
		return prev;
	}
	public void setData(int d)
	{
		data=d;
	}
	public int getData()
	{
		return data;
	}
}
class LinkedList
{
	node start;
	node end;
	int size;
	public LinkedList()
	{
		start=null;
		end=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return start==null;
	}
	public int getSize()
	{
		return size;
	}
	public void insertAtStart(int val)
	{
		node nptr=new node(val,null,null);
		if(start==null)
		{
			start=nptr;
			end=start;
		}
		else
		{
			start.setLinkPrev(nptr);
			nptr.setLinkNext(start);
			start=nptr;
		}
		size++;
	}
	public void insertAtEnd(int val)
	{
		node nptr=new node(val,null,null);
		if(start==null)
		{
			start=nptr;
			end=start;
		}
		else
		{
			nptr.setLinkPrev(end);
			end.setLinkNext(nptr);
			end=nptr;
		}
		size++;
	}
	public void insertAtPos(int val,int pos)
	{
		node nptr=new node(val,null,null);
		if(pos==1)
		{
			insertAtStart(val);
			return;
		}
		node ptr=start;
		for(int i=2;i<=size;i++)
		{
			if(i==pos)
			{
				node temp=ptr.getLinkNext();
				ptr.setLinkNext(nptr);
				nptr.setLinkPrev(ptr);
				nptr.setLinkNext(temp);
				temp.setLinkPrev(nptr);
			}
			ptr=ptr.getLinkNext();
		}
		size++;
	}
	public void deleteAtPos(int pos)
	{
		if(pos==1)
		{
			if(size==1)
			{
				start=null;
				end=null;
				size=0;
				return;
			}
			start=start.getLinkNext();
			start.setLinkPrev(null);
			size--;
			return;
		}
		if(pos==size)
		{
			end=end.getLinkPrev();
			end.setLinkNext(null);
			size--;
		}
		node ptr=start.getLinkNext();
		for(int i=2;i<=size;i++)
		{
			if(i==pos)
			{
				node p=ptr.getLinkPrev();
				node n=ptr.getLinkNext();
				p.setLinkNext(n);
				n.setLinkPrev(p);
				size--;
				return;
			}
			ptr=ptr.getLinkNext();
		}
	}
	public void display()
	{
		System.out.println("Doubly Linked List=");
		if(size==0)
		{
			System.out.println("List is empty.");
			return;
		}
		if(start.getLinkNext==null)
		{
			System.out.println(start.getData());
			return;
		}
		node ptr=start;
		System.out.println(start.getData()+"<->");
		ptr=start.getLinkNext();
		while(ptr.getLinkNext()!=null)
		{
			System.out.println(ptr.getData()+"<->");
			ptr=ptr.getLinkNext();
		}
		System.out.println(ptr.getData()+"\n");
	}
}
public class Double
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList list=new LinkedList();
		System.out.println("Doubly Linked List Test");
		char ch;
		do
		{
			System.out.println("Doubly Linked List Operation");
			System.out.println("1.Insert At Begining");
			System.out.println("2.Insert At Ending");
			System.out.println("3.Insert At Position");
			System.out.println("4.Delete At Position");
			System.out.println("5.Check Empty");
			System.out.println("6.Get Size");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1 :
					System.out.println("Enter integer element to insert");
					list.insertAtStart(sc.nextInt() );
					break;
				case 2 :
					System.out.println("Enter integer element to insert");
					list.insertAtEnd(sc.nextInt() );
					break;
				case 3 :
					System.out.println("Enter integer element to insert");
					int num = sc.nextInt() ;
					System.out.println("Enter position");
					int pos = sc.nextInt() ;
					if (pos < 1 || pos >list.getSize() )
						System.out.println("Invalid position\n");
					else
						list.insertAtPos(num,pos);
					break;
				case 4 :
					System.out.println("Enter position");
					int p = sc.nextInt() ;
					if (p < 1 || p > list.getSize() )
						System.out.println("Invalid position\n");
					else
						list.deleteAtPos(p);
					break;
				case 5 :
					System.out.println("Empty status = "+ list.isEmpty());
					break;
				case 6 :
					System.out.println("Size = "+ list.getSize() +" \n");
					break;
				default :
					System.out.println("Wrong Entry \n ");
					break;
			}
				/* Display List */
			list.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y'|| ch == 'y');
	}
}
