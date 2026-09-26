package drill;

public class ReverseNumber {

    public int reverseNumber(int n) {
        return helper(n, 0);
    }

    private int helper(int n, int reversed) {
        if (n == 0) return reversed;

        int digit = n % 10;

        return helper(
                n / 10,
                reversed * 10 + digit
        );
    }

    static void main() {
        int n = 123;
        int reversed = new ReverseNumber().reverseNumber(n);
        System.out.println(reversed);
    }
}