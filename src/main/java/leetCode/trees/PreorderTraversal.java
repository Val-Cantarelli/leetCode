package leetCode.trees;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import leetCode.TreeNode;


/*
 * Pattern:
 * - DFS (Iterative)
 * Why DFS?
 * - Explore one subtree completely before exploring the next.
 * Data Structure:
 * - Stack (Deque<TreeNode>)
 * Core Invariant:
 * - The stack contains exactly the discovered but not yet processed nodes.
 * Complexity:
 * - Time: O(n)
 * - Space: O(h) average, O(n) worst case
 */

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();

       if(root == null){ return list;}
       deque.push(root);

       while (!deque.isEmpty()){
           TreeNode currentNode = deque.pop();
           list.add(currentNode.val);

           if(currentNode. right != null) deque.push(currentNode. right);
           if(currentNode. left != null) deque.push(currentNode. left);
       }
       return list;

    }

}
