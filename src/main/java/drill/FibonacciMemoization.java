package drill;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoization {


    public int fibonacciMemoization(int n){
        Map<Integer, Integer> map = new HashMap<>();
        return helperFibo(n,map);
    }

    private int helperFibo(int n, Map<Integer,Integer> map){
        if(n <= 1) return n;
        else{
            if(map.containsKey(n)) return map.get(n);
            //calcula e insere
            int num = helperFibo(n-1, map)+helperFibo(n-2,map);
            map.put(n,num);
            return num;
        }

    }
}
