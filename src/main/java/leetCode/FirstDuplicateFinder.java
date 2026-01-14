package leetCode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstDuplicateFinder {
    public static int findFirstDuplicate(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int num:list){
            if(set.contains(num))return num;
            else set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 5, 3, 2,5);
        System.out.println(FirstDuplicateFinder.findFirstDuplicate(input));
    }
}
