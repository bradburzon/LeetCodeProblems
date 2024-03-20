import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HighestAltitudeTest {

    private HighestAltitude highestAltitude;

    @Before
    public void setUp(){
        highestAltitude = new HighestAltitude();
    }

    @Test
    public void largestAltitude_EmptyArray_ReturnZero(){
        int[] empty = new int[]{};

        int actual = highestAltitude.largestAltitude(empty);

        assertEquals(0, actual);
    }

    @Test
    public void largestAltitude_PositiveGain_ReturnsTotalSum(){
        int[] gain = {1, 2, 3, 4, 5};

        int actual = highestAltitude.largestAltitude(gain);

        assertEquals(15, actual);
    }

    @Test
    public void largestAltitude_NegativeGain_ReturnsZero(){
        int[] gain = {-5, -4, -3, -2, -1};

        int actual = highestAltitude.largestAltitude(gain);

        assertEquals(0, actual);
    }

    @Test
    public void largestAltitude_MixedGain_ReturnsHighestAltitude(){
        int[] gain = {-5, 1, -4, 10, 2, -1};

        int actual = highestAltitude.largestAltitude(gain);

        assertEquals(4, actual);
    }
}