// Date : 05 Jan 2024
// https://leetcode.com/problems/longest-increasing-subsequence/submissions/1137437811/?envType=daily-question&envId=2024-01-05
package com.Daily_DSA_Problems;

public class DSA_300_Longest_Increasing_Subsequence{


        public int lengthOfLIS(int[] nums) {
            int[] tails = new int[nums.length];
            int size = 0;
            for(int x : nums){
                int i=0, j=size;
                while(i!=j){
                    int m = (i+j)/2;
                    if(tails[m] < x)
                        i=m+1;
                    else
                        j=m;

                }
                tails[i]=x;
                if(i==size)
                    size++;
            }
            return size;
        }

    public static void main(String[] args) {
      // int[] nums = {10,9,2,5,3,7,101,18};
        int[] nums = {7,7,7,7,7,7,7};
        DSA_300_Longest_Increasing_Subsequence obj = new DSA_300_Longest_Increasing_Subsequence();
        System.out.println("Long Increment Subsequences : "+obj.lengthOfLIS(nums));;
    }
}
