package javaprogrames;
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the doubly linked list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
            newNode.prev = current;
        }
    }

    // Method to display the elements of the doubly linked list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to display the elements of the doubly linked list in reverse order
    public void displayReverse() {
        Node current = head;

        while (current != null && current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Double {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.append(1);
        dll.append(2);
        dll.append(3);

        System.out.println("Doubly Linked List:");
        dll.display(); // Output: 1 2 3

        System.out.println("Doubly Linked List in Reverse:");
        dll.displayReverse(); // Output: 3 2 1
    }
}
