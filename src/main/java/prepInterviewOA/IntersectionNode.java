package prepInterviewOA;
import java.util.HashSet;
import java.util.Set;
import leetCode.ListNode;
/* Easy leve - Follow up: Could you write a solution that runs in O(m + n) time and use only O(1) memory?
* Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect.
* If the two linked lists have no intersection at all, return null.
*
* The test cases are generated such that there are no cycles anywhere in the entire linked structure. Note that
* the linked lists must retain their original structure after the function returns.
*
* Constraints:

The number of nodes of listA is in the m.
The number of nodes of listB is in the n.
1 <= m, n <= 3 * 104
1 <= Node.val <= 105

* */
public class IntersectionNode implements IntersectionSolver{
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