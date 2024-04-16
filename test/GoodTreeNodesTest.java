import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodTreeNodesTest {
    GoodTreeNodes goodTreeNodes;

    @Before
    public void setup() {
        goodTreeNodes = new GoodTreeNodes();
    }

    @Test
    public void goodNodes_SingleLeafRoot_ReturnOne() {
        TreeNode root = new TreeNode(1);

        int actual = goodTreeNodes.goodNodes(root);

        assertEquals(1, actual);
    }

  @Test
  public void goodNodes_AllGoodNodes_ReturnNumberOfTreeNode() {
    TreeNode root = new TreeNode(1,
            new TreeNode(1),
            new TreeNode(4)
    );
    int actual = goodTreeNodes.goodNodes(root);
    assertEquals(3, actual);
  }

  @Test
  public void goodNodes_SomeGoodNodes_ReturnNumberOfGoodNodes() {
    TreeNode root = new TreeNode(3,
            new TreeNode(1,
                    new TreeNode(5),
                    null
            ),
            new TreeNode(4,
                    new TreeNode(5),
                    null
            )
    );
    int actual = goodTreeNodes.goodNodes(root);
    assertEquals(4, actual);
  }

  @Test
  public void goodNodes_ComplexTreeNoGoodNode_ReturnOne() {
    TreeNode root = new TreeNode(3,
            new TreeNode(2,
                    new TreeNode(1),
                    new TreeNode(1)
            ),
            null
    );
    int actual = goodTreeNodes.goodNodes(root);
    assertEquals(1, actual);
  }

  @Test
  public void goodNodes_ComplexTree_ReturnNumberOfGoodNodes() {
    TreeNode root = new TreeNode(8,
            new TreeNode(3,
                    new TreeNode(1),
                    new TreeNode(6,
                            new TreeNode(4),
                            new TreeNode(7)
                    )
            ),
            new TreeNode(10,
                    null,
                    new TreeNode(14,
                            new TreeNode(13),
                            null
                    )
            )
    );
    int actual = goodTreeNodes.goodNodes(root);
    assertEquals(3, actual);
  }
}