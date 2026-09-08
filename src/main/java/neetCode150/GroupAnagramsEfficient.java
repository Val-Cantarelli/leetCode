package neetCode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsEfficient {
    public List<List<String>> groupAnagrams(List<String> strs){
        Map<Map<Character,Integer>,List<String>> map = new HashMap<>();

        for(String word: strs){
            Map<Character,Integer> signature = new HashMap<>();
            for (int i = 0; i < word.length() ; i++) {
                char key = word.charAt(i);
                signature.merge(key, +1, Integer::sum);
            }
            map.computeIfAbsent(signature, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
