class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class TailDeleter {
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
    public void tailDeleter(){
        Node temp = head;
        while(temp!=null){
            if(temp.next == tail){
                temp.next = null;
                tail = temp;
            }
            temp = temp.next;
        }

    }
    public static void main(String[] args) {
        TailDeleter td = new TailDeleter();
        td.addNode(56);
        td.addNode(47);
        td.addNode(30);
        td.tailDeleter();
        td.display();

    }
    
}
