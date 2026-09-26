package drill;

public class IsPalin {
    public boolean isPalindrome(String str){
        // no regex - complexity. Instead Character.isnumberorDigit()
        return helperPalin(str, 0,str.length()-1);
    }

    private boolean helperPalin(String str, int i, int j) {
        // caso nada retorne false
        if(i >= j)return true;

         // como vou controlar os indices?
        if(Character.isLetterOrDigit(str.charAt(i))){
            if(Character.isLetterOrDigit(str.charAt(j))){
                if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) return false;
            }
            else return helperPalin(str, i, j -1);
        }
        else return helperPalin(str, i+1, j);
        return helperPalin(str,i+1,j-1);
    }
}
