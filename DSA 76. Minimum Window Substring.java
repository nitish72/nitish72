// Date : 04 Jan 2024
// https://leetcode.com/problems/minimum-window-substring/submissions/1165664779/?envType=daily-question&envId=2024-02-04

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return "";
        }

        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetFreq.put(c, targetFreq.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int requiredChars = targetFreq.size();
        int formedChars = 0;

        Map<Character, Integer> windowFreq = new HashMap<>();
        int[] result = {-1, 0, 0}; // length, start, end

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowFreq.put(currentChar, windowFreq.getOrDefault(currentChar, 0) + 1);

            if (targetFreq.containsKey(currentChar) && windowFreq.get(currentChar).equals(targetFreq.get(currentChar))) {
                formedChars++;
            }

            while (formedChars == requiredChars) {
                int currentLength = right - left + 1;

                if (result[0] == -1 || currentLength < result[0]) {
                    result[0] = currentLength;
                    result[1] = left;
                    result[2] = right + 1;
                }

                char leftChar = s.charAt(left);
                windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);

                if (targetFreq.containsKey(leftChar) && windowFreq.get(leftChar) < targetFreq.get(leftChar)) {
                    formedChars--;
                }

                left++;
            }

            right++;
        }

        return result[0] == -1 ? "" : s.substring(result[1], result[2]);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t)); // Output: "BANC"
    }
}
