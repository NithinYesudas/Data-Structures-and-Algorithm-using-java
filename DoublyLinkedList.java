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
   public void display(){
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
   public void delete(int data){
       Node temp = head;
       if(head.data == data){
           head = temp.next;
           head.prev = null;
           return;
       }
       while(temp!=null){

         if(temp.data == data){
             temp.prev.next = temp.next;
             temp.next.prev = temp.prev;
             if(temp == tail){
                 tail = temp.prev;
                 tail.next = null;
             }
             return;
         }
         temp = temp.next;

       }
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
       obj.addNode(10);
       obj.addNode(10);
       obj.addNode(20);
       obj.addNode(300);
       
       obj.insert(300, 50);
       obj.addNode(5);
       obj.addNode(5);
       obj.addNode(10);
       obj.addNode(8);
       obj.addNode(8);
       obj.addNode(10);
       obj.addNode(300);
       obj.removeDuplicate();
       
       obj.display();
   }

    
}
