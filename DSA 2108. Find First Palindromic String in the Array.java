// Date : 13th Feb 2024
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/?envType=daily-question&envId=2024-02-13

class Solution {
    public String firstPalindrome(String[] words) {
          for (String s : words) {
            if (isPalindrome(s)) {
                return s;
            }
        }
        return ""; // or return null, depending on the problem requirements
    }

    private boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
