package drill;

import leetCode.TreeNode;

public class CountNodes {
    public int countNodes(TreeNode node){
    if(node == null) return 0;
    return 1 + countNodes(node.left) + countNodes(node.right);
    }
}

