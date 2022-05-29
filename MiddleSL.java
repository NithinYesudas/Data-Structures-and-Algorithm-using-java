import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class MiddleSL {
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
    public int length(){
    int count=0;
    Node temp = head;
    while(temp !=null){
        count++;
        temp = temp.next;

    }
    return count;

    }
    public static void main(String[] args) {
        MiddleSL middlesl = new MiddleSL();
        middlesl.addNode(5);
        middlesl.addNode(4);
        middlesl.addNode(3);
        middlesl.addNode(8);
        middlesl.addNode(5);
        middlesl.addNode(1);
        float avg=0,prev=0;
        Node temp = middlesl.head;
        if(middlesl.length()%2==0){
            for(int i=1;i<(middlesl.length()/2)+1;i++){
                prev =temp.data;
                temp = temp.next;
                avg = temp.data;
            }
            avg = (avg+prev)/2;
        }
        else{
            for(int i=0;i<(middlesl.length()+1)/2;i++){
                avg = temp.data;
                temp = temp.next;
          }
        }
        System.out.println(avg);
        
    }

   
    
}
