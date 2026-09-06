package drill;

import leetCode.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class FindTargetTest {

    private TreeNode buildBst() {
        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        return root;
    }

    @Test
    void returnsFalseForEmptyTree() {
        FindTarget solution = new FindTarget();
        assertFalse(solution.findTarget(null, 5));
    }

    @Test
    void findsValueAtRoot() {
        FindTarget solution = new FindTarget();
        assertTrue(solution.findTarget(buildBst(), 8));
    }

    @Test
    void findsValueInLeftSubtree() {
        FindTarget solution = new FindTarget();
        assertTrue(solution.findTarget(buildBst(), 6));
    }

    @Test
    void findsValueInRightSubtree() {
        FindTarget solution = new FindTarget();
        assertTrue(solution.findTarget(buildBst(), 10));
    }

    @Test
    void returnsFalseWhenValueNotPresent() {
        FindTarget solution = new FindTarget();
        assertFalse(solution.findTarget(buildBst(), 4));
    }
}