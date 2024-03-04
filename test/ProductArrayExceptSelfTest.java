import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductArrayExceptSelfTest {

    ProductArrayExceptSelf productArrayExceptSelf;

    @Before
    public void setUp() {
        productArrayExceptSelf = new ProductArrayExceptSelf();
    }

    @Test
    public void productExceptSelf_EmptyArray_ReturnEmptyArray() {
        int[] actual = productArrayExceptSelf.productExceptSelf(new int[0]);

        assertEquals(new int[0].length, actual.length);
    }

    @Test
    public void productExceptSelf_TwoElements_ReturnProductOfEachOther() {
        int[] actual = productArrayExceptSelf.productExceptSelf(new int[]{1, 2});

        assertArrayEquals(new int[]{2, 1}, actual);
    }

    @Test
    public void productExceptSelf_MultipleElementsIncludingZero_ReturnCorrectProduct() {
        int[] actual = productArrayExceptSelf.productExceptSelf(new int[]{0, 1, 2, 3, 4});

        assertArrayEquals(new int[]{24, 0, 0, 0, 0}, actual);
    }

    @Test
    public void productExceptSelf_MultipleElementsNoZero_ReturnCorrectProduct() {
        int[] actual = productArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{24, 12, 8, 6}, actual);
    }

    @Test
    public void productExceptSelf_MultipleZeros_ReturnAllZeros() {
        int[] actual = productArrayExceptSelf.productExceptSelf(new int[]{0, 0, 1, 2});

        assertArrayEquals(new int[]{0, 0, 0, 0}, actual);
    }
}