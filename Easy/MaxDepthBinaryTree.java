public class MaxDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        return maxDepthHelper(root);
    }

    private int maxDepthHelper(TreeNode root){
        if(root == null){
            return 0;
        } else {
            int left = maxDepthHelper(root.left);
            int right = maxDepthHelper(root.right);
            return 1 + Math.max(left, right);
        }
    }
}