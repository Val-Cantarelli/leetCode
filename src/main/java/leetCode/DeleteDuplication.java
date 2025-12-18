package leetCode;
// input: sorted list
// output: remove duplicates
public class DeleteDuplication {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return head;

        ListNode currentNode = head;

        while ( currentNode.next != null ){
            if(currentNode.val == currentNode.next.val) currentNode.next = currentNode.next.next;
            else{
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}