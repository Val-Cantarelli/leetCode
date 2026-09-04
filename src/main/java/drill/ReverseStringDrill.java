package drill;

public class ReverseStringDrill {
    public String reverseStringDrill(String s){
        return helperReverseS(s,s.length()-1);
    }
    private String helperReverseS(String s, int index){
        if(index < 0) return "";
        return s.charAt(index)+helperReverseS(s,--index);
    }
}
