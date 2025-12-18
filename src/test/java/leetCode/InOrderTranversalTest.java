// Java
package leetCode;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class InOrderTranversalTest {

    @Test
    void testEmptyTree() {
        InOrderTranversal sut = new InOrderTranversal();
        List<Integer> result = sut.inorderTraversal(null);
        assertNotNull(result, "inorderTraversal should return an empty list (not null) for a null root");
        assertTrue(result.isEmpty(), "expected empty list for null root");
    }

    @Test
    void testSingleNode() {
        // tree: [1]
        TreeNode root = new TreeNode(1);
        InOrderTranversal sut = new InOrderTranversal();
        List<Integer> result = sut.inorderTraversal(root);
        assertEquals(Arrays.asList(1), result);
    }

    @Test
    void testClassicExample() {
        // tree:
        //   1
        //    \
        //     2
        //    /
        //   3
        // expected inorder: [1,3,2]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InOrderTranversal sut = new InOrderTranversal();
        List<Integer> result = sut.inorderTraversal(root);
        assertEquals(Arrays.asList(1, 3, 2), result);
    }
}
