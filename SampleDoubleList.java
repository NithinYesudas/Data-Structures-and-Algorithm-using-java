import java.util.*;

class Node{
    int data;
    Node nextNode;
    Node prevNode;
    Node(int d){
        data = d;
    }
}


public class SampleDoubleList {
    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }
        else{
            tail.nextNode = newNode;
            newNode.prevNode = tail;

        }
        tail = newNode;
    }
    public void displayForward(){
        Node temp = head;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.nextNode;
            }
        }
    }

    public void displayBackward(){
        Node temp = tail;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.prevNode;
            }
        }

    }

    public void insertMiddle(int where, int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp!=null){
            if(temp.data == where){
                newNode.nextNode = temp.nextNode;
                temp.nextNode.prevNode = newNode;
                temp.nextNode = newNode;
                newNode.prevNode = temp;
                break;
            }
            temp = temp.nextNode;
        }
    }
    public void deleteLast(){
        if(tail.prevNode==null){
            tail = tail.prevNode;

        }
        else{
            tail = tail.prevNode;
            tail.nextNode =null;
        }
       
        
       
       
    }
    public void deleteFirst(){
        if(head.nextNode==null){
            head = head.nextNode;

        }
        else{
            head = head.nextNode;
            head.prevNode =null;
        }
        
    }

    public static void main(String[] args) {
        SampleDoubleList obj = new SampleDoubleList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int data;
        while(choice!=7){
            System.out.println("enter 1 for adding, 2 for display forward, 3 for display backward, 4 for insert, 5 for deltelast, 6 for deletefirst, 7 for cancel: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("enter the data to add");
                data = sc.nextInt();
                obj.addNode(data);
                break;
                case 2: 
                obj.displayForward();
                break;
                case 3: 
                obj.displayBackward();;
                break;
                case 4:
                System.out.println("where do you want to enter: ");
                int where = sc.nextInt();
                System.out.println("enter the data ");
                data = sc.nextInt();
                obj.insertMiddle(where, data);
                break;
                case 5: 
                obj.deleteLast();
                break;
                case 6:
                obj.deleteFirst();
                break;
            }
        }


    }
    
}
