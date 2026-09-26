package drill;

public class SumDigits {
    public int sumDigits(int n){
        // divide por 10 e soma o algarismo
        // vou mexer direto no n
        if(n < 10) return n;
        return sumDigits(n / 10) + n % 10;
    }

}
