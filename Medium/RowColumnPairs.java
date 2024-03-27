public class RowColumnPairs {

    public int equalPairs(int[][] grid) {
        int equalPairsCount = 0;
        int gridSize = grid.length;

        for (int row = 0; row < gridSize; row++) {
            for (int col = 0; col < gridSize; col++) {
                if (isRowColumnEqual(row, col, grid)) {
                    equalPairsCount++;
                }
            }
        }
        return equalPairsCount;
    }

    private boolean isRowColumnEqual(int row, int col, int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[row][i] != grid[i][col]) {
                return false;
            }
        }
        return true;
    }
}