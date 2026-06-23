package leetCode.linkedlist;
import leetCode.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        helper(l1,l2,0,dummy);

        return dummy.next;
    }


    private static void helper(ListNode n1, ListNode n2, int reminder, ListNode previousNode){

        if(n1 == null && n2 == null){
            if(reminder == 1){
                ListNode node = new ListNode();
                node.val = reminder;
                previousNode.next = node;
            }
            return;
        }

        if (n1 == null) {
            ListNode node = new ListNode();
            node.val = (n2.val + reminder) % 10;
            reminder = (n2.val + reminder) / 10;
            previousNode.next = node;
            helper(null, n2.next, reminder, node);
            return;
        }

        if (n2 == null) {
            helper(n2, n1, reminder, previousNode);
            return;
        }

        ListNode node = new ListNode();
        node.val = (n1.val + n2.val + reminder) % 10;
        reminder = (n1.val + n2.val + reminder) / 10;
        previousNode.next = node;
        helper(n1.next, n2.next, reminder, node);
    }

    static void main() {
        ListNode l1 = createListNode(123);
        ListNode l2 = createListNode(456);
        ListNode l3 = addTwoNumbers(l1, l2);
        printList(l3);
    }

    private static void printList(ListNode l3) {
        ListNode node = l3;
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    private static ListNode createListNode(int i) {
        ListNode head = new ListNode();
        ListNode node = head;
        while(i  != 0){
            int r = i % 10;
            i = i / 10;
            node.val = r;
            ListNode nextNode = new ListNode();
            node.next = nextNode;
            node = node.next;
        }
        return head;
    }
}
