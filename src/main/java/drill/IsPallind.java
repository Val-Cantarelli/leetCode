package drill;

public class IsPallind {
    public boolean isPalindrome(String s){
        return helperPallind(s, 0, s.length()-1);
    }

    private boolean helperPallind(String s, int indexI, int indexJ) {
        if(indexI >= indexJ) return true;// passou por toda string sem retornar false
        if(s.charAt(indexI) != s.charAt(indexJ)) return false;
        return helperPallind(s,indexI+1, indexJ-1);

    }

}
