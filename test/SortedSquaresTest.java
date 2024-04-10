import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSquaresTest {

    SortedSquares sortedSquares;

    @Before
    public void setup() {
        sortedSquares = new SortedSquares();
    }
    @Test
    public void sortedSquares_EmptyArray_ReturnEmptyArray() {
        int[] actual = sortedSquares.sortedSquares( new int[]{});

        assertArrayEquals( new int[]{}, actual);
    }


    @Test
    public void sortedSquares_SingleElementArray_ReturnSquaredElementInArray() {
        int[] array = new int[]{5};

        int[] actual = sortedSquares.sortedSquares(array);

        assertArrayEquals( new int[]{25}, actual);
    }

    @Test
    public void sortedSquares_NegativeArray_ReturnSortedSquares() {
        int[] array = new int[]{-1, -10, -17, -3, -11};

        int[] actual = sortedSquares.sortedSquares(array);

        assertArrayEquals( new int[]{1, 9, 100, 121, 289}, actual);
    }

    @Test
    public void sortedSquares_PositiveArray_ReturnSortedSquares() {
        int[] array = new int[]{1, 10, 17, 3, 11};

        int[] actual = sortedSquares.sortedSquares(array);

        assertArrayEquals( new int[]{1, 9, 100, 121, 289}, actual);
    }

    @Test
    public void sortedSquares_MixedArray_ReturnSortedSquares() {
        int[] array = new int[]{1, 10, -17, 3, -11, -15};

        int[] actual = sortedSquares.sortedSquares(array);

        assertArrayEquals( new int[]{1, 9, 100, 121, 225, 289}, actual);
    }
}