// Date: 14th March 2024
// https://leetcode.com/problems/binary-subarrays-with-sum/?envType=daily-question&envId=2024-03-14

//Prefix Sum : SC - O(n)
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            if (sum == goal){
                count++;
            }
            if (map.containsKey(sum - goal)){
                count += map.get(sum - goal);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
