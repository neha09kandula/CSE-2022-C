package MYpkg; 

public class Doubly_linked_list2 { 
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
		node new_node=new node(data);
		
		if(head==null) {
			head=tail=new_node;
			head.prev=null;
			tail.next=null;
		}
		else {
			tail.next=new_node;
			new_node.prev=tail;
			tail=new_node;
			tail.next=null;
			
		}
	}
	public void display() {
		node temp=head;
		if(temp==null) {
			System.out.println("Empty");
		}
		else {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
	public static void main(String[] args) {
			Doubly_linked_list2 obj=new Doubly_linked_list2();
			
			obj.insert(23);
			obj.insert(30);
			obj.insert(45);
			obj.display();
	}
}

