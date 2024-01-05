package cse5i5;
class node

{

	int data;

	node prev;

	node next;

	node(int data)

	{

		this.data=data;

		this.prev=null;

		this.next=null;

	}

}

class dl

{

	node head;

	public dl()

	{

		this.head=null;

	}

	public void append(int data)

	{

		node n=new node(data);

		if(head==null)

		{

			head=n;

		}

		else {

			node current=head;

			{

				while(current.next!=null)

				{

					current=current.next;

				}

				current.next=n;

				n.prev=current;

			}

		}

	}

	public void ft()

	{

		node current=head;

		while(current!=null)

		{

			System.out.println(current.data);

			current=current.next;

			

		}

	}

	public void bf()

	{

		node current=head;

		while(current!=null && current.next!=null)

		{

			current=current.next;

		}

		while(current!=null)

		{

			System.out.println(current.data);

			current=current.prev;

			

		}

	}

}


public class Doublr {
	public static void main(String[] args)

	{

		dl d =new dl();

		d.append(1);

		d.append(45);

		d.append(67);

		d.ft();

		d.bf();

	}

}
