package leetCode;

import java.util.List;

public class RemoveDuplicatesLinkedList {
    public ListNode deleteDuplicates(ListNode node) {
        // enquanro houver node(node.next != null) currentNode = node.val;
        // enquanto houver nodes == currentNode: anda
        //  se node != currentNode: currentNode.next = node

        if(node.next == null) return node; // only one node
        ListNode currentNode = node;
        while(node.next != null){
            if(currentNode != node.next){
                
            }

        }

        return node.next;

    }



    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        head.next = node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        System.out.println(new RemoveDuplicatesLinkedList().deleteDuplicates(head).val);
    }
}
