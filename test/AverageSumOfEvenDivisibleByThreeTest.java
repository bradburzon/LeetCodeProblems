import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AverageSumOfEvenDivisibleByThreeTest {
    AverageSumOfEvenDivisibleByThree averageSumOfEvenDivisibleByThree;

    @Before
    public void setUp() {
        averageSumOfEvenDivisibleByThree = new AverageSumOfEvenDivisibleByThree();
    }

    @Test
    public void averageValue_EmptyArray_ReturnZero() {
        int actual = averageSumOfEvenDivisibleByThree.averageValue(new int[]{});

        assertEquals(0, actual);
    }

    @Test
    public void averageValue_NonEvenArray_ReturnZero() {
        int actual = averageSumOfEvenDivisibleByThree.averageValue(new int[]{1, 3, 5, 7, 9});

        assertEquals(0, actual);
    }

    @Test
    public void averageValue_NonDivisibleByThreeArray_ReturnZero() {
        int actual = averageSumOfEvenDivisibleByThree.averageValue(new int[]{2, 4, 8, 10, 14, 16, 22});

        assertEquals(0, actual);
    }

    @Test
    public void averageValue_EvenAndDivisibleByThreeArray_ReturnCorrectAverage() {
        int actual = averageSumOfEvenDivisibleByThree.averageValue(new int[]{6, 12, 18, 36, 64});

        assertEquals(18, actual);
    }

    @Test
    public void averageValue_MixedArray_ReturnCorrectAverage() {
        int actual = averageSumOfEvenDivisibleByThree.averageValue(new int[]{6, 12, 9, 20, 24, 90});

        assertEquals(33, actual);
    }
}