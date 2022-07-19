import java.util.*;

class Node{
    int data;
    Node nextNode;

    Node(int d){
        data = d;
    }
}

public class SampleStack {
    public Node top;

    public void push(int data){
        Node newNode = new Node(data);

        if(top == null){
            top = newNode;
        }
        else{
            newNode.nextNode = top;
            top = newNode;
        }
    }
    public boolean isEmpty(){
        return top==null;
    }

    public void pop(){
       
     top = top.nextNode;   
    }

    public int peak(){
        return top.data;
    }

    public static void main(String[] args) {
        SampleStack obj = new SampleStack();
        Scanner sc = new Scanner(System.in);
        int choice =0;
        int data;
        while(choice!=4){
            System.out.println("enter 1 for push, 2 for pop, 3 for peak, 4 to cancel: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter the data");
                data = sc.nextInt();
                obj.push(data);
                break;
                case 2:
                if(obj.isEmpty()){
                    System.out.println("stack empty");
                }
                else{
                    obj.pop();
                }
                break;
                case 3:
                if(obj.isEmpty()){
                    System.out.println("stack empty");

                }
                else{
                    System.out.println(obj.peak());
                }
            }
        }
    }
    
}
