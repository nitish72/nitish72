// Date : 09th FEb 2024
// https://leetcode.com/problems/largest-divisible-subset/?envType=daily-question&envId=2024-02-09

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
         List<Integer> result = new ArrayList<>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        Arrays.sort(nums);

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        int maxSubsetSize = 1;
        int maxSubsetIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;

                    if (dp[i] > maxSubsetSize) {
                        maxSubsetSize = dp[i];
                        maxSubsetIndex = i;
                    }
                }
            }
        }

        int currentSize = maxSubsetSize;
        int currentElement = nums[maxSubsetIndex];

        for (int i = maxSubsetIndex; i >= 0; i--) {
            if (currentElement % nums[i] == 0 && dp[i] == currentSize) {
                result.add(nums[i]);
                currentElement = nums[i];
                currentSize--;
            }
        }

        return result;
    }
}
