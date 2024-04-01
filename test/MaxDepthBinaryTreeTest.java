import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDepthBinaryTreeTest {

    MaxDepthBinaryTree maxDepthBinaryTree;

    @Before
    public void setup(){
        maxDepthBinaryTree = new MaxDepthBinaryTree();
    }

    @Test
    public void maxDepth_EmptyTree_ReturnZero(){
        int actual = maxDepthBinaryTree.maxDepth(null);

        assertEquals(0, actual);
    }

    @Test
    public void maxDepth_SingleNodeTree_ReturnOne(){
        TreeNode tree = new TreeNode(1);

        int actual = maxDepthBinaryTree.maxDepth(tree);

        assertEquals(1, actual);
    }

    @Test
    public void maxDepth_MultipleLeftOnlyNodeTree_ReturnOne(){
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(1);
        TreeNode tree3 = new TreeNode(1);
        TreeNode tree4 = new TreeNode(1);
        tree1.left = tree2;
        tree2.left = tree3;
        tree3.left = tree4;

        int actual = maxDepthBinaryTree.maxDepth(tree1);

        assertEquals(4, actual);
    }
}