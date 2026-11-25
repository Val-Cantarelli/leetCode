package drill;


import java.util.HashSet;
import java.util.Set;

public class LongestSeq {
    public int longestSeqq(int []nums) {

        int longestSeq = 0;
        Set<Integer> setNums = new HashSet<>();
        for (int num:nums){
            setNums.add(num);
        }
        for (int num:setNums){
            int currentLength = 1;
            if(!setNums.contains(num-1)){
                for (int i=1;i < setNums.size();i++){
                    if(setNums.contains(num+i)){
                        currentLength++;
                    }
                    else{
                        break;
                    }

                }
            }
            longestSeq = Math.max(longestSeq,currentLength);
        }
        return longestSeq;
    }
}
