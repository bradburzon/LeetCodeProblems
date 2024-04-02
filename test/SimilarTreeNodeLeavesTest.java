import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimilarTreeNodeLeavesTest {

    SimilarTreeNodeLeaves similarTreeNodeLeaves;

    @Before
    public void setup(){
        similarTreeNodeLeaves = new SimilarTreeNodeLeaves();
    }

    @Test
    public void leafSimilar_SimilarSingleNodeTree_ReturnTrue() {
        TreeNode tree1 = new TreeNode(1);
    boolean actual = similarTreeNodeLeaves.leafSimilar(tree1, tree1);

        assertTrue(actual);
    }

    @Test
    public void leafSimilar_DifferentSingleNodeTree_ReturnFalse() {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(2);
        boolean actual = similarTreeNodeLeaves.leafSimilar(tree1, tree2);

        assertFalse(actual);
    }

    @Test
    public void leafSimilar_MultipleLeaves_ReturnCorrectComparison() {
        TreeNode tree1 = new TreeNode(1);
        TreeNode tree2 = new TreeNode(2);
        TreeNode tree3 = new TreeNode(3, tree2, tree1);
        TreeNode tree4 = new TreeNode(4);
        TreeNode tree6 = new TreeNode(6);
        TreeNode tree5 = new TreeNode(5, tree4, tree6);

        boolean actual = similarTreeNodeLeaves.leafSimilar(tree3, tree5);

        assertFalse(actual);
    }

    @Test
    public void leafSimilar_DeepUniqueTree_ReturnCorrectComparison() {
        TreeNode tree7 = new TreeNode(7);
        TreeNode tree8 = new TreeNode(8);
        TreeNode tree3 = new TreeNode(3, tree7, tree8);
        TreeNode tree9 = new TreeNode(9);
        TreeNode tree2 = new TreeNode(2, tree9, tree3);
        TreeNode treeRoot1 = new TreeNode(1, tree2, null);

        TreeNode tree10 = new TreeNode(10);
        TreeNode tree11 = new TreeNode(11);
        TreeNode tree5 = new TreeNode(5, tree10, tree11);
        TreeNode tree12 = new TreeNode(12);
        TreeNode tree4 = new TreeNode(4, tree12, tree5);
        TreeNode tree13 = new TreeNode(13);
        TreeNode treeRoot2 = new TreeNode(6, tree13, tree4);

        boolean actual = similarTreeNodeLeaves.leafSimilar(treeRoot1, treeRoot2);

        assertFalse(actual);
    }

    @Test
    public void leafSimilar_DeepUniqueTreeWithSimilarLeaves_ReturnTrue() {
        TreeNode tree7 = new TreeNode(7);
        TreeNode tree8 = new TreeNode(8);
        TreeNode tree3 = new TreeNode(3, tree7, tree8);
        TreeNode tree9 = new TreeNode(9);
        TreeNode tree2 = new TreeNode(2, tree9, tree3);
        TreeNode treeRote1 = new TreeNode(1, tree2, null);

        TreeNode tree10 = new TreeNode(10, new TreeNode(9), new TreeNode(7));
        TreeNode tree11 = new TreeNode(11, null, new TreeNode(8));
        TreeNode tree5 = new TreeNode(5, tree10, tree11);
        TreeNode tree4 = new TreeNode(4, null, tree5);
        TreeNode treeRoot2 = new TreeNode(6,  tree4, null);

        boolean actual = similarTreeNodeLeaves.leafSimilar(treeRote1, treeRoot2);

        assertTrue(actual);
    }
}