class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] hasZeros = new boolean[matrix.length + matrix[0].length];
        for (int i = 0; i < hasZeros.length; i++) {
            hasZeros[i] = false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    hasZeros[i] = true;
                    hasZeros[matrix.length + j] = true;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (hasZeros[i] || hasZeros[matrix.length + j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
