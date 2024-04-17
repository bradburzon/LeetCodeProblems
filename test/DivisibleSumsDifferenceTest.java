import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisibleSumsDifferenceTest {
    DivisibleSumsDifference divisibleSumsDifference;

    @Before
    public void setUp() {
        divisibleSumsDifference = new DivisibleSumsDifference();
    }

    @Test
    public void differenceOfSums_AllDivisible_ReturnNegativeSumAllElements() {
        int actual = divisibleSumsDifference.differenceOfSums(10, 1);

        assertEquals(-55, actual);
    }

    @Test
    public void differenceOfSums_SomeDivisible_ReturnCorrectSum() {
        int actual = divisibleSumsDifference.differenceOfSums(10, 2);

        assertEquals(-5, actual);
    }

    @Test
    public void differenceOfSums_NoDivisible_ReturnPositiveSumAllElements() {
        int actual = divisibleSumsDifference.differenceOfSums(10, 11);

        assertEquals(55, actual);
    }
}