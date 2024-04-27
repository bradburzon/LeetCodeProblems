import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SmallerCountThanCurrentElementTest {
    SmallerCountThanCurrentElement smallerCountThanCurrentElement;

    @Before
    public void setUp() {
        smallerCountThanCurrentElement = new SmallerCountThanCurrentElement();
    }

    @Test
    public void smallerNumbersThanCurrent_EmptyArray_ReturnEmpty() {
        int[] actual = smallerCountThanCurrentElement.smallerNumbersThanCurrent(new int[]{});

        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    public void smallerNumbersThanCurrent_IncreasingArray_ReturnIncreasingArray() {
        int[] actual = smallerCountThanCurrentElement.smallerNumbersThanCurrent(new int[]{1, 2, 3, 4, 5});

        assertArrayEquals(new int[]{0, 1, 2,3,4}, actual);
    }

    @Test
    public void smallerNumbersThanCurrent_DecreasingArray_ReturnDecreasingArray() {
        int[] actual = smallerCountThanCurrentElement.smallerNumbersThanCurrent(new int[]{10, 8, 5, 3, 1});

        assertArrayEquals(new int[]{4, 3, 2, 1, 0}, actual);
    }

    @Test
    public void smallerNumbersThanCurrent_Mixed_ReturnCorrectCountArray() {
        int[] actual = smallerCountThanCurrentElement.smallerNumbersThanCurrent(new int[]{10, 81, 15, 3, 12});

        assertArrayEquals(new int[]{1, 4, 3, 0, 2}, actual);
    }
}