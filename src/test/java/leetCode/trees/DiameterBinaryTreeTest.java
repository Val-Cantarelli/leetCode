package leetCode.trees;
import leetCode.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiameterBinaryTreeTest {

    private final DiameterBinaryTree solution = new DiameterBinaryTree();

    @Test
    void emptyTree_returnsZero() {
        assertEquals(0, solution.diameterBinaryTree(null));
    }

    @Test
    void singleNode_returnsZero() {
        TreeNode root = new TreeNode(1);
        assertEquals(0, solution.diameterBinaryTree(root));
    }

    @Test
    void diameterPassesThroughRoot() {

        //         1
        //        / \
        //       2   3
        //      / \
        //     4   5
        // 4 -> 2 -> 1 -> 3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        assertEquals(3, solution.diameterBinaryTree(root));
    }

    @Test
    void diameterDoesNotPassThroughRoot() {

        //             1
        //            /
        //           2
        //          / \
        //         3   4
        //        /     \
        //       5       6
        //  5 -> 3 -> 2 -> 4 -> 6 (4), root is not included
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        root.left.right.right = new TreeNode(6);

        assertEquals(4, solution.diameterBinaryTree(root));
    }

    @Test
    void skewedTree_linkedListShape() {
        // 1 -> 2 -> 3 -> 4
        //
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        assertEquals(3, solution.diameterBinaryTree(root));
    }
}