import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums){
        return Arrays.stream(nums).map(number -> number * number).sorted().toArray();
    }
}