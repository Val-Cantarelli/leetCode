package leetCode.stack_queue;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('[',']');
        map.put('(',')');
        map.put('{','}');

        for(int i = 0; i < s.length(); i++){
            char elem = s.charAt(i);
            if(elem == '}' || elem == ')' || elem == ']' ){
                if(stack.isEmpty() || elem != map.get(elem)) return false;
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
