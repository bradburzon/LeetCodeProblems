public class XMatrix {

    public boolean checkXMatrix(int[][] matrix) {

        int length = matrix.length;
        for(int[] row : matrix){
            if(row.length != length){
                throw new RuntimeException("Invalid matrix");
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int matrixVal = matrix[i][j];
                if (i == j || i == length - 1 - j) {
                    if (matrixVal == 0) {
                        return false;
                    }
                } else {
                    if (matrixVal != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}