import java.io.*;
import java.util.*;

class Node {
    Node next;
    int data;

    public Node(int d) {
        data = d;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        } else
            return false;
    }

    void insertlast(int j) {
        Node n = new Node(j);
        if (isEmpty()) {
            head = n;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
        }
    }

    void deletelast() {
        if (head == null)
            System.out.println("Empty list");
        else {
            Node curr = head;
            Node nextNode = curr.next;
            while (nextNode.next != null) {
                curr = curr.next;
                nextNode = nextNode.next;
            }
            nextNode = curr;
            nextNode.next = null;
        }
    }

    void display() {
        Node curr = head;
        if (head == null) {
            System.out.println("Empty list");
        } else {
            while (curr != null) {
                System.out.println("List:" + curr.data);
                curr = curr.next;
            }

        }
    }


    void duplicate() {
        Node curr = head;
        Node temp = head.next;
        while (curr != null) { 
            temp = curr.next;
            while(temp.next!=null){
                if (temp.next.data == curr.data) {
                    temp.next = temp.next.next;
                } 
                temp = temp.next;
            }
            curr=curr.next;
           

        }

        }
    }


public class Sample {
    public static void main(String St[]) {
        int size, a;
        LinkedList obj = new LinkedList();
        Scanner scn = new Scanner(System.in);
        // System.out.println("Enter a size: ");
        // size = scn.nextInt();
        // System.out.println("Enter elements: ");

        // a = scn.nextInt();
        obj.insertlast(5);
        obj.insertlast(7);
        obj.insertlast(3);
        obj.insertlast(4);
        obj.insertlast(5);
        obj.duplicate();
        // size--;

        obj.display();

    }
}