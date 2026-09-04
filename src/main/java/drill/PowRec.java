package drill;

public class PowRec {
    public int powRec(int base, int exp){
        if(exp == 0) return 1;
        return powRec(base, exp-1)* base;
    }
}
