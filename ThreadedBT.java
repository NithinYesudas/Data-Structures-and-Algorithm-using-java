import java.util.*;

class Node {
    int data;
    Node left,right;
    boolean isThreaded ;
    public Node(int data){
        this.data = data;
        isThreaded = false;
    }
}

public class ThreadedBT {
    public Node root;
    public void addLeftChild(Node parent, int data){
        if(parent==null || parent.left != null){
            System.out.println("Invalid insertion");
            return;
        }
        Node newNode = new Node(data);
        parent.left = newNode;
        newNode.right = parent;
        newNode.isThreaded = true;
    }
    public void addRightChild(Node parent, int data){
        if(parent==null || !parent.isThreaded ){
            System.out.println("Invalid insertion");
            return;
        }
        Node newNode = new Node(data);
        newNode.right = parent.right;
        parent.isThreaded = false;
        parent.right = newNode;
        newNode.isThreaded = true;
    }
    public void addRoot(int data){
        if (root !=null){
            System.out.println("invalid");
            return;
        }
        Node newNode = new Node(data);
        root = newNode;
        root.isThreaded = true;
    }
     
    public void inOrder(){
         Node temp = root;
         while(temp.right!=null && !temp.isThreaded){
            if(temp.left!=null){
                temp = temp.left;
                continue;
            }
            else{
                System.out.println(temp.data);
                temp = temp.right;
            }

         }

    }
    
    public static void main(String[] args) {
        ThreadedBT obj = new ThreadedBT();
        Scanner sc = new Scanner(System.in);
        int choice = 0,data;
        
    }
    
}
