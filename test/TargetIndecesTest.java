import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TargetIndecesTest {
    TargetIndeces targetIndeces;

    @Before
    public void setUp() {
        targetIndeces = new TargetIndeces();
    }

    @Test
    public void targetIndeces_EmptyArray_ReturnEmptyArray() {
        int[] actual = targetIndeces.targetIndeces(new int[]{}, 3);

        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    public void targetIndeces_NoEqualToTarget_ReturnEmptyArray() {
        int[] actual = targetIndeces.targetIndeces(new int[]{11, 2, 4, 54, 6,}, 3);

        assertArrayEquals(new int[]{}, actual);
    }

    @Test
    public void targetIndeces_OneEqualToTarget_ReturnIndexOfEqualElement() {
        int[] actual = targetIndeces.targetIndeces(new int[]{11, 2, 4, 54, 6}, 6);

        assertArrayEquals(new int[]{2}, actual);
    }

    @Test
    public void targetIndeces_ManyEqualToTarget_ReturnCorrectIndeces() {
        int[] actual = targetIndeces.targetIndeces(new int[]{1, 2, 5, 2, 3}, 2);

        assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    public void targetIndeces_MixedArrayTarget_ReturnCorrectIndeces() {
        int[] actual = targetIndeces.targetIndeces(new int[]{1, 2, 5, 2, 3}, 5);

        assertArrayEquals(new int[]{4}, actual);
    }
}