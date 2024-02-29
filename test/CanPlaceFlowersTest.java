import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CanPlaceFlowersTest {

	private static CanPlaceFlowers canPlaceFlowers;

	@Before
	public void setUp() {
		canPlaceFlowers = new CanPlaceFlowers();
	}

	@Test
	public void CanPlaceFlowers_ZeroExtra_ReturnTrue() {
		int extra = 0;
		int[] flowerbed = { 0, 1 };

		boolean actual = canPlaceFlowers.canPlaceFlowers(flowerbed, extra);

		assertTrue(actual);
	}

	@Test
	public void CanPlaceFlowers_EmptyBedOneFlower_ReturnTrue() {
		int extra = 1;
		int[] flowerbed = { 0 };

		boolean actual = canPlaceFlowers.canPlaceFlowers(flowerbed, extra);

		assertTrue(actual);
	}

	@Test
	public void CanPlaceFlowers_OneFlowerWithSpaceAvailable_ReturnTrue() {
		int extra = 1;
		int[] flowerbed = { 1, 0, 0, 0, 1 };

		boolean actual = canPlaceFlowers.canPlaceFlowers(flowerbed, extra);

		assertTrue(actual);
	}

	@Test
	public void CanPlaceFlowers_TwoFlowersWithSpaceAvailable_ReturnTrue() {
		int extra = 2;
		int[] flowerbed = { 1, 0, 0, 0, 1, 0, 0 };

		boolean actual = canPlaceFlowers.canPlaceFlowers(flowerbed, extra);

		assertTrue(actual);
	}

	@Test
	public void CanPlaceFlowers_TwoFlowersWithSpaceUnavailable_ReturnFalse() {
		int extra = 2;
		int[] flowerbed = { 1, 0, 0, 1, 0 };

		boolean actual = canPlaceFlowers.canPlaceFlowers(flowerbed, extra);

		assertFalse(actual);
	}

	@Test
	public void CanPlaceFlowers_FullBedNoSpace_ReturnFalse() {
		int extra = 1;
		int[] flowerbed = { 1, 1, 1, 1, 1 };

		boolean actual = canPlaceFlowers.canPlaceFlowers(flowerbed, extra);

		assertFalse(actual);
	}
}
