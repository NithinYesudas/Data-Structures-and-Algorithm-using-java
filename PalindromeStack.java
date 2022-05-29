import java.util.Scanner;

class Stack{
    private char[] arr;
    private int max=0;
    public int top=-1;
    Stack(int max){
        this.max = max;
        arr = new char[max];
    }
    public void push(char data){
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
    public char peak(){
        return arr[top];
    }

}

public class PalindromeStack {
    public static void main(String[] args) {
        System.out.println("Enter the word to check: ");
        String word;
        Scanner input = new Scanner(System.in);
        word = input.nextLine();
        Stack sc = new Stack(word.length());
        for(int i =0;i<word.length();i++){
            sc.push(word.charAt(i));

        }
        boolean flag = true;
        for(int i =0;i<word.length();i++){
            if(word.charAt(i) != sc.peak()){
               
                flag = false;

            }
            sc.pop();
        }
        if(flag)
            System.out.println("Palindrome");
        else System.out.println("Not palindrome");

    }
    
}
