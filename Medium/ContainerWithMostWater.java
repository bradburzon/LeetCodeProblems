public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (start < end) {
            int leftSide = height[start];
            int lowest = Math.min(leftSide, height[end]);
            int area = getArea(lowest, end - start);
            if (area > max) {
                max = area;
            }
            if (lowest == leftSide) {
               start++;
            } else {
              end--;
            }
        }
        return max;
    }

    private int getArea(int x, int y) {
        return x * y;
    }
}