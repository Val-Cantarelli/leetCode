package prepInterviewOA;

import leetCode.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GetIntersecctionNodeTest {

    private GetIntersecctionNode solver;

    @BeforeEach
    void setUp() {
        solver = new GetIntersecctionNode();
    }

    @Test
    void testBasicIntersection() {

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);


        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;


        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode result = solver.getIntersectionNode(headA, headB);
        assertNotNull(result);
        assertEquals(common, result);
        assertEquals(8, result.val);
    }

    @Test
    void testNoIntersection() {

        ListNode headA = new ListNode(2);
        headA.next = new ListNode(6);
        headA.next.next = new ListNode(4);
        ListNode headB = new ListNode(1);
        headB.next = new ListNode(5);

        // Intersection not found
        ListNode result = solver.getIntersectionNode(headA, headB);
        assertNull(result);
    }

    @Test
    void testIntersectionAtFirstNode() {
        ListNode common = new ListNode(10);

        ListNode headA = common;
        ListNode headB = common;


        ListNode result = solver.getIntersectionNode(headA, headB);
        assertEquals(common, result);
    }

    @Test
    void testNullLists() {
        assertNull(solver.getIntersectionNode(null, null));
        assertNull(solver.getIntersectionNode(new ListNode(1), null));
    }
}