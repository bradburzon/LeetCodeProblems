import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringCompressionTest {

    private StringCompression stringCompression;

    @Before
    public void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    public void compress_SingleChar_returnOne() {
        char[] input = {'a'};

        int actual = stringCompression.compress(input);

        assertEquals(1, actual);
        assertArrayEquals(new char[]{'a'}, input);
    }

    @Test
    public void compress_RepeatedChars_returnCompressedLength() {
        char[] input = {'a', 'a', 'b', 'b', 'b'};

        int result = stringCompression.compress(input);

        assertEquals(4, result);
        assertArrayEquals(new char[]{'a', '2', 'b', '3'}, input);
    }

    @Test
    public void compress_MixedCharsWithSinglesAndMultiples_returnCompressedLength() {
        char[] input = {'a', 'a', 'b', 'c', 'c', 'c'};

        int result = stringCompression.compress(input);

        assertEquals(6, result);
        assertArrayEquals(new char[]{'a', '2', 'b', 'c', '3'}, input);
    }

    @Test
    public void compress_AllUnique_returnOriginalLength() {
        char[] input = {'a', 'b', 'c', 'd', 'e'};

        int result = stringCompression.compress(input);

        assertEquals(5, result);
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e'}, input);
    }

    @Test
    public void compress_EmptyArray_returnZero() {
        char[] input = {};

        int result = stringCompression.compress(input);

        assertEquals(0, result);
        assertArrayEquals(new char[]{}, input);
    }

    @Test
    public void compress_LongSequenceOfSameChar_returnCompressedLength() {
        char[] input = new char[100];
        Arrays.fill(input, 'a');

        int result = stringCompression.compress(input);

        assertEquals(3, result); // 'a' followed by '100'
        assertTrue(input[0] == 'a' && input[1] == '1' && input[2] == '0' && input[3] == '0');
    }
}