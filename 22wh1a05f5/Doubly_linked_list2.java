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
	public void insert_end(int data) {
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
	public void delete_end() {
		node temp=head;
		if(head==null) {
			System.out.println("Empty");
		}
		else if(head.next==null) {
			head=null;
		}
		else {
			while(temp.next!=null) {
				temp=temp.next;
			}
			node t1=temp;
			temp=temp.prev;
			temp.next=null;
			
		}
	}
	public void delete_front() {
		
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			head=head.next;
			node temp=head;
			temp.prev=null;
			
			
		}
	}
	public void insert_front(int data) {
		node new_node=new node(data); 
		
		if(head==null) {
			head=tail=new_node;
			head.prev=null;
			tail.next=null;
		}
		else {
			node temp=head;
			head=new_node;
			head.prev=null;
			head.next=temp;
			temp.prev=head;
		}
		
	}
	public static void main(String[] args) {
			Doubly_linked_list2 obj=new Doubly_linked_list2();
			
			obj.insert_end(23);
			obj.insert_end(30);
			obj.insert_end(45);
			System.out.println("List after insertion is ");
			obj.display();
			obj.delete_end();
			System.out.println("List afetr deletion of the end node is ");
			obj.display();
			obj.delete_front();
			System.out.println("list after deletion of front node is ");
			obj.display();
			obj.insert_front(23);
			System.out.println("list after inserting ele at front is ");
			obj.display();
	}
}

