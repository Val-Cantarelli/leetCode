package leetCode.linkedlist;

import leetCode.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AddTwoNumbersTest {

    @Test
    void shouldAddTwoNumbersWithSameLength() {
        ListNode l1 = list(2, 4, 3); // 342
        ListNode l2 = list(5, 6, 4); // 465

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[]{7, 0, 8}, toArray(result)); // 807
    }

    @Test
    void shouldAddTwoNumbersWithDifferentLengths() {
        ListNode l1 = list(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = list(9, 9, 9, 9);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, toArray(result));
    }

    @Test
    void shouldHandleCarryAtTheEnd() {
        ListNode l1 = list(9);
        ListNode l2 = list(1);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[]{0, 1}, toArray(result));
    }

    @Test
    void shouldHandleZeros() {
        ListNode l1 = list(0);
        ListNode l2 = list(0);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertArrayEquals(new int[]{0}, toArray(result));
    }

    private ListNode list(int... values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode();
            current.next.val = value;
            current = current.next;
        }

        return dummy.next;
    }

    private int[] toArray(ListNode node) {
        int size = 0;
        ListNode current = node;

        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = node;

        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }

        return result;
    }
}