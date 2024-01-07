// Date 07 Jan 2024
// https://leetcode.com/problems/arithmetic-slices-ii-subsequence/submissions/1139299646/

package com.Daily_DSA_Problems;
import java.util.HashMap;
import java.util.Map;

public class DSA_446_Arithmetic_Slices_2_Subsequence {
        public int numberOfArithmeticSlices(int[] nums) {
            int n = nums.length;
            int total = 0;

            // dp[i][j] represents the number of arithmetic subsequences ending at index i with difference j
            Map<Integer, Integer>[] dp = new Map[n];

            for (int i = 0; i < n; i++) {
                dp[i] = new HashMap<>();
                for (int j = 0; j < i; j++) {
                    long diff = (long) nums[i] - nums[j];

                    if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE)
                        continue;

                    int d = (int) diff;
                    int c1 = dp[i].getOrDefault(d, 0);
                    int c2 = dp[j].getOrDefault(d, 0);

                    // For every valid j, update the count of subsequences ending at i with difference d
                    dp[i].put(d, c1 + c2 + 1);

                    // Add the count to the total number of arithmetic subsequences
                    total += c2;
                }
            }

            return total;
        }

        public static void main(String[] args) {
            DSA_446_Arithmetic_Slices_2_Subsequence solution = new DSA_446_Arithmetic_Slices_2_Subsequence();
            int[] nums = {2, 4, 6, 8, 10};
            System.out.println(solution.numberOfArithmeticSlices(nums)); // Output: 7
        }
    }

