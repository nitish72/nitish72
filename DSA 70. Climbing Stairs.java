// Date : 18th Jan 2024
// https://leetcode.com/problems/climbing-stairs/description/?envType=daily-question&envId=2024-01-18

public class Solution{
  public int climbStairs(int n)  {
     int[] dp = new int[n+1];

    dp[0] = 1;
    dp[1] = 1;

    for(int i = 0; i<= n; i++) {
      dp[i] = dp[i-1] + dp[i-2];
     }
    return dp[n];
   }
}
