package leetCode.math;

public class ReverseInt {
    public int reverse(int x) {
        // save the signal
        int signal = -1;
        if(x >= 0) {signal = 1;}

        int result = 0;

        while(x != 0){
            int mod = Math.abs(x) % 10;
            x = Math.abs(x)/10;
            if (result  > (Integer.MAX_VALUE - mod) / 10) return 0;
            result = result * 10 + mod;
        }
        return result * signal;
    }

    static void main() {
        int x = 1534236469;
        System.out.println(new ReverseInt().reverse(x));
    }
}
