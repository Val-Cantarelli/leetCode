package prepInterviewOA;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        if(s.isEmpty()) return true;

        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if((c == '{') || (c == '[') || (c == '(')){
                stack.push(c);
            }
            else{
                Character st = stack.pop();
                if (c == '}' && st != '{'
                        || (c == ']' && st != '[' )
                        || (c == ')' && st != '(' )) return false;
            }
        }
        // At the endo of s, if we still do have stack items: false
        return stack.isEmpty();
    }

}
