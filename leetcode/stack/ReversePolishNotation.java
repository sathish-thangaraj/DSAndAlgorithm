import java.util.Stack;

public class ReversePolishNotation {
    public static void main(String[] args){
        System.out.println(evalRPN( new String[] {"2", "1", "+", "3", "*"}));
    }

    public static int evalRPN(String[] tokens) {
        int result = 0;
        if (tokens.length == 1)
            return Integer.valueOf(tokens[0]);
        int first = 0, second = 0;
        Stack<Integer> input = new Stack();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                result = input.pop() + input.pop();
                input.push(result);
            } else if (tokens[i].equals("-")) {
                second = input.pop();
                first = input.pop();
                result = first - second;
                input.push(result);
            } else if (tokens[i].equals("*")) {
                result = input.pop() * input.pop();
                input.push(result);
            } else if (tokens[i].equals("/")) {
                second = input.pop();
                first = input.pop();
                result = first / second;
                input.push(result);
            } else {
                input.push(Integer.valueOf(tokens[i]));
            }
        }

        return result;
    }
}
