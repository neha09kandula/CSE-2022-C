package Frame;

public class dbl { 
	class node{
		int data;
		node prev;
		node next;
		public node(int data) {
			this.data=data;
		}
	}
	node head,tail=null;
	public void insert(int data) {
		node newnode=new node(data);
		
		if(head==null) {
			head=tail=newnode;
			head.prev=null;
			tail.next=null;
		}
		else {
			tail.next=newnode;
			newnode.prev=tail;
			tail=newnode;
			tail.next=null;
			
		}
	}
	public void display() {
		node p=head;
		if(p==null) {
			System.out.println("Empty");
		}
		else {
			while(p!=null) {
				System.out.println(p.data);
				p=p.next;
			}
		}
	}
	public static void main(String[] args) {
			dbl obj=new dbl();
			
			obj.insert(20);
			obj.insert(73);
			obj.display();
	}
}