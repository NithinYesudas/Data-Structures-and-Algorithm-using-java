import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
    }
}

public class DoublyLinkedList {
   public Node head;
   public Node tail;

   public  void addNode(int data) {
       Node newNode = new Node(data);
   if(head == null){
       head = newNode;
       

   }
   else{
       tail.next = newNode;
       newNode .prev = tail;
      
       
   }
   tail = newNode;
   
   }
   public void displayForward(){
       if(head == null){
           System.out.println("empty");
           return;
       }
       Node temp = head;
       while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
       }

   }
   public void displayBackward(){
    if(head == null){
        System.out.println("empty");
        return;
    }
    Node temp = tail;
    while(temp!=null){
        System.out.println(temp.data);
        temp = temp.prev;
    }

}


   
   public void delete(int data){
       Node temp = head;
       if(head.data == data){
           head = temp.next;
           head.prev = null;
           return;
       }
       while(temp!=null){

         if(temp.data == data){
            if(temp == tail){
                tail = temp.prev;
                tail.next = null;
            }
             else {temp.prev.next = temp.next;
             temp.next.prev = temp.prev;}
            
             return;
         }
         temp = temp.next;

       }
       System.out.println("No matching data found");
    }
   
   public void insert(int searchData, int data){
       Node newNode = new Node(data);
       Node temp = head;
       if(head.data == searchData){
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
           return;
           
       }
       while(temp!=null){
           if(searchData == temp.data){
               newNode.next = temp;
               temp.prev.next = newNode;
               temp.prev = newNode;
               return;

           }
           temp = temp.next;
       }
       System.out.println("No matching data found");
   }
   public void removeDuplicate(){
       Node i = head;
      
       while(i!=null){
        Node j = i.next;
           while(j!=null){
               if(i.data == j.data){
                   if(j==tail){
                       tail.prev.next = null;
                       tail = tail.prev;
                       break;
                   }
                j.prev.next = j.next;
                j.next.prev = j.prev;

               }
               j = j.next;
           }
           i = i.next;


       }
   }
   public static void main(String[] args) {
       DoublyLinkedList obj = new DoublyLinkedList();
       Scanner input = new Scanner(System.in);
       
       int choice=0,temp;
        while(choice!=6){
            System.out.println("Enter 1 to add, 2 for delete, 3 for insert between, 4 for displaying forward, 5 for displaying backward, 6 for exit: ");
            choice = input.nextInt();
            switch(choice){
                
                case 1: System.out.println("Enter number to add");
                temp = input.nextInt();
                obj.addNode(temp);
                break;

                case 2: System.out.println("Enter the element to be deleted: ");
                        temp = input.nextInt();
                        obj.delete(temp);
                        break;

                case 3: System.out.println("Enter where to insert: ");
                        temp = input.nextInt();
                        System.out.println("Enter the data to be inserted: ");
                        int data = input.nextInt();
                        obj.insert(temp, data); 
                        break;

                case 4: System.out.println("Current elements in forward direction: ");
                        obj.displayForward();
                        break;
                
                case 5: System.out.println("Current elements in backward direction:"); 
                        obj.displayBackward();       
            }   

        }
   }

    
}
