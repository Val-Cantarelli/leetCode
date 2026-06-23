package leetCode.strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStr {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        if(s.isEmpty()) return 0;

        while(right != s.length()){
            char letter = s.charAt(right);
            if(map.get(letter) != null){
                left = Math.max(left, map.get(letter)+1);
            }
            map.put(letter,right);

            if(right-left > maxLength){
                maxLength = right-left;
            }
            right++;
        }
        return maxLength+1;
    }

    static void main() {
        String s = "abba";
        System.out.println(lengthOfLongestSubstring(s));

    }
}

