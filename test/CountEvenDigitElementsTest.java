import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountEvenDigitElementsTest {
    CountEvenDigitElements countEvenDigitElements;

    @Before
    public void setUp() {
        countEvenDigitElements = new CountEvenDigitElements();
    }

    @Test
    public void findNumbers_EmptyArray_ReturnZero() {
        int[] array = new int[]{};

        int actual = countEvenDigitElements.findNumbers(array);

        assertEquals(0, actual);
    }

    @Test
    public void findNumbers_SingleDigitArray_ReturnZero() {
        int[] array = new int[]{1, 2, 7, 8, 9,};

        int actual = countEvenDigitElements.findNumbers(array);

        assertEquals(0, actual);
    }

    @Test
    public void findNumbers_DoubleDigitArray_ReturnLengthOfArray() {
        int[] array = new int[]{11, 34, 53, 34, 83, 90,};

        int actual = countEvenDigitElements.findNumbers(array);

        assertEquals(6, actual);
    }

    @Test
    public void findNumbers_IncreasingDigitLengthArray_ReturnCorrectNumberOfEvenDigit() {
        int[] array = new int[]{1, 34, 533, 348, 8375, 90573,};

        int actual = countEvenDigitElements.findNumbers(array);

        assertEquals(2, actual);
    }

    @Test
    public void findNumbers_MixedDigitLengthArray_ReturnCorrectNumberOfEvenDigit() {
        int[] array = new int[]{12, 4278, 7563, 3484, 3475,6543, 33, 3224, 9876, 312};

        int actual = countEvenDigitElements.findNumbers(array);

        assertEquals(9, actual);
    }
}