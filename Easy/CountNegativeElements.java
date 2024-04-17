public class CountNegativeElements {

    public int countNegatives(int[][] grid){
        int negativeNumbers = 0;
        for (int[] row : grid) {
            for (int element : row) {
                if (element < 0) {
                    negativeNumbers++;
                }
            }
        }
        return negativeNumbers;
    }
}