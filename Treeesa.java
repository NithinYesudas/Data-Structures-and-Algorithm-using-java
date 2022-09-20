import java.util.*;
import java.util.Scanner;
class Node{
    public int mark;
    public String name;

    public Node lchild;
    public Node rchild;
    public Node(int mark,String name){
        this.mark=mark;
        this.name=name;
    }
}


public class Treeesa {
    public Node root;
    public void addNode(int mark,String name){
        Node newNode=new Node(mark,name);
        if(root==null){
            root=newNode;
            return;
        }
        else{
            Node temp=root;
            if(newNode.mark>=temp.mark){
                if(temp.lchild==null){
                    temp.lchild=newNode;
                    return;
                }
                temp=temp.lchild;
            }
            else{
                if(temp.rchild==null){
                    temp.rchild=newNode;
                    return;
                }
                temp=temp.rchild;
            }
        }
    }  
    
    public void inorder(){
        inorderHelper(root);
    }

    public void inorderHelper(Node temp){
        if(temp!=null){
            inorderHelper(temp.lchild);
            System.out.println(temp.name+"  "+temp.mark);
            inorderHelper(temp.rchild);
        }

    }

    public void preorder(String na){
        preorderHelper(root,na);
    }

    public void preorderHelper(Node temp,String kl){
        if(temp!=null){
            if(kl.equals(temp.name)){
                System.out.println(temp.mark);
                return;
            }
            preorderHelper(temp.lchild,kl);
            preorderHelper(temp.rchild,kl);
        }

    }

    public static void main(String args[]){
        Treeesa st=new Treeesa();
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=4){
        System.out.println("Enter 1 for add \n 2 for search  \n 3 for display mark");
        choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter the mark ");
                int temp=sc.nextInt();
                System.out.println("Enter name ");
                String n=sc.next();
                st.addNode(temp, n);
                break;
                case 2:
                System.out.println("Enter the name to search");
                String m=sc.next();
                st.preorder(m);
                break;
                case 3:
                st.inorder();
                break;
            }
        }

    }
}
