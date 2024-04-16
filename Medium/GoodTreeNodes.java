public class GoodTreeNodes {
    public int goodNodes(TreeNode root) {
        int max = root.val;
        return 1 + goodNodesHelper(root.left, max) + goodNodesHelper(root.right, max);
    }

    private int goodNodesHelper(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int goodNode = root.val >= max ? 1 : 0;
        if (isLeaf(root)) {
            return goodNode;
        }
        max = Math.max(root.val, max);
        if (root.right == null) {
            if (root.left.val >= max) {

                return goodNode + goodNodesHelper(root.left, max);
            }
        } else if (root.left == null) {
            if (root.right.val >= max) {
                return goodNode + goodNodesHelper(root.right, max);
            }
        }
        return goodNode + goodNodesHelper(root.left, max) + goodNodesHelper(root.right, max);
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}