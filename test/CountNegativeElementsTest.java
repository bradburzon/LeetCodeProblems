import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountNegativeElementsTest {
    CountNegativeElements countNegativeElements;

    @Before
    public void setup() {
        countNegativeElements = new CountNegativeElements();
    }

    @Test
    public void countNegatives_AllZeroElementDoubleArray_ReturnZero(){
        int[][] grid = new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}};

        int actual = countNegativeElements.countNegatives(grid);

        assertEquals(0, actual);
    }

    @Test
    public void countNegatives_AllNegativeElementDoubleArray_ReturnAllElementCount(){
        int[][] grid = new int[2][2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = -1;
            }
        }

        int actual = countNegativeElements.countNegatives(grid);

        assertEquals(4, actual);
    }

    @Test
    public void countNegatives_AllPositiveElementDoubleArray_ReturnZero(){
        int[][] grid = new int[2][2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = 1;
            }
        }

        int actual = countNegativeElements.countNegatives(grid);

        assertEquals(0, actual);
    }

    @Test
    public void countNegatives_MixedElementDoubleArray_ReturnZero(){
        int[][] grid = new int[5][5];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = j - i - 1;
            }
        }

        int actual = countNegativeElements.countNegatives(grid);

        assertEquals(15, actual);
    }
}