package drill;

public class ReverseString {
    public String reverseString(String s){
        return helperReverse(s, s.length()-1);
    }

    private String helperReverse(String s, int index) {
        if (index < 0) return "";

        return s.charAt(index) + helperReverse(s,--index);
    }
}
