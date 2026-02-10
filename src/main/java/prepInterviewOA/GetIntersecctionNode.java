package prepInterviewOA;
import java.util.HashSet;
import java.util.Set;
import leetCode.ListNode;

public class GetIntersecctionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();

        ListNode currentA = headA;
        while (currentA != null){
            set.add(currentA);
            currentA = currentA.next;
        }
        ListNode currentB = headB;
        while(currentB != null){
            if(set.contains(currentB)) return currentB;
            currentB = currentB.next;
        }
        return null;
    }
}
