package leetCode.hashing;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> mapS = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
        }

        for(int j=0; j < t.length(); j++){

            Character letter = t.charAt(j);
            if(mapS.containsKey(letter)){
                int amount = mapS.get(letter) - 1;
                if(amount == 0) {mapS.remove(letter);}
                else{mapS.put(letter, amount);}

            }
            else{return false;}
        }

        return mapS.isEmpty();
    }
}
