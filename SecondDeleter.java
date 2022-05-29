import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class SecondDeleter {
    public Node head;
    public Node tail;

   public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;   
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;    
    }
    public void deleter(){
     Node temp =head;
     while(temp!=null){
         if( temp.next!=null){
             temp.next = temp.next.next;
         }
         
         temp = temp.next;
     }

    }
    public void display(){
        Node temp = head;
        if(head ==null){
            System.out.println("Empty");
            return;
        }
        while(temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        SecondDeleter sd = new SecondDeleter();
        sd.addNode(5);
        sd.addNode(4);
        sd.addNode(3);
        sd.addNode(8);
        sd.deleter();
        sd.display();
        
    }
    
}
