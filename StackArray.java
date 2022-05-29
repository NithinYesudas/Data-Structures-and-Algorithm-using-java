import java.util.Scanner;

class Stack{
    private int[] arr;
    private int max=0;
    public int top=-1;
    Stack(int max){
        this.max = max;
        arr = new int[max];
    }
    public void push(int data){
        top++;
        arr[top] = data;

    }
    public void pop() {
        arr[top] = 0;
        top --;
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return(top == max-1);
    }
    public int peak(){
        return arr[top];
    }

}

public class StackArray {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the max size of the Stack: ");
        temp = input.nextInt();
        Stack obj=new Stack(temp);
        int choice=0;
        while(choice!=4){
            System.out.println("Enter 1 for push, 2 for pop, 3 for peek and 4 for exit: ");
            choice = input.nextInt();
            switch(choice){
                
                case 1: System.out.println("Enter number to push");
                temp = input.nextInt();
                if(!obj.isFull())obj.push(temp);else System.out.println("Already stack full");
                break;

                case 2: if(!obj.isEmpty())obj.pop();else System.out.println("Stack empty");
                        break;

                case 3: if(!obj.isEmpty())System.out.println(obj.peak());else System.out.println("Stack empty");
                        break;

            }

        }
        
        
    }
   
 
    
}
