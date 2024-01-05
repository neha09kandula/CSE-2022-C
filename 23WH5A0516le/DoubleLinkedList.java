package java07;

public class DoubleLinkedList {

	
		 private Node head;
		    private Node tail;

		    public DoubleLinkedList() {
		        this.head = null;
		        this.tail = null;
		    }

		    public void insert(int data) {
		        Node newNode = new Node(data);
		        if (head == null) {
		            head = newNode;
		            tail = newNode;
		        } else {
		            tail.next = newNode;
		            newNode.prev = tail;
		            tail = newNode;
		        }
		    }

		    public void display() {
		        Node current = head;
		        while (current != null) {
		            System.out.print(current.data + " ");
		            current = current.next;
		        }
		        System.out.println();
		    }
		

	}


