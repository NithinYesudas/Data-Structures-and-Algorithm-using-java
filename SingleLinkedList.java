import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class SingleLinkedList {
    public Node head;
    public Node tail;

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
    public void reverse(SingleLinkedList l){
      Node temp1 = l.head;
      Node temp2 = head.next;
      while(temp1!=null){
        temp2.next = temp1;
        
      }

        
        

       
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void delete(int data) {
        if (head != null && head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.next.data == data) {
                if (temp.next == tail) {
                    tail = temp;
                    tail.next = null;
                }

                else
                    temp.next = temp.next.next;

                return;
            }

            temp = temp.next;
        }
    }

    public void insert(int searchData, int data) {

        Node newNode = new Node(data);
        Node temp = head;
        if (searchData == head.data) {
            head = newNode;
            newNode.next = temp;
            return;

        }
        while (temp.next != null) {
            if (temp.next.data == searchData) {
                newNode.next = temp.next;
                temp.next = newNode;
                return;

            }
            temp = temp.next;
        }
        System.out.println("No matching data found");

    }
    void deleteDuplicate(){
        Node temp = head;
        Node key = head;
        Node prev;
        while(key!=null){
            prev = key;
            temp = key.next;
            
            while(temp!=null){
                if(temp.data == key.data){
                    prev.next = temp.next;
                    if(temp == tail){
                        tail = prev;
                    }

                }
                prev = temp;
                temp = temp.next;

            }
            key = key.next;

        }
    }

    public static void main(String[] args) {
        SingleLinkedList obj = new SingleLinkedList();
        Scanner input = new Scanner(System.in);

        int choice = 0, temp;
        while (choice != 6) {
            System.out.println("Enter 1 to add, 2 for delete, 3 for insert between, 4 for displaying,5 for delDuplicate,6 for exit: ");
            choice = input.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Enter number to add");
                    temp = input.nextInt();
                    obj.addNode(temp);
                    break;

                case 2:
                    System.out.println("Enter the element to be deleted: ");
                    temp = input.nextInt();
                    obj.delete(temp);
                    break;

                case 3:
                    System.out.println("Enter where to insert: ");
                    temp = input.nextInt();
                    System.out.println("Enter the data to be inserted: ");
                    int data = input.nextInt();
                    obj.insert(temp, data);
                    break;

                case 4:
                    System.out.println("Current elements are: ");
                    obj.display();
                    break;
                case 5:
                obj.deleteDuplicate();    
            }

        }

    }
}
