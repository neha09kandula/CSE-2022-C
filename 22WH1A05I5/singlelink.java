package cse5i5;
class node1

{

	int data;

	node1 link;

	public node1(int data)

	{

		this.data=data;

		this.link=null;

	}

}

class singlelinkedlist

{

	node1 head;

	singlelinkedlist()

	{

		this.head=null;

	}

	public void append(int data)

	{

	   node1 n=new node1(data);

		node1 t=head;

		if(head==null)

		{

			head=n;

		}

		else

		{

			while(t.link!=null)

			{

			

				t=t.link;

			}

			t.link=n;

		}

		}

	public void tra()

	{

		node1 t=head;

		if(head==null)

		{

			System.out.println("list is empty");

		}

		else

		{

			while(t!=null)

			{

				System.out.println(t.data);

				t=t.link;

			}

		}

	}

}



public class singlelink {
	public static void main(String[] args)

	{

		singlelinkedlist s=new singlelinkedlist();

		s.append(12);

		s.append(45);

		s.append(89);

		s.tra();

		

	}

}


