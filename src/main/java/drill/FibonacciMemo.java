package drill;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemo {
    public int fibonacciMemo(int n){
        Map<Integer,Integer> memo = new HashMap<>();
        return helperFibo(n,memo);
    }
    private int helperFibo(int n, Map<Integer,Integer> memo){
        if(n <= 1) {
            return n;
        }
        if(memo.containsKey(n)) return memo.get(n);
        int elem = helperFibo(n-1,memo)+helperFibo(n-2,memo);
        memo.put(n,elem);
        return elem;
    }
}
