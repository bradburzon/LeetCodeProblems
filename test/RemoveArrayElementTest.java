import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveArrayElementTest {

    RemoveArrayElement removeArrayElement;

    @Before
    public void setup(){
        removeArrayElement = new RemoveArrayElement();
    }

    @Test
    public void removeElement_SingleElementArrayNoMatch_returnSizeArray(){
        int[] array = new int[]{1};

        int actual = removeArrayElement.removeElement(array, 2);

        assertEquals(1, actual);
    }

    @Test
    public void removeElement_SingleElementArrayWithMatch_ReturnsZero() {
        int[] array = {2};

        int actual = removeArrayElement.removeElement(array, 2);

        assertEquals(0, actual);
    }

    @Test
    public void removeElement_MultipleElementsNoMatch_ReturnsOriginalSize() {
        int[] array = {1, 2, 3, 4, 5};

        int actual = removeArrayElement.removeElement(array, 6);

        assertEquals(5, actual);
    }

    @Test
    public void removeElement_MultipleElementsWithMatch_ReturnsReducedSize() {
        int[] array = {3, 2, 2, 3};

        int actual = removeArrayElement.removeElement(array, 3);

        assertEquals(2, actual);
    }

    @Test
    public void removeElement_AllElementsMatch_ReturnsZero() {
        int[] array = {4, 4, 4, 4};

        int actual = removeArrayElement.removeElement(array, 4);

        assertEquals(0, actual);
    }

    @Test
    public void removeElement_EmptyArray_ReturnsZero() {
        int[] array = {};

        int actual = removeArrayElement.removeElement(array, 1);

        assertEquals(0, actual);
    }

    @Test
    public void removeElement_MultipleElementsSomeMatch_ReturnsCorrectSize() {
        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};

        int actual = removeArrayElement.removeElement(array, 2);

        assertEquals(5, actual);
    }
}