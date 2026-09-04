package drill;

public class PowRecDrill {
    public int powRecDrill(int base, int exp){
        if(exp == 0) return 1;
        return powRecDrill(base,--exp) * base;
    }
}
