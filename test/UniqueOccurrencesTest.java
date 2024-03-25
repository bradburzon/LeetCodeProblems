import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueOccurrencesTest {

    UniqueOccurrences uniqueOccurrences;

    @Before
    public void setUp() {
        uniqueOccurrences = new UniqueOccurrences();
    }

    @Test
    public void uniqueOccurrences_EmptyArray_ReturnsTrue() {
        int[] arr = {};
        
        assertTrue(uniqueOccurrences.uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrences_SingleElementArray_ReturnsTrue() {
        int[] arr = {1};
        
        assertTrue(uniqueOccurrences.uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrences_ArrayWithNonRepeatingUniqueElement_ReturnsFalse() {
        int[] arr = {1, 2, 3, 4, 5};
        
        assertFalse(uniqueOccurrences.uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrences_ArrayWithUniqueOccurrenceOfRepetition_ReturnsTrue() {
        int[] arr = {1, 2, 2, 3, 3, 3};
        
        assertTrue(uniqueOccurrences.uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrences_ArrayWithNegativeUniqueNonRepeatingNumbers_ReturnsFalse() {
        int[] arr = {-1, -2, -3, -4, -5};
        
        assertFalse(uniqueOccurrences.uniqueOccurrences(arr));
    }

    @Test
    public void uniqueOccurrences_ArrayWithTwoElementsWithSameOccurrence_ReturnsFalse() {
        int[] arr = {1, 1, 2, 2, 3, 3, 3};
        
        assertFalse(uniqueOccurrences.uniqueOccurrences(arr));
    }
}