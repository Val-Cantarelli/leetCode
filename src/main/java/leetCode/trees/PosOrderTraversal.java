package leetCode.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import leetCode.TreeNode;

/*
 * Pattern:
 * - DFS (Iterative)
 * Why DFS?
 * - Explore one subtree completely before exploring the next.
 * Data Structure:
 * - Stack (Deque<TreeNode>)
 * Core Invariant:
 * - The stack contains nodes discovered but not fully processed yet.
 * Complexity:
 * - Time: O(n)
 * - Space: O(h) average, O(n) worst case
 */


public class PosOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();
        Set<TreeNode> ready = new HashSet<>();

        if(root == null) return list;
        deque.push(root);

        while( !deque.isEmpty()){

            TreeNode currentNode = deque.pop();
            if((ready.contains(currentNode)) || (currentNode.left == null && currentNode.right == null)){
                list.add(currentNode.val);
            }
            else{
                deque.push(currentNode);
                if(currentNode. right != null) deque.push(currentNode. right);
                if(currentNode. left != null) deque.push(currentNode. left);
                ready.add(currentNode);
            }
        }
        return list;
    }
}
