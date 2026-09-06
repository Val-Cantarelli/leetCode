package drill;

import leetCode.TreeNode;

public class FindTarget {
    public boolean findTarget (TreeNode node , int target){
        if(node == null) return false;
        if (node.val == target) return  true;
        if (node.val > target) return findTarget(node.left,target);
        return findTarget(node.right,target);
    }
}
