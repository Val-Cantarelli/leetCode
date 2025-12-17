package leetCode;
// tentar com looping aninhado

public class DeleteDuplicationAlt {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode currentNode = head;

        while(currentNode != null) {
            // enquanto o prox existeir e for igual ao current: anda
            while(currentNode.next != null && currentNode.val == currentNode.next.val){
                //remove
                currentNode.next = currentNode.next.next;
            }
            // diferente: atuaiza o currente
            currentNode = currentNode.next;
        }

        return head;
    }
}
