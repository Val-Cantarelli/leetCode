package leetCode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeleteDuplicationTest {

    private DeleteDuplication solution = new DeleteDuplication();

    private ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    private int[] listToArray(ListNode head) {
        if (head == null) return new int[0];
        java.util.List<Integer> list = new java.util.ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void testEmptyList() {
        ListNode result = solution.deleteDuplicates(null);
        assertNull(result);
    }

    @Test
    public void testSingleElement() {
        ListNode head = new ListNode(1);
        ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    @Test
    public void testNoDuplicates() {

        ListNode head = createList(new int[]{1, 2, 3, 4, 5});
        ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, listToArray(result));
    }

    @Test
    public void testAllDuplicates() {
        ListNode head = createList(new int[]{1, 1, 1, 1});
        ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[]{1}, listToArray(result));
    }

    @Test
    public void testConsecutiveDuplicates() {
        ListNode head = createList(new int[]{1, 1, 2, 3, 3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3});
        ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 3}, listToArray(result));
    }

    @Test
    public void testMultipleDuplicates() {
        ListNode head = createList(new int[]{1, 1, 2, 2, 3, 3});
        ListNode result = solution.deleteDuplicates(head);
        assertArrayEquals(new int[]{1, 2, 3}, listToArray(result));
    }

}

