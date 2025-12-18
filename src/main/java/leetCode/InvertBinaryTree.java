package leetCode;

public class InvertBinaryTree {


    public static SameTree.TreeNode invertTree(SameTree.TreeNode root) {

        //Case base: se for null, tem que fazer o swap mesmo assim
        //
        if(root == null) return null;
        //if(root.left == null && root.right == null) return root;

        // SWAP:
        SameTree.TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursion
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
