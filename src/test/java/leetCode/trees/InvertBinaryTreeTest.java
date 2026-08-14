package leetCode.trees;

import leetCode.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InvertBinaryTreeTest {

    private final InvertBinaryTree solution = new InvertBinaryTree();

    @Test
    void nullTree_returnsNull() {
        assertNull(solution.invertTree(null));
    }

    @Test
    void singleNode_returnsSameSingleNode() {
        TreeNode root = new TreeNode(1);
        TreeNode result = solution.invertTree(root);

        TreeNode expected = new TreeNode(1);
        assertTrue(isSameTree(expected, result));
    }

    @Test
    void twoLevelTree_swapsChildren() {
        // input:      4          expected:     4
        //            / \                      / \
        //           2   7                    7   2
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        TreeNode result = solution.invertTree(root);

        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.right = new TreeNode(2);

        assertTrue(isSameTree(expected, result));
    }

    @Test
    void threeLevelTree_swapsAtEveryLevel() {
        // input:        4              expected:       4
        //              / \                             / \
        //             2   7                           7   2
        //            / \   \                         /   / \
        //           1   3   9                       9   3   1
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        TreeNode result = solution.invertTree(root);

        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(7);
        expected.right = new TreeNode(2);
        expected.left.left = new TreeNode(9);
        expected.right.left = new TreeNode(3);
        expected.right.right = new TreeNode(1);

        assertTrue(isSameTree(expected, result));
    }

    @Test
    void skewedTree_leftOnlyBecomesRightOnly() {
        // input:   1        expected:   1
        //         /                      \
        //        2                        2
        //       /                          \
        //      3                            3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        TreeNode result = solution.invertTree(root);

        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(2);
        expected.right.right = new TreeNode(3);

        assertTrue(isSameTree(expected, result));
    }

    // Helper: compares two trees structurally and by value (same logic as
    // problem 100 - Same Tree), used here only to check invertTree's output.
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}