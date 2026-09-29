package drill;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs){
        StringBuilder sb = new StringBuilder();

        for (String word:strs){
            sb.append(word.length()).append("#").append(word);
        }
        return sb.toString();

    }

    public List<String> decode(String string){
        List<String> result = new ArrayList<>();
        int index = 0;

        while(index < string.length()) {
            StringBuilder lengthDigits = new StringBuilder();

            while(string.charAt(index) != '#'){
                lengthDigits.append(string.charAt(index));
                index++;
            }
            index++;
            int wordLength = Integer.parseInt(lengthDigits.toString());
            String word = string.substring(index,index+ wordLength);
            result.add(word);
            index = index+ wordLength;

        }
        return result;
    }
}
