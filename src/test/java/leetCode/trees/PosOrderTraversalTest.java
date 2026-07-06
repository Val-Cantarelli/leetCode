package leetCode.trees;

import leetCode.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PosOrderTraversalTest {

    @Test
    void traversesTreeInPostorder() {
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

        PosOrderTraversal solution = new PosOrderTraversal();

        assertEquals(
                List.of(4, 5, 2, 3, 1),
                solution.postorderTraversal(root)
        );
    }
}