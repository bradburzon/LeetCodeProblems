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
    }

    @Test
    public void compress_MixedCharsWithSinglesAndMultiples_returnCompressedLength() {
        char[] input = {'a', 'a', 'b', 'c', 'c', 'c'};

        int result = stringCompression.compress(input);

        assertEquals(5, result);
    }

    @Test
    public void compress_AllUnique_returnOriginalLength() {
        char[] input = {'a', 'b', 'c', 'd', 'e'};

        int result = stringCompression.compress(input);

        assertEquals(5, result);
    }

    @Test
    public void compress_LongSequenceOfSameChar_returnCompressedLength() {
        char[] input = new char[100];
        Arrays.fill(input, 'a');

        int result = stringCompression.compress(input);

        assertEquals(4, result); // 'a' followed by '100'
    }
}