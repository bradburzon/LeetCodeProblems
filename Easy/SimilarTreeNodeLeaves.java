import java.util.ArrayList;
import java.util.List;

public class SimilarTreeNodeLeaves {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1Leaves = getAllLeafNodes(root1);
        List<Integer> root2Leaves = getAllLeafNodes(root2);
        int root1LeavesSize = root1Leaves.size();
        int root2LeavesSize = root2Leaves.size();
        if (root1LeavesSize != root2LeavesSize) {
            return false;
        }
        for (int i = 0; i < root1LeavesSize; i++) {
            if (!root1Leaves.get(i).equals(root2Leaves.get(i))) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> getAllLeafNodes(TreeNode root) {
        List<Integer> leafNodes = new ArrayList<>();
        if (isLeaf(root)) {
            leafNodes.add(root.val);
        } else {
            if (root.left != null) leafNodes.addAll(getAllLeafNodes(root.left));
            if (root.right != null) leafNodes.addAll(getAllLeafNodes(root.right));
        }
        return leafNodes;
    }

    public boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}