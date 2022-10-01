class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }

}

public class Doubly {

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

        } else {
            tail.next = newNode;
            newNode.prev = tail;

        }
        tail = newNode;

    }


    public Doubly twister(Doubly link,Doubly dlink){
       Node  currentNode = link.tail;
        while(currentNode != null){

            dlink.addNode(currentNode.data);
            currentNode = currentNode.prev;
        }
        Node temp = link.head;
        currentNode = dlink.head;
        while(currentNode!=null){
           temp.data = currentNode.data;
           temp = temp.next;
            currentNode = currentNode.next;
        }
        return link;

    }
    public void display(){

        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Doubly link1 = new Doubly();
        Doubly link2 = new Doubly();
        link1.addNode(1);
        link1.addNode(2);
        link1.addNode(3);
        link1.addNode(4);
        link1.addNode(5);
        
        link1 = link1.twister(link1, link2);
       link1.display();
        
    }

}