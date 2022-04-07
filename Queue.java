import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Queue {
    public Node front,rear;
    public void display(){
        Node temp = front;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void deQueue(){
      front = front.next;
      if(front == null)rear = null;
    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front ==null){
            front = newNode;
            rear = newNode;

            return;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
       
       
    
    }
    public static void main(String[] args) {
        Queue st = new Queue();
        Scanner input = new Scanner(System.in);
        int a;
        a = input.nextInt();

        
        st.enqueue(a);
        a = input.nextInt();
        st.enqueue(a);
        a = input.nextInt();

        st.enqueue(a);
        st.deQueue();
        st.display();

    }
    
}
