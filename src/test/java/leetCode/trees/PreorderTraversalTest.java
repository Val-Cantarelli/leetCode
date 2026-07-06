package leetCode.trees;

import leetCode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PreorderTraversalTest {

    private final PreorderTraversal solution = new PreorderTraversal();

    @Test
    void returnsEmptyListWhenRootIsNull() {
        assertEquals(List.of(), solution.preorderTraversal(null));
    }

    @Test
    void returnsSingleNode() {
        TreeNode root = new TreeNode(1);

        assertEquals(List.of(1), solution.preorderTraversal(root));
    }

    @Test
    void traversesCompleteTreeInPreorder() {
        /*
              1
             / \
            2   3
           / \
          4   5
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        assertEquals(List.of(1, 2, 4, 5, 3), solution.preorderTraversal(root));
    }

    @Test
    void traversesLeftSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        assertEquals(List.of(1, 2, 3), solution.preorderTraversal(root));
    }

    @Test
    void traversesRightSkewedTree() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        assertEquals(List.of(1, 2, 3), solution.preorderTraversal(root));
    }

    @Test
    void traversesLeftChildWithRightBranch() {
        /*
            1
           /
          2
           \
            3
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);

        assertEquals(List.of(1, 2, 3), solution.preorderTraversal(root));
    }
}