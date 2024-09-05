//05 Sep 2024
//Links - https://leetcode.com/problems/find-missing-observations/?envType=daily-question&envId=2024-09-05
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int totalSum = mean * (m + n);
        int currentSum = Arrays.stream(rolls).sum();
        int missingSum = totalSum - currentSum;

        if (missingSum < n || missingSum > 6 * n) {
            return new int[0];
        }

        int[] result = new int[n];
        Arrays.fill(result, missingSum / n);
        int remainder = missingSum % n;

        for (int i = 0; i < remainder; i++) {
            result[i]++;
        }

        return result;
    }
}
