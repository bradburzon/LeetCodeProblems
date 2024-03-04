import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int[] productArray = new int[nums.length];

		int zeroNumber = Arrays.stream(nums).boxed().toList().stream().reduce(0,
				(a, b) ->  b == 0 ? a + 1 : a);
		System.out.println(zeroNumber);
		int y = Arrays.stream(nums).boxed().toList().stream().reduce(1, (a, b) -> a * b);

		for(int i = 0; i < nums.length; i++) {
//			productArray[i] = y / nums[i];
		}

		return productArray;
	}

	public static void main(String[] args) {
		ProductArrayExceptSelf productArrayExceptSelf = new ProductArrayExceptSelf();
		int[] newInt = {  0 , 4 , 0, 0 };

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

		for (int n : productArrayExceptSelf.productExceptSelf(newInt)) {
			System.out.println(n);
		}

	}

}
