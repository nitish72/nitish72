// Date : 19th Jan 2024
// https://leetcode.com/problems/minimum-falling-path-sum/description/?envType=daily-question&envId=2024-01-19

class Solution {
    public int minFallingPathSum(int[][] matrix) {
         int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        for (int col = 0; col < cols; col++) {
            dp[0][col] = matrix[0][col];
        }
        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int topLeft = Integer.MAX_VALUE, top = dp[row - 1][col], topRight = Integer.MAX_VALUE;
                if (col - 1 >= 0) {
                    topLeft = dp[row - 1][col - 1];
                }
                if (col + 1 < cols) {
                    topRight = dp[row - 1][col + 1];
                }
                dp[row][col] = matrix[row][col] + Math.min(Math.min(topLeft, top),topRight);
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < cols; col++) {
            minSum = Math.min(minSum, dp[rows - 1][col]);
        }
        return minSum;
    }
}

