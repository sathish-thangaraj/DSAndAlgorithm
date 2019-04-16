import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
        public static void main(String[] args){
            System.out.println(isValid("([{}])"));
        }
        public static boolean isValid(String input){
            Stack<Character> stack = new Stack<Character>();
            HashMap<Character,Character> lookup= new HashMap<>();
            lookup.put(')','(');
            lookup.put(']','[');
            lookup.put('}','{');
            if(input.length()==0)
                return true;
            if(input.length() %2 !=0)
                return false;
            for(int i=0 ; i<input.length();i++){
                char c = input.charAt(i);
                if(stack.empty()) {
                    stack.push(c);
                }
                else if(stack.peek() ==lookup.get(c)){
                    stack.pop();
                }
                else {
                    stack.push(c);
                }
            }
            if(stack.empty()) return true;
            else return false;
        }
}
