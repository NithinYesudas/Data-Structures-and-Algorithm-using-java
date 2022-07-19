import java.util.*;
class MyStack{
    private int top;
    private int max;
    private char arr[];

    public MyStack(int size){
        top=-1;
        max=size;
        arr=new char[50];
    }

    public void push(char item){
        top++;
        arr[top]=item;
    }
    public char pop(){
        char item=arr[top];
        top=top-1;
        return item;

    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFull(){
        if(top==max){
            return true;

        }
        else {
            return false;
        }
    }
    public char peek(){
        return arr[top];
    }
}
public class sf1 {
    public static int pty(char ch){
        switch(ch){
            case '^':
            return 3;
            case '*':
            return 2;
            case '/':
            return 2;
            case '+':
            return 1;
            case '-':
            return 1;
            

        }
        return 0;
    }
    public static void main(String args[]){
        System.out.println("Enter the infix expresion");
        Scanner sc =new Scanner(System.in);
        String ifx=sc.nextLine();
        String pfx=" ";
        int len=ifx.length();
        MyStack st=new MyStack(len);
        char c;
        char item;
        for(int i=0;i<len;i++){
            c=ifx.charAt(i);
            if(Character.isLetterOrDigit(c)){
                pfx+=pfx+c;
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(st.isEmpty()==false){
                    item=st.pop();
                    if(item=='('){
                        pfx=pfx+item;

                    }
                }
            }
            else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
                if(st.isEmpty()==true){
                    st.push(c);

                }
                else{
                    item=st.peek();
                    if(item=='('){
                        st.push(c);
                    }
                    else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='^'){
                        if(pty(c)<pty(item)){
                            st.push(c);
                        }
                        else{
                            if(pty(c)>pty(item)){
                                pfx+=st.pop();
                                st.push(c);
                            }
                        }
                    }
                }
            }
            while(st.isEmpty()==false){
                pfx=pfx+st.pop();
            }
            System.out.println("postfix exprsn "+pfx);
        }

    }

    
}
