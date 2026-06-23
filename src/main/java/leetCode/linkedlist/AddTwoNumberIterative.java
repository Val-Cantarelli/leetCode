package leetCode.linkedlist;

import leetCode.ListNode;

public class AddTwoNumberIterative {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode dummy = new ListNode();
        ListNode previous = dummy;
        int carry = 0;
        // while both != null
        while (n1 != null && n2 != null){
            ListNode currentNode = new ListNode();
            currentNode.val = (n1.val + n2.val + carry) % 10;
            carry = (n1.val + n2.val + carry) / 10;
            previous.next = currentNode;
            previous = currentNode;
            n1 = n1.next;
            n2 = n2.next;
        }

        while(n1 != null){
            ListNode currentNode = new ListNode();
            currentNode.val = (n1.val + carry) % 10;
            carry = (n1.val + carry) / 10;
            previous.next = currentNode;
            previous = currentNode;
            n1 = n1.next;

        }

        while(n2 != null){
            ListNode currentNode = new ListNode();
            currentNode.val = (n2.val + carry) % 10;
            carry = (n2.val + carry) / 10;
            previous.next = currentNode;
            previous = currentNode;
            n2 = n2.next;
        }



        // check reminder
        if(carry != 0){
            ListNode currentNode = new ListNode();
            currentNode.val = carry;
            previous.next = currentNode;
        }
        return dummy.next;

    }
}
