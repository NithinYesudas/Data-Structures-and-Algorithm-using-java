// import java.util.Scanner;
// class Node{
//     int data;
//     Node next;
//     Node(int data){
//         this.data = data;
//     }
// }
// public class Queue {
//     public Node front,rear;
//     public void display(){
//         Node temp = front;

//         while(temp!=null){
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
//     public boolean isEmpty(){
//         return front == null;
//     }
//     public void deQueue(){
//       front = front.next;
//       if(front == null)rear = null;
//     }
//     public void enqueue(int data){
//         Node newNode = new Node(data);
//         if(front ==null){
//             front = newNode;
//             rear = newNode;

//             return;
//         }
//         else{
//             rear.next = newNode;
//             rear = newNode;
//         }
       
       
    
//     }
//     public static void main(String[] args) {
//         Queue st = new Queue();
//         Scanner input = new Scanner(System.in);
//         int temp;
//         int choice=0;
//         while(choice!=4){
//             System.out.println("Enter 1 for enqueue, 2 for dequeue, 3 for displaying and 4 for exit: ");
//             choice = input.nextInt();
//             switch(choice){
                
//                 case 1: System.out.println("Enter number to add");
//                 temp = input.nextInt();
//                 st.enqueue(temp);
//                 break;
//                 case 2: if(!st.isEmpty())st.deQueue();else System.out.println("Queue empty");
//                         break;

                
//                 case 3:  if(!st.isEmpty())st.display();else System.out.println("Queue empty");    
//                          break;   

//             }

//         }
//    }

//     }
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
    public boolean isEmpty(){
        return front == null;
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
        int temp;
        int choice=0;
        while(choice!=5){
            System.out.println("Enter 1 for enqueue, 2 for dequeue, 3 for displaying and 4 for exit: ");
            choice = input.nextInt();
            switch(choice){
                
                case 1: System.out.println("Enter number to add");
                temp = input.nextInt();
                st.enqueue(temp);
                break;
                case 2: if(!st.isEmpty())st.deQueue();else System.out.println("Queue empty");
                        break;

                
                case 3:  if(!st.isEmpty())st.display();else System.out.println("Queue empty");    
                         break;   

            }

        }
   }

    }
    

