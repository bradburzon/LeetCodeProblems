import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerProductSumDifferenceTest {
    IntegerProductSumDifference integerProductSumDifference;

    @Before
    public void setUp() {
        integerProductSumDifference = new IntegerProductSumDifference();
    }

    @Test
    public void subtractProductAndSum_SingleDigit_ReturnZero() {
        int actual = integerProductSumDifference.subtractProductAndSum(1);

        assertEquals(0, actual);
    }

    @Test
    public void subtractProductAndSum_AnotherSingleDigit_ReturnZero() {
        int actual = integerProductSumDifference.subtractProductAndSum(9);

        assertEquals(0, actual);
    }

    @Test
    public void subtractProductAndSum_DoubleDigit_ReturnCorrectDifference() {
        int actual = integerProductSumDifference.subtractProductAndSum(55);

        assertEquals(15, actual);
    }

    @Test
    public void subtractProductAndSum_MultipleSimilarDigit_ReturnCorrectDifference() {
        int actual = integerProductSumDifference.subtractProductAndSum(55555);

        assertEquals(3100, actual);
    }

    @Test
    public void subtractProductAndSum_MixedDigits_ReturnCorrectDifference() {
        int actual = integerProductSumDifference.subtractProductAndSum(4421);

        assertEquals(21, actual);
    }
}