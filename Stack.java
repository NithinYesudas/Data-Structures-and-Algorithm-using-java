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

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
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
        int a;
        a = input.nextInt();

        
        st.push(a);
        a = input.nextInt();
        st.push(a);
        a = input.nextInt();

        st.push(a);
        st.pop();
        st.display();

    }
    
}
