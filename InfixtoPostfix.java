import java.util.Stack;

public class InfixtoPostfix {
    Stack<Character> stack = new Stack<>();

    private int precedence(char character) {
        switch (character) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

    public void infixtoPostfix(String exp) {
        String finalExp = "";
        for (int i = 0; i < exp.length(); i++) {
            char temp = exp.charAt(i);
            if (Character.isLetterOrDigit(temp)) {
                finalExp += temp;
            } else {
                if (temp == ')') {
                    while (stack.peek() != '(') {
                        finalExp += stack.pop();
                    }
                    finalExp += stack.pop();
                    finalExp += ')';
                } else if (temp == '(') {
                    stack.push('(');
                } else if (stack.isEmpty() || temp == '(') {
                    stack.push(temp);
                } else if (precedence(temp) > precedence(stack.peek())) {
                    stack.push(temp);
                } else {
                    while (!stack.isEmpty() && precedence(temp) <= precedence(stack.peek())) {
                        finalExp += stack.pop();
                    }
                    stack.push(temp);
                }
            }
        }

        while (!stack.isEmpty()) {
            finalExp += stack.pop();

        }
        System.out.println(finalExp);

    }

    public static void main(String[] args) {
        InfixtoPostfix ip = new InfixtoPostfix();
        ip.infixtoPostfix("(a+b^x)*(c+d)");
    }

}
