import java.util.*;

class Node {
    int coefficient;
    int power;
    Node nextNode;
    public Node(int coefficient,int power){
        this.coefficient = coefficient;
        this.power = power;
    }
}
public class PolynimialAddition {
    public Node start;
    public Node end;

    public void addNode(int coefficient, int power){
    Node newNode = new Node(coefficient,power);
    if(start==null){
        start = newNode;
    }
    else{
        end.nextNode = newNode;

    }
    end = newNode;

    }
    public void display(){
        Node temp = start;
        while(temp!=null){
            System.out.print(temp.coefficient);
            if(temp.power!=0)
            System.out.print("x^"+temp.power);
             if(temp.nextNode!=null)
             System.out.print(" + ");
            temp = temp.nextNode;
        }
    }

    public PolynimialAddition addition(PolynimialAddition p, PolynimialAddition q){
        Node temp1 = p.start;
        Node temp2 = q.start;
        PolynimialAddition ans = new PolynimialAddition();
        while(temp1 !=null || temp2!=null){
            if(temp1 == null){
                ans.addNode(temp2.coefficient, temp2.power);
                temp2 = temp2.nextNode;
                continue;
            }
            if(temp2 == null){
                ans.addNode(temp1.coefficient, temp1.power);
                temp1 = temp1.nextNode;
                continue;
            }
            if(temp1.power == temp2.power){
                ans.addNode(temp1.coefficient+temp2.coefficient, temp1.power);
                temp1 = temp1.nextNode;
                temp2 = temp2.nextNode;

            }
            else{
                if(temp1.power>temp2.power){
                    ans.addNode(temp1.coefficient, temp1.power);
                    temp1 = temp1.nextNode;
                }
                else{
                    ans.addNode(temp2.coefficient, temp2.power);
                    temp2 = temp2.nextNode;
                }
            }
           

        }
        return ans;
    }
    public static void main(String[] args) {
        PolynimialAddition p = new PolynimialAddition();
        PolynimialAddition q = new PolynimialAddition();
        p.addNode(3, 4);
        p.addNode(2, 2);
        p.addNode(10, 1);
        p.addNode(1, 0);

        q.addNode(4, 4);
        q.addNode(3, 3);
        q.addNode(11, 1);
        q.addNode(9, 0);
        PolynimialAddition ans = new PolynimialAddition();
        ans = ans.addition(p, q);
        ans.display();
        
        

    }

    
}
