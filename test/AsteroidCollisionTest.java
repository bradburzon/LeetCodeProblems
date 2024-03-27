import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AsteroidCollisionTest {

    private AsteroidCollision asteroidCollision;

    @Before
    public void setUp() {
        asteroidCollision = new AsteroidCollision();
    }

    @Test
    public void asteroidCollision_TwoPositiveIntegerArray_ReturnSameArray() {
        int[] array = {1, 2};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(array, actual);
    }

    @Test
    public void asteroidCollision_PositiveAndNegative_OneCollision() {
        int[] array = {5, 10, -5};
        int[] expected = {5, 10};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollision_SameSize_BothExplode() {
        int[] array = {8, -8};
        int[] expected = {};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollision_MixedArray_ResultInPositive() {
        int[] array = {10, 2, -5};
        int[] expected = {10};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollision_EmptyArray_ReturnEmpty() {
        int[] array = {};
        int[] expected = {};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollision_SingleElement_ReturnSame() {
        int[] array = {-1};
        int[] expected = {-1};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollision_ComplexScenario_MultipleCollisions() {
        int[] array = {5, -2, -1, -2, -3};
        int[] expected = {5};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollision_SeriesOfNonCollisions_LeadingToNoExplosions() {
        int[] array = {-2, -1, 1, 2};
        int[] expected = {-2, -1, 1, 2};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void asteroidCollision_ComplexScenario_WithSurvivors() {
        int[] array = {1, -3, 2, -2};
        int[] expected = {-3};

        int[] actual = asteroidCollision.asteroidCollision(array);

        assertArrayEquals(expected, actual);
    }
}