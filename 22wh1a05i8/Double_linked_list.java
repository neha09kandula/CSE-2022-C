package cse225i8;
import java.util.*;
public class Double_linked_list {
	
	static class Node {
        int data;
        Node prev;
        Node next;
    }

    static Node head = null;


    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Insert_front");
            System.out.println("2. Insert_End");
            System.out.println("3. Display");
            System.out.println("4. Delete_Front");
            System.out.println("5. Delete_End");
            System.out.println("6. Display_Reverse(By Recurssion)");
            System.out.println("7. Display_Reverse(Without Recurssion)");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    insert_front();
                    break;
                case 2:
                    insert_end();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    delete_front();
                    break;
                case 5:
                    delete_end();
                    break;
                case 6:
                    display_rev(head);
                    break;
                case 7:
                    display_reverse();
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }
    static void insert_front() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        int ele = sc.nextInt();
        Node p = new Node();
        p.data = ele;
        p.prev = null;
        p.next = null;
        if (head == null) {
            head = p;
        } else {
            p.next = head;
            head.prev = p;
            head = p;
        }
    }
    static void display() {
        Node t = head;
        if (head == null) {
            System.out.println("List Is Empty");
        } else {
            while (t != null) {
                System.out.print(t.data + " ");
                t = t.next;
            }
        }
    }
    static void insert_end() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        int ele = sc.nextInt();
        Node p = new Node();
        p.data = ele;
        p.prev = null;
        p.next = null;
        if (head == null) {
            head = p;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            p.prev = t;
            t.next = p;
        }
    }
    static void delete_front() {
        Node t = head;
        if (head == null) {
            System.out.println("List Is Empty");
        } else {
            head = head.next;
            head.prev = null;
            System.out.println("Deleted element: " + t.data);
        }
    }
    static void delete_end() {
        Node t = head;
        if (head == null) {
            System.out.println("List Is Empty");
        } else {
            while (t.next != null) {
                t = t.next;
            }
            t.prev.next = null;
            System.out.println("Deleted element: " + t.data);
        }
    }

    static int display_rev(Node head) {
        if (head == null) {
            return 0;
        } else {
            int count = display_rev(head.next);
            System.out.print(head.data + " ");
            return count + 1;
        }
    }
    static void display_reverse() {
        Node t = head;
        if (head == null) {
            System.out.println("List Is Empty");
        } else {
            while (t.next != null) {
                t = t.next;
            }
            while (t != null) {
                System.out.print(t.data + " ");
                t = t.prev;
            }
        }
    }
}
