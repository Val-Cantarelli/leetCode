package drill;

import leetCode.TreeNode;

public class FindTarget2 {
    public boolean findTarget2(TreeNode node, int target){
        if(node == null) return false;
        if(node.val == target) return true;
        else{
            if(node.val > target){
                return findTarget2(node.left,target);
            }
            else return findTarget2(node.right,target);
        }
    }
}
