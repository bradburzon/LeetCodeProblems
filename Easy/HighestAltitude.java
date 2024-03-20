public class HighestAltitude {

    public int largestAltitude(int[] gain) {
        int max = 0;
        int altitude = 0;
        for (int j : gain) {
            altitude += j;
            max = Math.max(max, altitude);
        }
        return max;
    }
}