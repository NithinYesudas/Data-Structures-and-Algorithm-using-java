import java.lang.*;
import java.util.Stack;

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
                temp.data = getMin(temp);
                else if(temp.left!=null)
                temp.data = getMax(temp);
                else 
                temp.data = getMin(temp);
                System.out.println("Data deleted succesfully");
                return;
                
            }
        }
        System.out.println("deletion failed data not found");
    }
    private int getMax(Node temp){
        Node q = temp;
        temp = temp.left;
        while(temp.right!=null){
            q = temp;
            temp = temp.right;
        }
        if(temp.left != null){
            q.left = temp.left;
        }
        return temp.data;


    }
    public void sumFinder(int low,int high){
        int sum = sumHelper(root, 0, low, high);
        System.out.println(sum);

 
    }
    public int sumHelper(Node temp, int sum,int low,int high){
        if(temp!=null){
            if(temp.data>low && temp.data < high){
                sum+=temp.data;
            }
            sum = sumHelper(temp.left,sum,low,high);
            sum = sumHelper(temp.right,sum,low,high);
        }
        return sum;

    }
    private int getMin(Node temp){               
        Node q=temp;
        temp = temp.right;
        while(temp.left!=null){
            q = temp;
            temp = temp.left;
        }
        if(temp.right!=null){
            q.right = temp.right;
        }
        return temp.data;
    }
    
    public void inorderIterative(){
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        do{
            while(temp!=null){
                stack.push(temp);
                temp=temp.left;

            }
            if(!stack.isEmpty()){
                temp = stack.pop();
                System.out.println(temp.data);
                temp = temp.right;
            }
        }while(temp!=null || !stack.isEmpty());
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
        obj.addNode(2);
        obj.addNode(1);
        obj.addNode(3);
        obj.addNode(4);
        obj.addNode(7);
        obj.addNode(6);
       obj.addNode(5);
       obj.addNode(9);
       obj.sumFinder(3, 7);
       // obj.findNearest(9);
       // obj.inorderIterative();
       // obj.contains(4);
    }
   
}
