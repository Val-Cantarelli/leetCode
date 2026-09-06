package drill;

import leetCode.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxHeightTreesTest {

    @Test
    void returnsZeroForEmptyTree() {
        MaxHeightTrees solution = new MaxHeightTrees();
        assertEquals(0, solution.maxHeightTrees(null));
    }

    @Test
    void returnsOneForSingleNode() {
        MaxHeightTrees solution = new MaxHeightTrees();
        TreeNode root = new TreeNode(1);
        assertEquals(1, solution.maxHeightTrees(root));
    }

    @Test
    void returnsThreeForUnbalancedTree() {
        // Tree from the exercise:
        //     3
        //    / \
        //   9   20
        //      /  \
        //     15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        MaxHeightTrees solution = new MaxHeightTrees();
        assertEquals(3, solution.maxHeightTrees(root));
    }

    @Test
    void returnsCorrectHeightForLeftSkewedTree() {
        // 1 -> 2 -> 3 (só filhos à esquerda)
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        MaxHeightTrees solution = new MaxHeightTrees();
        assertEquals(3, solution.maxHeightTrees(root));
    }
}