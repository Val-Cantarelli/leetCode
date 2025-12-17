package leetCode;

public class DeleteDuplication {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}