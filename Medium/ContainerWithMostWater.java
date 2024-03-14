public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        if(height.length == 1){
            throw new RuntimeException("height length must be greater than 1");
        }
        int start = 0;
        int end = height.length - 1;
        int max = Integer.MIN_VALUE;

        while (start < end) {
            int lowest = Math.min(height[start], height[end]);
            int area = getArea(lowest, end - start);
            if (area > max) {
                max = area;
            }
            if (lowest == height[start]) {
                int oldStart = height[start];
                while (height[start] <= oldStart && start < end) {
                    start++;
                }
            } else {
                int oldEnd = height[end];
                while (height[end] <= oldEnd && end > start) {
                    end--;
                }
            }
        }
        return max;
    }

    public int getArea(int x, int y) {
        return x * y;
    }
}