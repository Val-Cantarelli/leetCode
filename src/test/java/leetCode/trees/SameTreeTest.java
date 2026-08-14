package leetCode.trees;

import leetCode.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SameTreeTest {

    private final SameTree solution = new SameTree();

    @Test
    void bothNull_returnsTrue() {
        assertTrue(solution.isSameTree(null, null));
    }

    @Test
    void oneNullOneNot_returnsFalse() {
        TreeNode p = new TreeNode(1);
        assertFalse(solution.isSameTree(p, null));
        assertFalse(solution.isSameTree(null, p));
    }

    @Test
    void singleNodeSameValue_returnsTrue() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    void singleNodeDifferentValue_returnsFalse() {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);
        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    void identicalTrees_returnsTrue() {
        //     1            1
        //    / \          / \
        //   2   3        2   3
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        assertTrue(solution.isSameTree(p, q));
    }

    @Test
    void sameValuesDifferentStructure_returnsFalse() {
        // p:      1        q:      1
        //        /                  \
        //       2                    2
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);

        TreeNode q = new TreeNode(1);
        q.right = new TreeNode(2);

        assertFalse(solution.isSameTree(p, q));
    }

    @Test
    void sameStructureDifferentDeepValue_returnsFalse() {
        //     1            1
        //    / \          / \
        //   2   3        2   9
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(9);

        assertFalse(solution.isSameTree(p, q));
    }
}