package leetCode.trees;
import leetCode.TreeNode;

public class DiameterBinaryTree {
    Integer globalMax =0;

    public int diameterBinaryTree(TreeNode root){
        depth(root);
        return globalMax;

    }
    private int depth(TreeNode node){
        if(node == null)return 0;

        int leftDepth = depth(node.left);
        int rightDepth = depth(node.right);

        int diameter = leftDepth + rightDepth;

        if (diameter>globalMax){globalMax = diameter;}


        return Math.max(leftDepth, rightDepth)+1;

    }
}
