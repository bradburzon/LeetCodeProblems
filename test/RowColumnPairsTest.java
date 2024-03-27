import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RowColumnPairsTest {

    private RowColumnPairs rowColumnPairs;

    @Before
    public void setUp() {
        rowColumnPairs = new RowColumnPairs();
    }

    @Test
    public void equalPairs_NoEqualPairs_ReturnsZero() {
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        assertEquals(0, rowColumnPairs.equalPairs(grid));
    }

    @Test
    public void equalPairs_MultipleEqualPairs_ReturnsCorrectCount() {
        int[][] grid = {
                {1, 2, 1},
                {2, 1, 2},
                {1, 2, 1}
        };

        int actual = rowColumnPairs.equalPairs(grid);

        assertEquals(5, actual);
    }

    @Test
    public void equalPairs_SingleElementGrid_ReturnsOne() {
        int[][] grid = {
                {1}
        };

        int actual = rowColumnPairs.equalPairs(grid);

        assertEquals(1, actual);
    }

    @Test
    public void equalPairs_LargerGridWithNoEqualPairs_ReturnsZero() {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }
        ;
        int actual = rowColumnPairs.equalPairs(grid);

        assertEquals(0, actual);
    }

    @Test
    public void equalPairs_GridWithOneEqualRowColumnPair_ReturnsOne() {
        int[][] grid = {
                {1, 2},
                {2, 1}
        };

        int actual = rowColumnPairs.equalPairs(grid);

        assertEquals(2, actual);
    }

    @Test
    public void equalPairs_ComplexGridWithMultipleEqualPairs_ReturnsCorrectCount() {
        int[][] grid = {
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2},
                {2, 1, 1, 1}
        };

        int actual = rowColumnPairs.equalPairs(grid);

        assertEquals(0, actual);
    }
}