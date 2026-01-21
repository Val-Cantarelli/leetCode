import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {
        List<String> words = List.of("bat", "tab", "cat", "act", "tac", "dog");
        System.out.println(FindAnagrams.groupAnagrams(words));
    }
    public static List<List<String>> groupAnagrams(List<String> words){
        List<List<String>> output = List.of();
        // map the word, create a key from that: e.g.:"c1a1t1" and put in the main map.
        //map the word and ask: map contains?
            // yes: just add on the key
            // no: map the word, create a key from that, put in the main map

        return output;
    }


}
