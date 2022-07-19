import java.util.*;

import javax.script.ScriptContext;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
public class sf {
    public Node front,rear;
    public void display(){
        Node temp=front;
        if(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;

        }
    }

    public boolean isEmpty(){
        return front==null;
    }

    public void deQueue(){
        front=front.next;
        if(front==null){
            rear=null;
        }

    }

    public void enQueue(int data){
        Node nl=new Node(data);
        if(front==null){
            front=nl;
            rear=nl;

        }
        else{
            rear.next=nl;
            rear=nl;
        }

    }
    
    public static void main(String args[]){
        sf st=new sf();
        Scanner sc=new Scanner(System.in);
        int temp;
        int choice=0;
        while(choice!=4){
            System.out.println("Enter 1 for enqueue 2 for dequeue 3 for display 4 exit");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter number to add");
                temp=sc.nextInt();
                st.enQueue(temp);
                break;
                case 2:
                break;
                case 3:
                break;
            }
            System.out.println("Exited from program");
        }
    }
    
}


