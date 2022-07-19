import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;

    }
}
public class CircularQueue {
    public Node start;
    public Node end;

    public void addList(int data){
        Node newNode = new Node(data);
        if(start == null){
            start = newNode;
        }
        else{
            end.next = newNode;
            newNode.next = start;
        }
        end = newNode;
    }

    public void delete(){
        start = start.next;
        end.next = start;
    }
    
    public void display(){
     Node temp = start;
     do {
        System.out.println(temp.data);
        temp = temp.next; 
     }while(temp != start);
     
    }
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.addList(5);
        cq.addList(10);
        cq.addList(15);
        cq.addList(20);
        cq.delete();
        cq.addList(40);
        cq.addList(50);
        cq.display();
    }
}
