// Date : 26th Jan 2024
// https://leetcode.com/problems/out-of-boundary-paths/?envType=daily-question&envId=2024-01-26

class Solution {
    int mod = 1000000007;
    int[][][] dp;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return dfs(m, n, maxMove, startRow, startColumn);
    }
    public int dfs(int m, int n, int maxMove, int x, int y) {
        if (x < 0 || x >= m || y < 0 || y >= n) {
            return 1;
        }
        if (maxMove == 0) {
            return 0;
        }
        if (dp[x][y][maxMove] != -1) {
            return dp[x][y][maxMove];
        }
        int res = 0;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            res = (res + dfs(m, n, maxMove - 1, nx, ny)) % mod;
        }
        dp[x][y][maxMove] = res;
        return res;
        
    }
}
