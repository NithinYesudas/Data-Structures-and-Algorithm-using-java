import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Stack {
    public Node top;
    public void display(){
        Node temp = top;
        System.out.println("displaying current stack");

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int peak(){
        return top.data;
    }
    public void pop(){
        if(top==null){
            System.out.println("Stack empty");
            return;
        }
        top = top.next;
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(top ==null){
            top = newNode;
            return;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
       
       
    
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner input = new Scanner(System.in);
        int temp;
        int choice=0;
        while(choice!=5){
            System.out.println("Enter 1 for push, 2 for pop, 3 for peek, 4 for displaying and 5 for exit: ");
            choice = input.nextInt();
            switch(choice){
                
                case 1: System.out.println("Enter number to push");
                temp = input.nextInt();
                st.push(temp);
                break;
                case 2: if(!st.isEmpty())st.pop();else System.out.println("Stack empty");
                        break;

                case 3: if(!st.isEmpty())System.out.println(st.peak());else System.out.println("Stack empty");
                        break;
                case 4:  if(!st.isEmpty())st.display();else System.out.println("Stack empty");       

            }

        }
       

    }
    
}
