package drill;

public class CountDigits {
    public int countDigit(int n, int digit){
        if(n == digit) return 1;
        if(n < 10) return 0;

        if(n%10 == digit) return countDigit(n/10,digit)+1;
        return countDigit(n/10,digit);
    }
}
