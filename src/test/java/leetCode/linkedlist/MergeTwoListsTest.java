package leetCode.linkedlist;

import leetCode.ListNode;

public class MergeTwoListsTest {

    // helper pra montar lista a partir de uma sequência de ints
    private static ListNode buildList(int... values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode curr = head;

        for (int i = 1; i < values.length; i++) {
            curr.next = new ListNode(values[i]);
            curr = curr.next;
        }

        return head;
    }

    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // "assert" simples pra comparar lista com array esperado
    private static void assertListEquals(int[] expected, ListNode head, String testName) {
        ListNode curr = head;
        int i = 0;

        while (curr != null && i < expected.length) {
            if (curr.val != expected[i]) {
                throw new AssertionError(
                        testName + " falhou: posição " + i +
                                " esperava " + expected[i] +
                                " mas recebeu " + curr.val
                );
            }
            curr = curr.next;
            i++;
        }

        // se ainda tem nó sobrando ou faltou elemento
        if (curr != null || i != expected.length) {
            throw new AssertionError(testName + " falhou: tamanhos diferentes");
        }

        System.out.println(testName + " OK");
    }

    public static void main(String[] args) {
        MergeTwoLists solver = new MergeTwoLists();

        // Test 1: LeetCode
        ListNode l1 = buildList(1, 2, 4);
        ListNode l2 = buildList(1, 3, 4);
        ListNode merged1 = solver.mergeTwoLists(l1, l2);
        printList(merged1);
        assertListEquals(new int[]{1, 1, 2, 3, 4, 4}, merged1, "Test 1");

        // Test 2: empty
        ListNode l3 = null;
        ListNode l4 = buildList(0, 5, 10);
        ListNode merged2 = solver.mergeTwoLists(l3, l4);
        printList(merged2);
        assertListEquals(new int[]{0, 5, 10}, merged2, "Test 2");

        // Test 3: both empty
        ListNode merged3 = solver.mergeTwoLists(null, null);
        printList(merged3);
        assertListEquals(new int[]{}, merged3, "Test 3");

        // Test 4: different sizes
        ListNode l5 = buildList(1, 2, 3);
        ListNode l6 = buildList(4, 5);
        ListNode merged4 = solver.mergeTwoLists(l5, l6);
        printList(merged4);
        assertListEquals(new int[]{1, 2, 3, 4, 5}, merged4, "Test 4");
    }
}
