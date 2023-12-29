// Date 29th Dec 2023
//https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/description/?envType=daily-question&envId=2023-12-29

public class MinimumDifficulty {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) return -1;

        int[][] dp = new int[d + 1][n + 1];
        int maxVal = Integer.MAX_VALUE / 2;

        for (int i = 0; i <= d; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = maxVal;
            }
        }

        dp[0][0] = 0;

        for (int i = 1; i <= d; i++) {
            for (int j = 1; j <= n; j++) {
                int maxDifficulty = 0;

                for (int k = j - 1; k >= i - 1; k--) {
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[k]);
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + maxDifficulty);
                }
            }
        }

        return dp[d][n] == maxVal ? -1 : dp[d][n];
    }

    public static void main(String[] args) {
        MinimumDifficulty solution = new MinimumDifficulty();
        int[] jobDifficulty = {6, 5, 4, 3, 2, 1};
        int d = 2;
        int result = solution.minDifficulty(jobDifficulty, d);
        System.out.println("Minimum Difficulty: " + result);
    }
}

