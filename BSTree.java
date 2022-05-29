
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
      boolean flag = true;
      while(temp.parent!=null || flag){
          flag = false;
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
        while(temp.left!=null){
            temp = temp.left;
        }
        int a = temp.data;
        temp.parent.left = null;
        return a;
    }
    private int getMax(Node temp){
        while(temp.right!=null){
            temp = temp.right;
        }
        int a = temp.data;
        temp.parent.right = null;
        return a;
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
        obj.remove(5);
        obj.contains(4);
    }
   
}
