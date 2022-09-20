import java.util.ArrayList;
import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class DoublyLinkedList {
    public Node head;
    public Node tail;

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

    public void displayForward() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public void displayBackward() {
        if (head == null) {
            System.out.println("empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }

    }

    public void delete(int data) {
        Node temp = head;
        if (head.data == data) {
            head = temp.next;
            head.prev = null;
            return;
        }
        while (temp != null) {

            if (temp.data == data) {
                if (temp == tail) {
                    tail = temp.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                return;
            }
            temp = temp.next;

        }
        System.out.println("No matching data found");
    }

    public void insert(int searchData, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if (head.data == searchData) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;

        }
        while (temp != null) {
            if (searchData == temp.data) {
                newNode.next = temp;
                temp.prev.next = newNode;
                newNode.prev = temp.prev;
                temp.prev = newNode;

                return;

            }
            temp = temp.next;
        }
        System.out.println("No matching data found");
    }

    public void removeDuplicate() {
        Node current = head;

        while (current != null) {
            Node next = current.next;
            while (next != null) {
                if (current.data == next.data) {
                    if (next == tail) {
                        tail.prev.next = null;
                        tail = tail.prev;
                        break;
                    }
                    next.prev.next = next.next;
                    next.next.prev = next.prev;

                }
                next = next.next;
            }
            current = current.next;

        }
    }
    public void reverse(){
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = tail;
        while(temp!=null){
            list.add(temp.data);
            temp = temp.prev;

        }
        head = null;
        tail = null;
        for(int i =0;i<list.size();i++){
            addNode(list.get(i));
            
        }
        
    }
    public void changeOrder(int k){
        Node temp = tail;
        tail.next = head;
        for(int i =1;i<k;i++){
            temp = temp.prev;
        }
        temp.prev.next = null;
        tail = temp.prev;
        temp.prev = null;
        head = temp;
        
    }

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        Scanner input = new Scanner(System.in);

        int choice = 0, temp;
        while (choice != 6) {
            System.out.println(
                    "Enter 1 to add, 2 for delete, 3 for insert between, 4 for displaying forward, 5 for displaying backward, 6 for exit: ");
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
                    System.out.println("Current elements in forward direction: ");
                    obj.displayForward();
                    break;

                case 5:
                    System.out.println("Current elements in backward direction:");
                    obj.changeOrder(2);
            }

        }
        input.close();
    }

}
