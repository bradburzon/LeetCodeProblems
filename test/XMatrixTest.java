import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XMatrixTest {
    private XMatrix xMatrix;

    @Before
    public void setUp() {
        xMatrix = new XMatrix();
    }

    @Test
    public void checkXMatrix_EmptyMatrix_ReturnsTrue() {
        int[][] matrix = {};

        boolean actual = xMatrix.checkXMatrix(matrix);

        assertTrue(actual);
    }

    @Test
    public void checkXMatrix_ValidXMatrix_ReturnsTrue() {
        int[][] matrix = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}};

        boolean actual = xMatrix.checkXMatrix(matrix);

        assertTrue(actual);
    }

    @Test
    public void checkXMatrix_ValidNotXMatrix_ReturnsFalse() {
        int[][] matrix = {{1, 0, 1}, {0, 0, 0}, {1, 0, 1}};

        boolean actual = xMatrix.checkXMatrix(matrix);

        assertFalse(actual);
    }

    @Test(expected = RuntimeException.class)
    public void checkXMatrix_InvalidMatrix_ThrowsRuntimeException() {
        int[][] matrix = {{1, 0, 1}, {0, 0}, {1, 0, 1}};

        xMatrix.checkXMatrix(matrix);
    }
}