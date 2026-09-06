package drill;

import leetCode.TreeNode;

public class MaxHeightTrees {
    public int maxHeightTrees(TreeNode node){
        if(node == null) return 0;
        return 1 + Math.max(maxHeightTrees(node.left), maxHeightTrees(node.right));
    }
}
