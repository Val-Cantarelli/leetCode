package leetCode;
import java.util.ArrayList;
import java.util.List;

// Receive a root and returns a List<Integer> in -order transversal
public class InOrderTranversal {



    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return null;

        //quando arvore acaba? node nao tem mais filhos

        // enquanto node.left != null: currentNode = curentNode.left
        // if currentNode.lef == null: add currentNode on list
        // if currentNode.right != null: add currentNode.right on list

        return list;

    }
}
