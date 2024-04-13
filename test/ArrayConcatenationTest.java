import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayConcatenationTest {
    ArrayConcatenation arrayConcatenation;

    @Before
    public void setup() {
        arrayConcatenation = new ArrayConcatenation();
    }

    @Test
    public void getConcatenation_EmptyArray_ReturnEmptyArray() {
        int[] actual = arrayConcatenation.getConcatenation(new int[0]);

        assertEquals(0, actual.length);
    }

    @Test
    public void getConcatenation_SingleElementArray_ReturnArrayWithTwoSimilarElement() {
        int[] array = new int[]{1};

        int[] actual = arrayConcatenation.getConcatenation(array);

        assertArrayEquals(new int[]{1, 1,}, actual);
    }

    @Test
    public void getConcatenation_MultipleElementArray_ReturnConcatenatedArrayToItself() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        int[] actual = arrayConcatenation.getConcatenation(array);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6}, actual);
    }
}