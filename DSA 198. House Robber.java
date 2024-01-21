// Date : 21th Jan 2024
// https://leetcode.com/problems/house-robber/?envType=daily-question&envId=2024-01-21

package DailyLeetcode;

public class DSA_198_House_Robber {

        public int rob(int[] nums) {
            int[] dp = new int[nums.length + 1];
            dp[0] = 0;
            dp[1] = nums[0];
            for(int i = 2; i <= nums.length; i++){
                int skipped = dp[i-1];
                int robbed = nums[i - 1] + dp[i - 2];
                dp[i] = Math.max(skipped, robbed);
            }
            int max = Integer.MIN_VALUE;
            for(int i = 0; i <dp.length; i++){
                max = Math.max(max, dp[i]);
            }
            return max;
        }

    public static void main(String[] args) {
            int[] nums={2,7,9,3,1};
        DSA_198_House_Robber obj = new DSA_198_House_Robber();
        System.out.println("Houses are robbed : "+obj.rob(nums));
    }

}
