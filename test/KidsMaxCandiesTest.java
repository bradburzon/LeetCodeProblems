import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;
import java.util.Arrays;

public class KidsMaxCandiesTest {

	KidsMaxCandies kidMaxCandies = new KidsMaxCandies();

	@Test
	public void kidsWithCandies_emptyArray_ReturnEmptyArray() {
		int[] empty = {};
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(empty, 0);
		
		assertEquals(Arrays.asList(), actual);
	}

	@Test
	public void kidsWithCandies_singleChild_ReturnTrue() {
		int[] candies = { 5 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 3);
		
		assertEquals(Arrays.asList(true), actual);
	}

	@Test
	public void kidsWithCandies_multipleChildren_SomeCanHaveMax() {
		int[] candies = { 2, 3, 5, 1, 3 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 3);
		
		assertEquals(Arrays.asList(true, true, true, false, true), actual);
	}

	@Test
	public void kidsWithCandies_noChildCanHaveMax_ReturnAllFalse() {
		int[] candies = { 4, 2, 1, 1, 2 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 1);
		
		assertEquals(Arrays.asList(false, false, false, false, false), actual);
	}

	@Test
	public void kidsWithCandies_extraCandiesMakeAllMax_ReturnAllTrue() {
		int[] candies = { 1, 2, 3, 4, 5 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 10);
		
		assertEquals(Arrays.asList(true, true, true, true, true), actual);
	}

	@Test
	public void kidsWithCandies_allChildrenEqual_ReturnAllTrue() {
		int[] candies = { 3, 3, 3, 3 };
		List<Boolean> actual = kidMaxCandies.kidsWithCandies(candies, 0);
		
		assertEquals(Arrays.asList(true, true, true, true), actual);
	}
}