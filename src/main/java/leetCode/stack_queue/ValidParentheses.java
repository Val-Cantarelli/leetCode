package leetCode.stack_queue;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char elem = s.charAt(i);
            if(elem == '}' || elem == ')' || elem == ']' ){
                if(stack.isEmpty()) return false;
                else{
                    char elemStack = stack.pop();
                    if(elem == '}' && elemStack != '{' ) return false;
                    if(elem == ']' && elemStack != '[') return false;
                    if(elem == ')' && elemStack != '(') return false;
                }
            }
            else{stack.push(elem);}
        }
        return stack.isEmpty();

    }
}
