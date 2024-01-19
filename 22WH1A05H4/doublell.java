package javaprogrames;
class node
{
	int data;
	node next;
	node pre;
public node(int data)
{
	this.data=data;
	this.next=null;
	this.pre=null;
}
}
class doublelink{
	private node head;
	public doublelink() {
		this.head=null;
	}
//insert at front
public void insertfront(int data) {
	node n1=new node(data);
	if(head==null)
	{
		head=n1;
	}
	else {
	node t=head;
	n1.next=head;
    head=n1;
}}
//insertion at end
public void insertend(int data) {
	node n1=new node(data);
	node t=head;
	while(t.next!=null) {
		t=t.next;
	}
	t.next=n1;
	n1.pre=t;
}
// delete front
public void deletefront() {
	if(head==null) {
		System.out.println("Double link list is empty");
	}
	else
	{
		node t=head;
		head=head.next;
		head.pre=null;
		
	}
}
//delete end
public void deleteend() {
	node t=head;
	if(head==null) {
		System.out.println("Double link list is empty");
	}
	else
	{
		while(t.next!=null)
		{
			t=t.next;
		}
		t.pre.next=null;
	}
}
// insert at particular position
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
          head.pre = n1;

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

        n1.pre = t;

        if (t.next != null) {

            t.next.pre = n1;

        }

        t.next = n1;

    }


// display
	public void display() {
		node t=head;
		while(t!=null) {
			System.out.println(t.data);
			t=t.next;
		}
		
	}
}
public class doublell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    doublelink dll= new doublelink();
    dll.insertfront(5);
    dll.insertfront(7);
    dll.insertfront(8);
    dll.insertend(10);
    dll.deletefront();
    dll.deleteend();
    dll.insertparticular(30,2);
    System.out.println("Doubly Linked List:");
    dll.display();
	}

}
