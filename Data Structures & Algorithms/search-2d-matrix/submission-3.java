class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lower = 0;
        int higher = matrix.length - 1;
        int guess = 0;
        //matrix[guess][0] <= target && matrix[guess][matrix[0].length - 1] >= target
        while (lower <= higher) {
            guess = lower + (higher - lower) / 2;
            if (matrix[guess][0] > target) {
                higher = guess - 1;
            } else if (matrix[guess][matrix[0].length - 1] < target) {
                lower = guess + 1;
            } else {
                break;
            }
        }

        int row = guess;
        lower = 0;
        higher = matrix[0].length - 1;
        guess = lower + (higher - lower) / 2;
        while (lower <= higher) {
            if (matrix[row][guess] < target) {
                lower = guess + 1;
            } else if (matrix[row][guess] > target) {
                higher = guess - 1;
            } else {
                return true;
            }
            guess = lower + (higher - lower) / 2;

        }

        return false;
    }
}
