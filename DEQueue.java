import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class DEQueue {
    public Node head;
    public Node tail;

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;

    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
           
            tail = newNode;
        }
        else{
            newNode.next = head;
           
        }
        head = newNode;
        

    }
    public void deleteFirst(){
        head = head.next;
    }
    public void deleteLast(){
        Node temp = head;
        while(temp.next!=tail){
           temp= temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        DEQueue dq = new DEQueue();
        dq.insertFirst(5);
        dq.insertFirst(15);
        dq.insertFirst(25);
        dq.deleteFirst();
        dq.insertLast(35);
        dq.insertLast(45);
        dq.deleteLast();
        dq.display();
    }

    
}
