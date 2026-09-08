package neetCode150;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {


    private Set<Set<String>> normalize(List<List<String>> groups) {
        Set<Set<String>> result = new HashSet<>();
        for (List<String> group : groups) {
            result.add(new HashSet<>(group));
        }
        return result;
    }

    @Test
    void groupsAnagramsTogether() {
        GroupAnagrams solution = new GroupAnagrams();
        List<String> input = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        List<List<String>> result = solution.groupAnagrams(input);

        Set<Set<String>> expected = new HashSet<>(Arrays.asList(
                new HashSet<>(Arrays.asList("eat", "tea", "ate")),
                new HashSet<>(Arrays.asList("tan", "nat")),
                new HashSet<>(Arrays.asList("bat"))
        ));

        assertEquals(expected, normalize(result));
    }

    @Test
    void handlesEmptyString() {
        GroupAnagrams solution = new GroupAnagrams();
        List<String> input = Arrays.asList("");

        List<List<String>> result = solution.groupAnagrams(input);

        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals("", result.get(0).get(0));
    }

    @Test
    void handlesSingleWordNoAnagrams() {
        GroupAnagrams solution = new GroupAnagrams();
        List<String> input = Arrays.asList("abc", "def", "ghi");

        List<List<String>> result = solution.groupAnagrams(input);

        assertEquals(3, result.size());
    }
}