package leetCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

// Follow up: Recursive solution is trivial, could you do it iteratively?ok
// Receive a root and return a List<Integer> inOrder transversal
public class InOrderTranversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Set<TreeNode> visitedNodes = new HashSet<>();

        if (root == null) return result;
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            if (visitedNodes.contains(currentNode)) {
                result.add(currentNode.val);
            } else {
                visitedNodes.add(currentNode);
                if (currentNode.right != null) stack.push(currentNode.right);
                stack.push(currentNode);
                if (currentNode.left != null) stack.push(currentNode.left);
            }
        }
        return result;
    }
}
