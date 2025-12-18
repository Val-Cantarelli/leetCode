package leetCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {

    @Test
    void testAddBinary_basicCases() {
        AddBinary solver = new AddBinary();

        assertEquals("100", solver.addBinary("11", "1"));
        assertEquals("1010", solver.addBinary("101", "101"));
        assertEquals("0", solver.addBinary("0", "0"));
        assertEquals("1", solver.addBinary("1", "0"));
    }

    @Test
    void testAddBinary_unequalLength() {
        AddBinary solver = new AddBinary();

        assertEquals("10000", solver.addBinary("1111", "1"));
        // 2 + 15 = 17 -> binary 10001
        assertEquals("10001", solver.addBinary("10", "1111"));
    }

    @Test
    void testAddBinary_withCarryOver() {
        AddBinary solver = new AddBinary();

        assertEquals("10000", solver.addBinary("1111", "1")); // 15 + 1 = 16
        assertEquals("100", solver.addBinary("10", "10"));    // 2 + 2 = 4
        assertEquals("110", solver.addBinary("11", "11"));    // 3 + 3 = 6
    }

    @Test
    void testAddBinary_largeInput() {
        AddBinary solver = new AddBinary();

        String a = "1".repeat(1000);
        String b = "1";

        String result = solver.addBinary(a, b);

        // Deve ter 1 seguido de 1000 zeros: 100000...000
        assertEquals("1" + "0".repeat(1000), result);
    }
}
