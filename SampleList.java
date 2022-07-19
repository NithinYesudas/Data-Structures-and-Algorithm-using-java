import java.util.*;

class Node{
    int data;
    Node nextNode;

    Node(int d){
        data = d;

    }


}

public class SampleList {
    public Node head;
    public Node tail;

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
           
        }
        else{
            tail.nextNode = newNode;
            
        }
        tail = newNode;

    }

    public void display(){
        Node temp = head;

        if(head == null){
            System.out.println("the list is empty");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.nextNode;
            }
        }

    }
    
    public void deleteFirst(){
        head = head.nextNode;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.nextNode = head;
        head = newNode;
    }
    public void insertMiddle(int where, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp!=null){
            if(temp.data == where){
                newNode.nextNode = temp.nextNode;
                temp.nextNode = newNode;
                break;
            }
            temp = temp.nextNode;
        }
    }
   

    public static void main(String[] arg){

        SampleList obj = new SampleList();
        Scanner sc  = new Scanner(System.in);
        int choice=0;
        int data;
        while(choice!=6){
            System.out.println("Enter 1 for addLast, 2 for addFirst, 3 for deleteFirst, 4 for insert, 5 for display, 6 for cancel ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                System.out.println("Enter the data");
                data = sc.nextInt();
                obj.addLast(data);
                break;
                case 2:
                System.out.println("Enter the data");
                data = sc.nextInt();
                obj.addFirst(data);
                break;
                case 3: 
                obj.deleteFirst();
                break;
                case 4:
                System.out.println("where do u want to insert: ");
                int where = sc.nextInt();
                System.out.println("enter the data");
                data = sc.nextInt();
                obj.insertMiddle(where, data);
                break;
                case 5:
                obj.display();
                break;

            }
        }

       

    }
    
}
