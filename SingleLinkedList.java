
import java.util.ArrayList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class SingleLinkedList {
    public Node head;
    public Node tail;

    void addNode(int data){
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
    public void delete(int data){
        if(head !=null&&head.data == data){
            head = head.next;
            return;
        }
        Node temp = head,prev = null;
        while(temp!=null){
            if(temp.data == data){
                prev.next = temp.next;
                if(temp == tail){
                    tail = prev;
                    tail.next = null;
                }
            }
            prev = temp;
            temp = temp.next;
        }
    }

    public void insert(int searchData,int data){

        Node newNode = new Node(data);
        Node temp = head;
        if(searchData == head.data){
            head = newNode;
            newNode.next = temp;
            return;

        }
        while(temp!=null){
            if(temp.next.data == searchData){
                newNode.next = temp.next;
                temp.next = newNode;
                return;
                
            }
            temp = temp.next;
        }


    }
    public void reverse(){
     ArrayList<Integer> arr = new ArrayList<>();
     Node temp = head;
  
     while(temp!=null){

         arr.add(temp.data);
         
         temp = temp.next;
     }
     temp = head;

     for(int i=arr.size()-1;i >=0;i--){
        temp.data = arr.get(i);
        temp = temp.next;

     }
        
    } 
   public static void main(String[] args) {
       SingleLinkedList sl = new SingleLinkedList();
       sl.addNode(5);
       sl.addNode(10);
       sl.addNode(15);
       sl.addNode(20);
       sl.insert(20,60);
       sl.display();
       System.out.println("After reversing: ");
      sl.reverse();
      sl.display();
   }
}
