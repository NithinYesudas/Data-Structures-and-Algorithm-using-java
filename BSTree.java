import java.lang.*;

class Node{
   public Node left;
   public Node right;
   public Node parent;
   public int data;
    Node(int data){
        this.data = data;
    }
}

public class BSTree {
    public Node root;

    public void addNode(int data){
        Node newNode = new Node(data);
      if(root == null){
          root = newNode;
          return;
      }
      Node temp = root;
      
      while(temp!=null){
          
          if(newNode.data<=temp.data){
              if(temp.left == null){
                  temp.left = newNode;
                  newNode.parent = temp;
                  return;
              }
              temp = temp.left;
          }
          else if(newNode.data>temp.data){
              if(temp.right == null){
                  temp.right = newNode;
                  newNode.parent = temp;
                  break;
              }
              temp=temp.right;
            }   
      }
    }

    public void contains(int data){
        Node temp = root;
        boolean flag = true;
        while(temp!=null || flag){
            flag = false;
            if(temp.data>data){
                temp = temp.left;
            }
            else if(temp.data <data){
                temp = temp.right;
            }
            else{
                System.out.println("match found");
                return;
            }

        }
        System.out.println("not found");
    }

    public void remove(int data){
        Node temp = root;
        while(temp!=null){
            if(data<temp.data){
                temp = temp.left;
            }
            else if(data>temp.data){
                temp = temp.right;

            }
            else{
                if(temp.right!=null)
                temp.data = getMin(temp.right);
                else if(temp.left!=null)
                temp.data = getMax(temp.left);
                else 
                temp.data = getMin(temp);
                System.out.println("Data deleted succesfully");
                return;
                
            }
        }
        System.out.println("deletion failed data not found");
    }

    private int getMin(Node temp){
        if(temp.left==null){
            temp.parent.right = null;
        }
        else{
            while(temp.left!=null){
                temp = temp.left;
            }
          
            temp.parent.left = null;
        }
        int a = temp.data;
        return a;
    }

    private int getMax(Node temp){
        if(temp.right==null){
            temp.parent.left= null;
        }
        else{
            while(temp.right!=null){
                temp = temp.right;
            }
            
            temp.parent.right = null;
        }
        
        int a = temp.data;
        return a;
    }

   public void preOrder(){
       System.out.println("Pre-Order");
       preOrderHelper(root);

   }

   private void preOrderHelper(Node temp){
       if(temp!=null){
        System.out.println(temp.data);
        preOrderHelper(temp.left);
        preOrderHelper(temp.right);

       }
       
   }

   public void postOrder(){
       System.out.println("Post-Order");
       postOrderHelper(root);
   }
   public void postOrderHelper(Node temp){
       if(temp!=null){
           postOrderHelper(temp.left);
           postOrderHelper(temp.right);
           System.out.println(temp.data);
       }
   }

public void inOrder(){
     System.out.println("In-Order");
    inOrderHelper(root);
}
public void inOrderHelper(Node temp){
    if(temp!=null){
        inOrderHelper(temp.left);
        System.out.println(temp.data);
        inOrderHelper(temp.right);
        
    }
}

public void findNearest(int data){
    Node temp = root;
    int currentValue = temp.data;
    while(temp!=null){
        if(Math.abs(data-temp.data)<Math.abs(currentValue-data)){
            currentValue = temp.data;
        }
        if(data<temp.data){
            temp= temp.left;
        }
        else if(data>temp.data){
            
            temp = temp.right;
        }
        else{
            currentValue = temp.data;
            
           break;
        }
    }
    System.out.println(currentValue);
   


}
    

    public static void main(String[] args) {
        BSTree obj = new BSTree();
        obj.addNode(10);
        obj.addNode(5);
        obj.addNode(15);
        obj.addNode(99);
        obj.addNode(13);
        obj.addNode(14);
        obj.addNode(16);
        obj.addNode(4);
        obj.addNode(7);
        obj.addNode(6);
        obj.remove(5);
        obj.findNearest(9);
        obj.inOrder();
        obj.contains(4);
    }
   
}
