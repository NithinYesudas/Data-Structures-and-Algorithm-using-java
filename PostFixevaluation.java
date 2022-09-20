import java.util.Stack;
public class PostFixevaluation {

    Stack<Integer> stack = new Stack<>();

    private int operation(char operator,int a, int b){
        switch(operator){
            case '+':
            return a+b;
            
            case '-':
            return a-b;
            case '*':
            return a*b;
            case '/':
            return a/b;

        }
        return 0;
    }

    public void postFixevaluator(String exp){
        for(int i = 0;i<exp.length();i++){
            char temp = exp.charAt(i);
            if(Character.isDigit(temp)){
                stack.push(Character.getNumericValue(temp));
            }
            else{
                int n = stack.pop();
                
                stack.push(operation(temp, n, stack.pop()));
            }
        }
        System.out.println(stack.peek());
    }
    public static void main(String[] args) {
        PostFixevaluation pe = new PostFixevaluation();
        pe.postFixevaluator("456*+8+");
    }
    
}
