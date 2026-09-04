package drill;

public class IsPalindromeDrill {
    public boolean isPalindromeDrillgDrill(String s){
        return helperPalindrome(s,0,s.length()-1);
    }
    private boolean helperPalindrome(String s, int start, int end){
        if(start >= end) return true;
        if(s.charAt(start) != s.charAt(end))return false;
        return helperPalindrome(s,++start,--end);
    }
}
