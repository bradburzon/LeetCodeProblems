import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IncreasingTripletSubsequenceTest {

    IncreasingTripletSubsequence increasingTripletSubsequence;

    @Before
    public void setUp(){
        increasingTripletSubsequence = new IncreasingTripletSubsequence();
    }

    @Test
    public void increasingTriplet_emptyArray_returnFalse(){
        boolean actual = increasingTripletSubsequence.increasingTriplet(new int[]{});

        assertFalse(actual);
    }
    @Test
    public void increasingTriplet_singleElement_returnFalse() {
        boolean actual = increasingTripletSubsequence.increasingTriplet(new int[]{1});

        assertFalse(actual);
    }

    @Test
    public void increasingTriplet_twoElements_returnFalse() {
        boolean actual = increasingTripletSubsequence.increasingTriplet(new int[]{1, 2});

        assertFalse(actual);
    }

    @Test
    public void increasingTriplet_threeAscendingElements_returnTrue() {
        boolean actual = increasingTripletSubsequence.increasingTriplet(new int[]{1, 2, 3});

        assertTrue(actual);
    }

    @Test
    public void increasingTriplet_threeDescendingElements_returnFalse() {
        boolean actual = increasingTripletSubsequence.increasingTriplet(new int[]{3, 2, 1});

        assertFalse(actual);
    }

    @Test
    public void increasingTriplet_mixedElements_returnTrue() {
        boolean actual = increasingTripletSubsequence.increasingTriplet(new int[]{5, 1, 5, 5, 2, 5, 4});

        assertTrue(actual);
    }

    @Test
    public void increasingTriplet_noTripletSubsequence_returnFalse() {
        boolean actual = increasingTripletSubsequence.increasingTriplet(new int[]{10, 9, 4, 3, 2, 1});

        assertFalse(actual);
    }
}