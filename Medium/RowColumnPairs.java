import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RowColumnPairs {
    public int equalPairs(int[][] grid) {
        int equalArrays = 0;
        int length = grid[0].length;
        for (int i = 0; i < length; i++) {
            List<Integer> row = getRow(i, grid);
            for (int j = 0; j < length; j++) {
                List<Integer> column = getColumn(j, grid);
                //System.out.println(row + " : " + column);
                if (row.equals(column)) {
                    equalArrays++;
                }
            }
        }

        return equalArrays;
    }

    public List<Integer> getColumn(int column, int[][] grid) {
        int length = grid[0].length;
        Integer[] array = new Integer[length];
        for (int row = 0; row < length; row++) {
            array[row] = grid[row][column];
        }
        return Arrays.asList(array);
    }

    public List<Integer> getRow(int row, int[][] grid) {
        List<Integer> array = new ArrayList<>();
        for (int n : grid[row]) {
            array.add(n);
        }
        return array;
    }
}