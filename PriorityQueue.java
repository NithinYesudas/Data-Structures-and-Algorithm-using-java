import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class PriorityQueue {
    public Node head;
    public Node tail;

    PriorityQueue() {
        head = null;
        tail = null;
    }

    public void addData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (newNode.data < head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (newNode.data > tail.data) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;

        } else {
            Node temp = head;
            while (temp != null) {
                if (data < temp.data) {

                    newNode.next = temp;
                    newNode.prev = temp.prev;
                    temp.prev.next = newNode;
                    temp.prev = newNode;

                }
                temp = temp.next;
            }

        }

    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.addData(10);
        pq.addData(5);
        pq.addData(3);
        pq.addData(12);
        pq.display();
    }

}
