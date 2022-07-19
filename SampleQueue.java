import java.util.*;

class Node{
    int data;
    Node nextNode;
    Node(int d){
        data =d;
    }
}

public class SampleQueue {
    public Node start;
    public Node end;

    public void add(int data){
        Node newNode = new Node(data);

        if(start == null){
            start = newNode;
            
        }
        else{
            end.nextNode = newNode;   

        }
        end = newNode;

    }

    public void delete(){
        start = start.nextNode;
    }

    public void display(){
        if(start == null){
            System.out.println("Queue is empty");
        }
        else{
            Node temp = start;
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.nextNode;
            }
        }
    }

    public boolean isEmpty(){
        return start==null;
    }

    public static void main(String[] args) {
        SampleQueue obj = new SampleQueue();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int data;
        while(choice!=4){
            System.out.println("1 for add, 2 for delete, 3 for display, 4 for cancel");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("enter data");
                data = sc.nextInt();
                obj.add(data);
                break;
                case 2:
                if(obj.isEmpty()){
                    System.out.println("Queue empty");
                }
                else{
                    obj.delete();
                }
                break;
                case 3:
                obj.display();
                break;
            }
        }
    }

    
}
