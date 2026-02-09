package OAAmazon;

import java.util.Arrays;
import java.util.List;

public class TotalResponseTimeTest {

    public static void main(String[] args) {
        test(Arrays.asList(4, 2, 9, 1, 7, 3), 6);
        test(Arrays.asList(5, 1, 4), 1);
        test(Arrays.asList(2, 2, 2, 2), 4);
        test(Arrays.asList(1, 2, 3, 4, 5), 9);
        test(Arrays.asList(9, 8, 7, 1), 9);
        test(Arrays.asList(1, 9, 8, 7), 8);
        test(Arrays.asList(3, 1, 1, 3), 4);

        System.out.println("All tests passed.");
    }

    private static void test(List<Integer> input, long expected) {
        long got = TotalResponseTime.totalResponseTime(input);
        if (got != expected) {
            throw new AssertionError("Input=" + input + " expected=" + expected + " got=" + got);
        }
        System.out.println("OK  input=" + input + " -> " + got);
    }
}